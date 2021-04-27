package cn.jason.service;

import cn.jason.entity.User;
import cn.jason.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author jason
 * @date 2021/2/22-23:01
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;
    //查询所有学员
    public List<User> findAll(){
        return userMapper.findAll();
    }

    //通过uid查询人员
    public User  findByUid(String uid){
         return userMapper.findByUid(uid);
    }


    //通过登录名查询
    public User findByLoginname(String loginname){
        return userMapper.findByLoginname(loginname);
    }

    //通过用户名查询
    public User findByUsername(String username){
        return userMapper.findByUsername(username);
    }

    //通过用户名和密码查询
    public User findByUsernameAndPwd(String username,String password){
        return userMapper.findByUsernameAndPwd(username,password);
    }

    //通过毕业状态来查询
    public User findByGradu(int granduation){
        return userMapper.findByGradu(granduation);
    }

    //通过电话号码和密码查询
    public User findByPhoneNumAndPwd(String phoneNumber,String password){
        return userMapper.findByPhoneNumAndPwd(phoneNumber,password);
    }

    //通过注册日期来查询
    public List<User> findByDate(String reg_date){
        return userMapper.findByDate((null == reg_date ? "now()" : reg_date));
    }




}