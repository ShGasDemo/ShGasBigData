package org.shGasUsage.service;

import java.util.List;

/**
 * Created by dengcunbin on 17/6/5.
 */
public interface UsageService {

    //获取用气量的用户数
    List<List> getUsageGasNum();

    //获取用气量
    List<Integer> getUsageGas();

    //获取公司用气量的数目
    List<List> getUsageCompanyGasNum();

    //获取公司的名称
    List<List> getUsageCompanyName();
}
