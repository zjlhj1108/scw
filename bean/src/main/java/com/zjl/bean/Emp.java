package com.zjl.bean;

/**
 * @author 朱俊磊
 * @time 2021/4/16 18:56
 */
public class Emp {
    private Integer id;
    //登录账号
    private String loginAcct;
    //用户密码
    private String userpswd;
    //用户密码
    private String userName;
    //用户的邮箱
    private String email;
    //创建时间
    private String createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginAcct() {
        return loginAcct;
    }

    public void setLoginAcct(String loginAcct) {
        this.loginAcct = loginAcct;
    }

    public String getUserpswd() {
        return userpswd;
    }

    public void setUserpswd(String userpswd) {
        this.userpswd = userpswd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", loginAcct='" + loginAcct + '\'' +
                ", userpswd='" + userpswd + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", createtime='" + createtime + '\'' +
                '}';
    }
}
