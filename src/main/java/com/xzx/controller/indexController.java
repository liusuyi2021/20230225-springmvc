package com.xzx.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName: indexController
 * @Description:
 * @Author: Administrator
 * @Date: 2023年02月25日 8:28
 * @Version: 1.0
 **/
@Controller
@Api(value = "开放接口")
public class indexController {

    @GetMapping("/")
    @ApiOperation(value = "进入首页面", httpMethod = "GET", notes = "get index", response = String.class)
    String index(Model model) {
        model.addAttribute("Title", "测试页");
        model.addAttribute("END", "测试");
        return "index";
    }
}
