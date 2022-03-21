package top.yeyusmile.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 夜雨
 * @Web www.yeyusmile.top
 * @date 2022/3/21 17:26
 */
public class BaseController {
    public Map getMap(){
        return new HashMap<Object, Object>();
    }

    public List getList(){
        return new ArrayList<>();
    }
}
