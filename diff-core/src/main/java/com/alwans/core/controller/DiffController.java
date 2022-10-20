package com.alwans.core.controller;

import com.alwans.common.utils.AjaxResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wl
 * @date 2022/10/20
 * @Description TODO
 **/
@RestController
@RequestMapping("/api")
public class DiffController {

    @GetMapping("test1")
    public AjaxResult test1(@RequestParam(required = false) String name){
        return AjaxResult.success("Hello,"+name);
    }
}
