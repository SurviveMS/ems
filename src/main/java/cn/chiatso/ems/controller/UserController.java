package cn.chiatso.ems.controller;

import cn.chiatso.ems.entity.User;
import cn.chiatso.ems.service.UserService;
import cn.chiatso.ems.util.ValidateImageCodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @author: chiatso
 * @create: 2022-04-17 16:55
 * @description: 用户控制器
 */
@Controller
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService userService;

  //注册方法
  @PostMapping("/register")
  public String register(User user, String code, HttpSession session) {
    String originCode = (String)session.getAttribute("code");
    if(originCode.equalsIgnoreCase(code)) {
      userService.register(user);
      return "redirect:/index";
    }
    return "redirect:/regist";
  }

  //登录方法
  @PostMapping("/login")
  public String login(String username, String password) {
    User login = userService.login(username, password);
    if(login != null) {
      return "redirect:/emp/findAll"; //跳转到查询所有
    }else {
      return "redirect:/index"; //跳转到登录
    }

  }

  @GetMapping("/code")
  public void getImage(HttpSession session, HttpServletResponse response) throws IOException {
    //生成验证码
    String securityCode = ValidateImageCodeUtils.getSecurityCode();
    BufferedImage image = ValidateImageCodeUtils.createImage(securityCode);
    //存入session域中
    session.setAttribute("code", securityCode);
    //响应图片
    ServletOutputStream out = response.getOutputStream();
    ImageIO.write(image, "png", out);
  }

}
