package org.shGasUsage.dto;

import org.shGasUsage.entity.FeedTypeEntity;

import java.util.List;

/**
 * Created by dengcunbin on 17/6/22.
 */
public class FeedTypeResult {

    private List<FeedTypeEntity> feedTypeResult;

    private List<FeedTypeEntity> feedAreaResult;

    private List<FeedTypeEntity> feedYearResult;

    public FeedTypeResult(List<FeedTypeEntity> feedTypeResult, List<FeedTypeEntity> feedAreaResult, List<FeedTypeEntity> feedYearResult) {
        this.feedTypeResult = feedTypeResult;
        this.feedAreaResult = feedAreaResult;
        this.feedYearResult = feedYearResult;
    }

    public List<FeedTypeEntity> getFeedTypeResult() {
        return feedTypeResult;
    }

    public void setFeedTypeResult(List<FeedTypeEntity> feedTypeResult) {
        this.feedTypeResult = feedTypeResult;
    }

    public List<FeedTypeEntity> getFeedAreaResult() {
        return feedAreaResult;
    }

    public void setFeedAreaResult(List<FeedTypeEntity> feedAreaResult) {
        this.feedAreaResult = feedAreaResult;
    }

    public List<FeedTypeEntity> getFeedYearResult() {
        return feedYearResult;
    }

    public void setFeedYearResult(List<FeedTypeEntity> feedYearResult) {
        this.feedYearResult = feedYearResult;
    }

    @Override
    public String toString() {
        return "FeedTypeResult{" +
                "feedTypeResult=" + feedTypeResult +
                ", feedAreaResult=" + feedAreaResult +
                ", feedYearResult=" + feedYearResult +
                '}';
    }
}
