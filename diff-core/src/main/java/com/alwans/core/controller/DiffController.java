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
        System.out.println("dev");
        A();
        return AjaxResult.success("Hello,"+name);
    }

    @GetMapping("test2")
    public AjaxResult test2(@RequestParam(required = false) int id){
        D();
        return AjaxResult.success(id);
    }

    public void A(){
        System.out.println("run A");
        B();
        D();
    }
    public void B(){
        System.out.println("run B");
        C();
    }
    public void C(){
        System.out.println("run C");
    }
    public void D(){
        System.out.println("dev: modify D method");
        System.out.println("run D");
    }
}
