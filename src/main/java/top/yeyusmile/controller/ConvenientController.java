package top.yeyusmile.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.yeyusmile.pojo.HistoryTody;
import top.yeyusmile.service.ConvenientService;



/**
 * 说明接口文件
 * @author 夜雨
 * @Web www.yeyusmile.top
 * @date 2022/3/20 14:01
 */

@Slf4j
@RequestMapping("/user")
@Controller
@Api(value = "测试接口", tags = "用户管理相关的接口", description = "用户测试接口")
public class ConvenientController {

    @Autowired
    private ConvenientService convenientService;

    /**
     * 保存数据
     * @param historyTody
     * @return
     */

    @ResponseBody
    @PostMapping(value = "/save")
    //方法参数说明，name参数名；value参数说明，备注；dataType参数类型；required 是否必传；defaultValue 默认值
    @ApiImplicitParam(name = "user", value = "新增用户数据")
    //说明是什么方法(可以理解为方法注释)
    @ApiOperation(value = "添加用户", notes = "添加用户")
    public String saveUser(HistoryTody historyTody){
       // userService.save(user);
        return "保存成功";
    }

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    @ResponseBody
    @GetMapping(value = "findById")
    @ApiOperation(value = "根据id获取用户信息", notes = "根据id查询用户信息")
    public HistoryTody getUser(Integer id){

        return convenientService.historyToday();
    }

    @ResponseBody
    @DeleteMapping(value = "deleteById")
    @ApiOperation(value = "根据id删除数据", notes = "删除用户")
    public String delete(Integer id){
       // userService.deleteById(id);
        return "删除成功";
    }
}
