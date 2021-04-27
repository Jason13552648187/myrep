package cn.jason.entity;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jason
 * @date 2021/4/26-13:43
 */
@Component
public class Result {

    private Map mapResult = new HashMap();
    //无参构造函数
    public Result() {
    }

    public Result(Map map){
        this.mapResult = map;
    }

    public Map getMap(){
        return this.mapResult;
    }

    public void pushMap(String key,Object value){
        this.mapResult.put(key,value);
    }

    public Result(Integer code,String msg,Object data){
        this.mapResult.put("code",code);
        this.mapResult.put("msg",msg);
        this.mapResult.put("data",data);

    }


    @Override
    public String toString() {
        return "Result{" +
                "mapResult=" + mapResult +
                '}';
    }
}
