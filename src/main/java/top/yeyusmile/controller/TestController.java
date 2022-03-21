package top.yeyusmile.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;
import top.yeyusmile.anno.AopLogger;
import top.yeyusmile.pojo.Result;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * 说明接口文件
 *
 * @author 夜雨
 * @Web www.yeyusmile.top
 * @date 2022/3/20 14:01
 */

@Slf4j
@RequestMapping("/test")
@Controller
@Api(value = "测试接口", tags = "测试接口", description = "测试接口")
public class TestController extends BaseController {


    @AopLogger()
    @ResponseBody
    @GetMapping(value = "getCurrentTimeMillis")
    @ApiOperation(value = "返回系统毫秒数", notes = "毫秒数")
    public Result<Long> currentTimeMillis() {

        return new Result<>(System.currentTimeMillis());
    }

    /**
     * 根据id查询用户
     *
     * @param id
     * @return
     */
    @AopLogger()
    @ResponseBody()
    @GetMapping(value = "complextData")
    @ApiOperation(value = "测试返回复杂数据类型", notes = "测试复数据")
    public Result complextData(Integer id) {
        Map map = getMap();
        map.put("学号", 123322332);
        map.put("名字", "张三");
        map.put("年龄", 18);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("英语");
        strings.add("数学");
        map.put("课程", strings);
        return new Result<Map<Object, Object>>(map);
    }


    @AopLogger()
    @ResponseBody
    @ApiOperation(value = "invoke", notes = "传入什么,返回什么")
    @ApiImplicitParam(name = "str", value = "str入参", required = true,
            dataType = "String", paramType = "query")
    @GetMapping(value = "/invoke")
    public String invoke(String str) {

        return str;
    }

}
