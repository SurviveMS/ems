package cn.chiatso.ems.service;

import cn.chiatso.ems.dao.EmpDao;
import cn.chiatso.ems.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: chiatso
 * @create: 2022-04-17 17:59
 * @description: TODO
 */
@Service
@Transactional
public class EmpServiceImpl implements EmpService{

  @Autowired
  private EmpDao empDao;

  @Override
  @Transactional(propagation = Propagation.SUPPORTS)
  public List<Emp> findAll() {
    return empDao.findAll();
  }
}
