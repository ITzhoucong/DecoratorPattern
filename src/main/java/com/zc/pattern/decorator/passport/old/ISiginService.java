package com.zc.pattern.decorator.passport.old;

public interface ISiginService {

    /**
     * 注册方法
     */
    ResultMsg regist(String username,String password);

    /**
     * 登录方法
     */
    ResultMsg login(String username,String password);
}
