package org.shGasUsage.dto;

import java.util.List;

/**
 * 将usage数据封装
 * Created by dengcunbin on 17/6/11.
 */
public class UsageResult {

    private List<List> usageGasNum;

    private List<Integer> usageGas;

    private List<List> usageCompanyGasNum;

    private List<List> usageCompanyName;

    public UsageResult(List<List> usageGasNum, List<Integer> usageGas, List<List> usageCompanyGasNum, List<List> usageCompanyName) {
        this.usageGasNum = usageGasNum;
        this.usageGas = usageGas;
        this.usageCompanyGasNum = usageCompanyGasNum;
        this.usageCompanyName = usageCompanyName;
    }

    public List<List> getUsageGasNum() {
        return usageGasNum;
    }

    public void setUsageGasNum(List<List> usageGasNum) {
        this.usageGasNum = usageGasNum;
    }

    public List<Integer> getUsageGas() {
        return usageGas;
    }

    public void setUsageGas(List<Integer> usageGas) {
        this.usageGas = usageGas;
    }

    public List<List> getUsageCompanyGasNum() {
        return usageCompanyGasNum;
    }

    public void setUsageCompanyGasNum(List<List> usageCompanyGasNum) {
        this.usageCompanyGasNum = usageCompanyGasNum;
    }

    public List<List> getUsageCompanyName() {
        return usageCompanyName;
    }

    public void setUsageCompanyName(List<List> usageCompanyName) {this.usageCompanyName = usageCompanyName;}

    @Override
    public String toString() {
        return "UsageResult{" +
                "usageGasNum=" + usageGasNum +
                ", usageGas=" + usageGas +
                ", usageCompanyGasNum=" + usageCompanyGasNum +
                ", usageCompanyName=" + usageCompanyName +
                '}';
    }
}
