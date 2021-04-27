package cn.jason.utils;



import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author jason
 * @date 2021/4/23-16:51
 */
public class StaticUtils {

   /*获取静态uuid序列码*/
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-","").toLowerCase();
    }

    /*获取静态模板时间*/
    public static  String getDate(String simple){
        return new SimpleDateFormat(simple).format(new Date()).toString();
    }

    public static void main(String[] agrs){
        try {
            System.out.println(getDate("yyyy-MM-dd HH:mm:ss"));
            System.out.println(getUUID());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
