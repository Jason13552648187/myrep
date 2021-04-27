package cn;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.lang.reflect.AnnotatedElement;


/**
 * Hello world!
 *
 */
@ComponentScan("cn.jason")
public class App {

    public static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        System.out.println("测试成功！");
    }
}
