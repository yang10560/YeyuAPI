package top.yeyusmile.pojo;

import com.google.gson.Gson;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 夜雨
 * @Web www.yeyusmile.top
 * @date 2022/3/16 15:18
 */
@ApiModel(value = "统一JSON类型", description = "通用封装统一返回类型")
public class Result<T> implements Serializable {

    @ApiModelProperty(value = "状态码", notes = "描述返回值状态")
    private Integer status;
    @ApiModelProperty(value = "提示信息", notes = "描述返回值提示信息")
    private String msg;
    @ApiModelProperty(value = "返回数据<T>", notes = "描述返回的数据")
    private T data;

    public Result() {
        this.status = ResultCode.SUCCESS.getCode();
        this.msg = "";
    }

    public Result(T data) {
        this.status = ResultCode.SUCCESS.getCode();
        this.msg = ResultCode.SUCCESS.getDesc();
        this.data = data;
    }

    public Result(Integer status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public Result(Integer status, T data) {
        this.status = status;
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String toJsonStr() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }



}
