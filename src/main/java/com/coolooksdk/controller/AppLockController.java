package com.coolooksdk.controller;

import com.coolooksdk.model.AppLockscreen;
import com.coolooksdk.model.SdkAlive;
import com.coolooksdk.queryvo.SdkAliveVO;
import com.coolooksdk.service.impl.ApplockServiceImpl;
import com.coolooksdk.utils.BuildResponse;
import com.coolooksdk.utils.PageFrom;
import com.coolooksdk.utils.ResResult;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by mingle on 2018/5/8.
 */
@Controller
@RequestMapping("/applock/")
public class AppLockController {
    @Resource
    ApplockServiceImpl applockService;
    @GetMapping(value = "all")
    public ResResult<PageInfo<AppLockscreen>> getAll(
            @RequestParam(value = "page", required = true) Integer page,
            @RequestParam(value = "limit", required = true) Integer limit
    ){
        Long starttime = System.currentTimeMillis();
        return BuildResponse.makeOKRsp(applockService.selectAll(1, page, limit), System.currentTimeMillis()-starttime);
    }
    @GetMapping(value = "all1")
    public ResResult<PageInfo<SdkAlive>> getAll1(
            @RequestParam(value = "page", required = true) Integer page,
            @RequestParam(value = "limit", required = true) Integer limit
    ){
        Long starttime = System.currentTimeMillis();
        return BuildResponse.makeOKRsp(applockService.selectAll1(page, limit), System.currentTimeMillis()-starttime);
    }
    @GetMapping(value = "all2")
    public String getAll2(
            @RequestParam(value = "page", required = true) Integer page,
            @RequestParam(value = "limit", required = true) Integer limit,
            @RequestParam(value = "status", required = true) Integer status,
            Model map
    ){
        Long starttime = System.currentTimeMillis();
        SdkAliveVO sdkAliveVO = new SdkAliveVO();
        sdkAliveVO.setStatus(status);
        ResResult<PageInfo<SdkAlive>> data = BuildResponse.makeOKRsp(applockService.getByParams(sdkAliveVO, page, limit), System.currentTimeMillis()-starttime);
        map.addAttribute("datas", data);
        return "index";
//        return data;
    }
}
