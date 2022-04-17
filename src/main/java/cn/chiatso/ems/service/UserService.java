package cn.chiatso.ems.service;

import cn.chiatso.ems.entity.User;

/**
 * @author: chiatso
 * @create: 2022-04-17 17:09
 * @description: 用户服务
 */
public interface UserService {

  void register(User user);

  User login(String username, String password);
}
