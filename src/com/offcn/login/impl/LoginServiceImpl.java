package com.offcn.login.impl;

import com.offcn.login.LoginService;

public class LoginServiceImpl implements LoginService {
    @Override
    public String loginIn(String username, String password) {
        username = "李素";
        password = "569";
        return "用户名为："+username+",密码为："+password;
    }
}
