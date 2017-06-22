package org.shGasUsage.dao.mysql;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.shGasUsage.entity.UsageEntity;

import java.util.List;

/**
 * Created by dengcunbin on 17/6/5.
 */
@Repository
public interface UsageDao {

    //获取用气量的用户数目
    List<UsageEntity> findUsageGasNum(@Param("year") Integer year);

    //获取用气量
    List<Integer> findUsageGas();

    //获取公司用气量的数目
    List<String> findUsageCompanyGasNum(@Param("year") Integer year);

    //获取公司名称
    List<String> findUsageCompanyName(@Param("year") Integer year);

}
