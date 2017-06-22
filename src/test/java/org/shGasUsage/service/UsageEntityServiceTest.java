package org.shGasUsage.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by dengcunbin on 17/6/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/Spring-MVC.xml","classpath:spring/Spring-Config.xml"})
public class UsageEntityServiceTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private UsageService usageService;

    @Test
    public void testGetUsageGasNum() throws Exception {
        List<List> usageGasNumList= usageService.getUsageGasNum();
        logger.info("usageGasNumList={}",usageGasNumList);
//        System.out.println(usageGasNumList);
    }

    @Test
    public void testGetUsageGas() throws Exception {

    }

    @Test
    public void testGetUsageCompanyGasNum() throws Exception {

    }

    @Test
    public void testGetUsageCompanyName() throws Exception {

    }
}