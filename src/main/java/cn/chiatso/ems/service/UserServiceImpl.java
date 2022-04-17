package cn.chiatso.ems.service;

import cn.chiatso.ems.dao.UserDao;
import cn.chiatso.ems.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * @author: chiatso
 * @create: 2022-04-17 17:10
 * @description: 用户服务实现
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{

  @Autowired
  private UserDao userDao;

  @Override
  public void register(User user) {
    user.setId(UUID.randomUUID().toString());
    userDao.save(user);
  }

  @Override
  public User login(String username, String password) {
    return userDao.login(username, password);
  }
}
