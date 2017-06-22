package org.shGasUsage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dengcunbin on 17/6/22.
 */
@Controller
public class forwardController {

    @RequestMapping(value = "/{forwardName}")
    public String forwardPage(@PathVariable("forwardName") String forwardName){
        //动态跳转页面
        return forwardName;
    }
}
