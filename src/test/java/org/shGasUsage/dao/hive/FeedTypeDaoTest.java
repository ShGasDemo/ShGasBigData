package org.shGasUsage.dao.hive;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by dengcunbin on 17/6/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/Spring-MVC.xml","classpath:spring/Spring-Config.xml"})
public class FeedTypeDaoTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private FeedTypeDao feedTypeDao;

    @Test
    public void testGetFeedTypeData() throws Exception {

//        logger.info("feedTypeEntityList={}",feedTypeDao.getFeedTypeData(FeedTypeDao.QueryType.feedType,null));

        String feedArea = "浦东";
//        logger.info("feedTypeEntityList={}",feedTypeDao.getFeedTypeData(FeedTypeDao.QueryType.feedArea,feedArea));

        logger.info("feedTypeEntityList={}",feedTypeDao.getFeedTypeData(FeedTypeDao.QueryType.feedYear,null));
    }


}