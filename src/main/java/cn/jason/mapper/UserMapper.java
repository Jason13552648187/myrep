package cn.jason.mapper;

import cn.jason.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author jason
 * @date 2021/2/22-16:19
 */
@Mapper
public interface UserMapper {

    List<User> findAll();

    User findByUid(String uid);

    User findByLoginname(String loginname);

    User findByUsername(String username);

    User findByUsernameAndPwd(String username,String password);

    User findByGradu(int granduation);

    User findByPhoneNumAndPwd(String phoneNumber,String password);

    List<User> findByDate(String regdate);


}
