package org.shGasUsage.entity;

/**
 * 获取燃气用气量和数目
 * Created by dengcunbin on 17/6/6.
 */
public class UsageEntity {

    //燃气用气量
    private Integer usageGas;

    //燃气用气量数目 （比如用气量为199的用户数目为20）
    private Integer usageNum;

    public Integer getUsageNum() {
        return usageNum;
    }

    public void setUsageNum(Integer usageNum) {
        this.usageNum = usageNum;
    }

    public Integer getUsageGas() {return usageGas;}

    public void setUsageGas(Integer usageGas) {this.usageGas = usageGas;}

    @Override
    public String toString() {
        return "UsageEntity{" +
                "usageGas=" + usageGas +
                ", usageNum=" + usageNum +
                '}';
    }
}
