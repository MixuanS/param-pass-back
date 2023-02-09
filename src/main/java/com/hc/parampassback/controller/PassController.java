package com.hc.parampassback.controller;

import com.hc.parampassback.vo.Rs;
import com.hc.parampassback.vo.Tree;
import com.hc.parampassback.vo.User;
import io.swagger.annotations.Api;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author hechao
 */
@Api(tags = "参数模块")
@RestController
public class PassController {

    @GetMapping("/hello")
    public String toHello(){
        return "hello";
    }

    @GetMapping("singleParam")
    public Rs singleParam(@RequestParam("str") String str) {
        if (StringUtils.hasText(str)) {
            return Rs.success("传参成功");
        }

        return Rs.fail("传参失败");
    }

    @GetMapping("singleParamArray")
    public Rs singleParamArray(String[] str) {
        if (str != null && str.length > 0) {
            return Rs.success("传参成功");
        }

        return Rs.fail("传参失败");
    }

    @GetMapping("singleParamList")
    public Rs singleParamList(List<String> str) {
        if (str != null && str.size() > 0) {
            return Rs.success("传参成功");
        }

        return Rs.fail("传参失败");
    }

    @GetMapping("singleParam1/{str}")
    public Rs singleParam1(@PathVariable String str) {
        if (StringUtils.hasText(str)) {
            return Rs.success("传参成功");
        }

        return Rs.fail("传参失败");
    }

    @GetMapping("passObject")
    public Rs passObject(User user) {
        if (user != null && StringUtils.hasText(user.getName())) {
            return Rs.success("传参成功");
        }

        return Rs.fail("传参失败");
    }

    @GetMapping("passObjectList")
    public Rs passObjectList(List<User> user) {
        if (user != null && user.size() > 0) {
            return Rs.success("传参成功");
        }

        return Rs.fail("传参失败");
    }

    @GetMapping("passMoreObject")
    public Rs passMoreObject(User user, Tree tree) {
        if (user != null && tree != null) {
            return Rs.success("传参成功");
        }

        return Rs.fail("传参失败");
    }
}
