package com.zc.pattern.decorator.passport.old;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/12 18:40
 * @description: 登录注册实现
 */
public class SiginService implements ISiginService {


        /**
         * 注册方法
         */
        @Override
        public ResultMsg regist(String username,String password){
            return new ResultMsg(200,"注册成功",null);
        }

        /**
         * 登录方法
         */
        @Override
        public ResultMsg login(String username,String password){
            return new ResultMsg(200,"登录成功",null);
        }

}
