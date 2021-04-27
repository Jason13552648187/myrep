package cn.jason.controller;

import cn.jason.entity.Result;
import cn.jason.entity.User;
import cn.jason.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jason
 * @date 2021/3/4-20:31
 */
@Controller
public class BaseController {
    private Result result = new Result();

    @Autowired
    private User user;

    @Autowired
    private UserService userService;


    @RequestMapping("/getData")
    @ResponseBody
    public Object getData(){
        result.pushMap("code",702);
        result.pushMap("msg","regiseter successfully!");
        result.pushMap("data",userService.findAll());
        return result.getMap();
    }

}
