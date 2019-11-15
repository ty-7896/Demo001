package com.offcn.loginout.impl;

import com.offcn.loginout.LoginOutService;

public class LoginOutServiceImpl implements LoginOutService {
    @Override
    public String loginOut(String username) {
        return "用户名为："+username+"退出成功！";
    }
}
