package cn.chiatso.ems.controller;

import cn.chiatso.ems.entity.Emp;
import cn.chiatso.ems.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author: chiatso
 * @create: 2022-04-17 18:01
 * @description: TODO
 */
@Controller
@RequestMapping("/emp")
public class EmpController {

  @Autowired
  private EmpService empService;

  @GetMapping("/findAll")
  public String findAll(Model model) {
    List<Emp> emps = empService.findAll();
    model.addAttribute("emps", emps);
    return "emp/emplist";
  }
}
