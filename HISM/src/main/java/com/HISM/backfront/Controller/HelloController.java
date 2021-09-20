package com.HISM.backfront.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "用户管理相关接口")
@RequestMapping("/hello")
public class HelloController {
    @PostMapping("/test")
    @ApiOperation("添加用户的接口")
    public String hello(@RequestParam String name) {
        return name;
    }

}