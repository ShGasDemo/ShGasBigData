package org.shGasUsage.dao.hive;

import org.shGasUsage.entity.FeedTypeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dengcunbin on 17/6/21.
 */
@Repository
public class FeedTypeDao {


    //执行普通的sql查询
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //枚举查询类别
    public enum QueryType{
        feedType,//反映类别
        feedArea,//反映区名
        feedYear;//反映年份
    }

    /**
     * 获取所有话务的各个反映类别种类的数据
     * @return
     */
    public List<FeedTypeEntity> getFeedTypeData(QueryType queryType,String feedArea){
        RowMapper<FeedTypeEntity> rowMapper = new BeanPropertyRowMapper<FeedTypeEntity>(FeedTypeEntity.class);
        //年份List
        List<Integer> yearList = new ArrayList<Integer>(Arrays.asList(2012,2013,2014,2015,2016,2017));
        //初始化反应类别种类的List
        List<FeedTypeEntity> feedTypeResultList = initFeedTypeEntity(queryType);
        //根据年份查询
        for (Integer year : yearList){
            //查询语句
            String querySqlStr = getQuerySqlStr(queryType,year,feedArea);
            //查询结果
            List<FeedTypeEntity> feedTypeList = jdbcTemplate.query(querySqlStr,rowMapper);
            //对结果进行处理
            for (FeedTypeEntity feedTypeEntity : feedTypeList){
                for (FeedTypeEntity feedTypeResultEntity: feedTypeResultList){
                    if (queryType.equals(QueryType.feedYear)){
                        if (feedTypeResultEntity.getFeedYear().equals(feedTypeEntity.getFeedYear())){
                            feedTypeResultEntity.setFeedNumber(feedTypeEntity.getFeedNumber());
                        }
                    }
                    else
                        if (feedTypeResultEntity.getFeedType().equals(feedTypeEntity.getFeedType())){
                            feedTypeResultEntity.setFeedTypeNum(feedTypeResultEntity.getFeedTypeNum()+feedTypeEntity.getFeedTypeNum());
                    }
                }
            }
        }
        return feedTypeResultList;
    }

    /**
     * 初始化反应类别种类的List
     * @return
     */
    private List<FeedTypeEntity> initFeedTypeEntity(QueryType queryType){
        List<FeedTypeEntity> feedTypeResultList = new ArrayList<FeedTypeEntity>();
        switch (queryType){
            case feedType:
            case feedArea:
                for (Integer i = 0; i < 8; i++) {
                    feedTypeResultList.add(new FeedTypeEntity(i, 0));
                }
                break;
            case feedYear:
                for (Integer i = 2012;i<2018;i++){
                    feedTypeResultList.add(new FeedTypeEntity(i));
                }
                break;
        }
        return feedTypeResultList;
    }

    /**
     * 获取查询语句
     * @param queryType 查询的类别
     * @param year 年份
     * @param feedArea 区名
     * @return
     */
    private String getQuerySqlStr(QueryType queryType,Integer year,String feedArea){
        switch (queryType){
            case feedType:
                return String.format("select fy_leibie_type as feedType, count(fy_leibie_type) as feedTypeNum from hotxx_%d where fy_leibie_type between 0 and 7 group by fy_leibie_type order by fy_leibie_type",year);
            case feedArea:
                return String.format("select fy_leibie_type as feedType, count(fy_leibie_type) as feedTypeNum from hotxx_%d where fy_leibie_type between 0 and 7 and fy_quming = \"%s\" group by fy_leibie_type order by fy_leibie_type",year,feedArea);
            case feedYear:
                return String.format("select year(create_time) as feedYear, count(*) as feedNumber from hotxx_%d group by year(create_time)",year);
        }
        return null;
    }
}

