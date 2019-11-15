package com.offcn.login.impl;

import com.offcn.login.LoginService;

public class LoginServiceImpl implements LoginService {
    @Override
    public String loginIn(String username, String password) {
        username = "张三";
        password = "123";
        return "用户名为："+username+",密码为："+password;
    }
}
