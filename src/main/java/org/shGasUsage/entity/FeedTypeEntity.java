package org.shGasUsage.entity;

/**
 * Created by dengcunbin on 17/6/21.
 */
public class FeedTypeEntity {

    private Integer feedType; //反映类别

    private Integer feedTypeNum; //反应类别数量

    private String feedArea; //反映区名

    private Integer feedYear;//反映年份

    private Integer feedNumber;//反映总数

    public FeedTypeEntity() {
    }

    public FeedTypeEntity(Integer feedType, Integer feedTypeNum) {
        this.feedType = feedType;
        this.feedTypeNum = feedTypeNum;
    }

    public FeedTypeEntity(Integer feedYear) {
        this.feedYear = feedYear;
    }

    public Integer getFeedType() {
        return feedType;
    }

    public void setFeedType(Integer feedType) {
        this.feedType = feedType;
    }

    public Integer getFeedTypeNum() {
        return feedTypeNum;
    }

    public void setFeedTypeNum(Integer feedTypeNum) {
        this.feedTypeNum = feedTypeNum;
    }

    public String getFeedArea() {return feedArea;}

    public void setFeedArea(String feedArea) {this.feedArea = feedArea;}

    public Integer getFeedYear() {
        return feedYear;
    }

    public void setFeedYear(Integer feedYear) {
        this.feedYear = feedYear;
    }

    public Integer getFeedNumber() {
        return feedNumber;
    }

    public void setFeedNumber(Integer feedNumber) {
        this.feedNumber = feedNumber;
    }

//    @Override
//    public String toString() {
//        return "FeedTypeEntity{" +
//                "feedType=" + feedType +
//                ", feedTypeNum=" + feedTypeNum +
//                '}';
//    }

    @Override
    public String toString() {
        return "FeedTypeEntity{" +
                "feedYear=" + feedYear +
                ", feedNumber=" + feedNumber +
                '}';
    }
}
