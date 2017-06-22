package org.shGasUsage.controller;

import org.shGasUsage.dao.hive.FeedTypeDao;
import org.shGasUsage.dto.FeedTypeResult;
import org.shGasUsage.entity.FeedTypeEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by dengcunbin on 17/6/22.
 */
@Controller
@RequestMapping(value = "/feedType")
public class FeedTypeController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private FeedTypeDao feedTypeDao;

    @RequestMapping(value = "/result",method = RequestMethod.POST)
    @ResponseBody
    public FeedTypeResult getFeedTypeResultData(@RequestBody FeedTypeEntity feedTypeEntity){

        List<FeedTypeEntity> feedTypeResult = feedTypeDao.getFeedTypeData(FeedTypeDao.QueryType.feedType,feedTypeEntity.getFeedArea());

        List<FeedTypeEntity> feedAreaResult = feedTypeDao.getFeedTypeData(FeedTypeDao.QueryType.feedArea,feedTypeEntity.getFeedArea());

        List<FeedTypeEntity> feedYearResult = feedTypeDao.getFeedTypeData(FeedTypeDao.QueryType.feedYear,feedTypeEntity.getFeedArea());

        return new FeedTypeResult(feedTypeResult,feedAreaResult,feedYearResult);
    }


}
