package cn.chiatso.ems.dao;

import cn.chiatso.ems.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author: chiatso
 * @create: 2022-04-17 17:06
 * @description: User数据库访问接口
 */
public interface UserDao {

  void save(User user);

  User login(@Param("username") String username, @Param("password") String password);
}
