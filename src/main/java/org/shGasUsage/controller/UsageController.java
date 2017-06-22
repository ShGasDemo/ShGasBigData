package org.shGasUsage.controller;

import org.shGasUsage.dto.UsageResult;
import org.shGasUsage.service.UsageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by dengcunbin on 17/6/5.
 */
@Controller
@RequestMapping(value = "/usage")
public class UsageController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UsageService usageService;

    @RequestMapping(value = "/usageGas",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public UsageResult requestUsageData(Model model){

        List<List> usageGasNum= usageService.getUsageGasNum();

//        logger.info("usageGasNum={}" + usageGasNum);

        List<Integer> usageGas = usageService.getUsageGas();

        List<List> usageCompanyGasNum = usageService.getUsageCompanyGasNum();

        List<List> usageCompanyName = usageService.getUsageCompanyName();

//        writeFile("/Users/dengcunbin/idea-project/shGasUsage/src/main/webapp/resources/js/UsageEntity.json",json);

        return new UsageResult(usageGasNum,usageGas,usageCompanyGasNum,usageCompanyName);
    }

    //写json到json文件
    public static void writeFile(String filePath, String sets)
            throws IOException {
        FileWriter fw = new FileWriter(filePath);
        PrintWriter out = new PrintWriter(fw);
        out.write(sets);
        out.println();
        fw.close();
        out.close();
    }
}

