package top.yeyusmile.pojo;

import io.swagger.annotations.ApiModel;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author 夜雨
 * @Web www.yeyusmile.top
 * @date 2022/3/21 16:26
 */
@ApiIgnore
public enum ResultCode {

    SUCCESS(200,"SUCCESS"),
    ERROR(-1,"ERROR");

    private final int code;
    private final String desc;

    ResultCode(int code, String desc){
        this.code = code;
        this.desc = desc;
    }
    public int getCode() {
        return code;
    }
    public String getDesc() {
        return desc;
    }
}