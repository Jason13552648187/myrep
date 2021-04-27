package cn.jason.controller;

import cn.jason.entity.Result;
import cn.jason.entity.User;
import cn.jason.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.*;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/**
 * @author jason
 * @date 2021/2/16-23:33
 */
@Controller
public class HomeController  {

    @Autowired
    private Result result;

    @Autowired
    private User user;

    @Autowired
    private UserService userService;

    @RequestMapping({"/index","/"})
    public String index(HttpServletRequest request,HttpServletResponse response){
        request.getSession().setAttribute("username","jason");
        request.getSession().setAttribute("uid", UUID.randomUUID().toString());
        response.addCookie(new Cookie("V_code","vcode_" + UUID.randomUUID().toString()));
        return "index";
    }

    @RequestMapping("/getJson/{num1}/{num2}")
    @ResponseBody
    public Object getJson(@RequestParam String uid,
                          @PathVariable String num1,
                          @PathVariable String num2,
                          HttpSession session,
                          HttpServletRequest request, HttpServletResponse response){
//      user = new User("2-8dfq4r9adfasd-2eji","Jason","admin","female");
        System.out.println("session的值为：" + session);
        /*获取useragent的值和vCode的值*/
        System.out.println("session的详细数据为：uid:" + session.getAttribute("uid"));
        System.out.println("username:" + session.getAttribute("username"));
        Cookie[] cookies = request.getCookies();
        System.out.println("-----------cookie数据------------");
        if (null != cookies)
            for(Cookie cookie : cookies){

                System.out.println(cookie.getName() + ":" + cookie.getValue());


            }
        System.out.println("-----------cookie结束-------------");
        System.out.println("uid----------------" + uid);
        System.out.println(num1 + "-----------------" + num2);
        if(null != uid && !uid.trim().isEmpty()){
            result = new Result(709,"Find Successfully!",userService.findByUid(uid));
            return result.getMap();
        }

        List<User> userlist = userService.findAll();
        result = new Result(708,"not data! but we find all data!",userlist);
        return result.getMap();
    }

    @RequestMapping("/findByDate/{regdate}")
    @ResponseBody
    public Object getByDate(@PathVariable String regdate){

        List<User> users = userService.findByDate(regdate);

        result = new Result(702,"find successfully!",users);

        return result.getMap();
    }

    @RequestMapping("/{page}")
    public String getPage(@PathVariable String page){
        return  page;
    }
}