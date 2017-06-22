package org.shGasUsage.dao;

import org.junit.runner.RunWith;
import org.shGasUsage.dao.mysql.UsageDao;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.shGasUsage.entity.UsageEntity;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dengcunbin on 17/6/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/Spring-Mybatis.xml"})
public class usageDaoTest {

    @Resource
    private UsageDao usageDao;

    @org.junit.Test
    public void testFindUsageGasNum() throws Exception {
        Integer year = 2014;
        List<UsageEntity> usageEntityList = usageDao.findUsageGasNum(year);
        for (UsageEntity u : usageEntityList){
           System.out.println(u);
        }
    }

    @org.junit.Test
    public void testFindUsageGas() throws Exception {
        Integer year = 2014;
        List<Integer> usageGasList = usageDao.findUsageGas();
        System.out.println(usageGasList);
    }

    @org.junit.Test
    public void testFindUsageCompanyGasNum() throws Exception {

    }

    @org.junit.Test
    public void testFindUsageCompanyName() throws Exception {

    }
}