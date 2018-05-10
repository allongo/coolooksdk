package com.coolooksdk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by mingle on 2018/5/8.
 */
@Controller
@RequestMapping("/test/")
public class IndexController {
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String goIndex(){
        return "news/index";
    }
}
