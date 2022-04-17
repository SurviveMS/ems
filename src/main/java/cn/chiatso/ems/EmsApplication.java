package cn.chiatso.ems;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.chiatso.ems.dao")  //扫描所有dao接口
public class EmsApplication {

  public static void main(String[] args) {
    SpringApplication.run(EmsApplication.class, args);
  }

}
