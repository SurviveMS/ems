package cn.chiatso.ems.dao;

import cn.chiatso.ems.entity.Emp;

import java.util.List;

/**
 * @author: chiatso
 * @create: 2022-04-17 17:57
 * @description: TODO
 */
public interface EmpDao {

  List<Emp> findAll();
}
