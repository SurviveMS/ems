package cn.chiatso.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: chiatso
 * @create: 2022-04-17 16:41
 * @description: 主页控制器
 */
@Controller
public class IndexController {

  @RequestMapping("/index")
  public String toIndex() {
    return "ems/login";
  }

  @RequestMapping("/regist")
  public String toRegister() {
    return "ems/regist";
  }
}
