package org.shGasUsage.service.impl;

import org.shGasUsage.dao.mysql.UsageDao;
import org.shGasUsage.entity.UsageEntity;
import org.shGasUsage.service.UsageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dengcunbin on 17/6/5.
 */
@Service
public class UsageServiceImpl implements UsageService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UsageDao usageDao;

    //获取用气量的用户数
    public List<List> getUsageGasNum(){
        List<List> UsageGasNum = new ArrayList<List>();

        for (Integer i = 2014; i <2017; i++){
            List<UsageEntity> usageEntityList = usageDao.findUsageGasNum(i);
            List<List> usageIntegerList = new ArrayList<List>();
            for (Integer j = 0; j< usageEntityList.size(); j++){
                UsageEntity u = usageEntityList.get(j);
                List<Integer> list = new ArrayList<Integer>();
                list.add(u.getUsageGas());
                list.add(u.getUsageNum());
                usageIntegerList.add(list);
            }
            UsageGasNum.add(usageIntegerList);
        }
        return UsageGasNum;
    }

    //获取用气量
    public List<Integer> getUsageGas(){
        return usageDao.findUsageGas();
    }

    //获取公司的用气量的数目
    public List<List> getUsageCompanyGasNum(){
        List<List> UsageCompanyGasNum = new ArrayList<List>();
        for (Integer i = 2014; i <2017; i++){
            int temp[] = new int[10];
            List<String> data = usageDao.findUsageCompanyGasNum(i);
            for(int j = 0; j < 10; j++)
                temp[j] = (int)Double.parseDouble(data.get(j));
            Arrays.sort(temp);
            List<String> data1 = new ArrayList<String>();
            for(int j = 0; j < 10; j++)
                data1.add(temp[j] + "");
            UsageCompanyGasNum.add(data1);
        }
        return UsageCompanyGasNum;

    }

    //获取公司名称
    public List<List> getUsageCompanyName(){
        List<List> UsageCompanyName = new ArrayList<List>();
        for (Integer i = 2014; i <2017; i++){
            UsageCompanyName.add(usageDao.findUsageCompanyName(i));
        }
        return UsageCompanyName;
    }

}
