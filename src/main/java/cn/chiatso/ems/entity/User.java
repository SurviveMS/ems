package cn.chiatso.ems.entity;

/**
 * @author: chiatso
 * @create: 2022-04-17 17:04
 * @description: User实体类
 */
public class User {

  private String id;
  private String username;
  private String password;
  private String realname;
  private String sex;

  public User() {
  }

  public User(String id, String username, String password, String realname, String sex) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.realname = realname;
    this.sex = sex;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getRealname() {
    return realname;
  }

  public void setRealname(String realname) {
    this.realname = realname;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  @Override
  public String toString() {
    return "User{" +
            "id='" + id + '\'' +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", realname='" + realname + '\'' +
            ", sex='" + sex + '\'' +
            '}';
  }
}
