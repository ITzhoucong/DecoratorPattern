package com.zc.pattern.decorator.passport.upgrade;

import com.zc.pattern.decorator.passport.old.ISiginService;
import com.zc.pattern.decorator.passport.old.ResultMsg;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/12 18:46
 * @description: 三方登录服务 包装器
 */
public class SiginForThirdService implements ISiginForThirdService {

    private ISiginService siginService;

    public SiginForThirdService(ISiginService siginService) {
        this.siginService = siginService;
    }

    @Override
    public ResultMsg loginForQQ(String openId) {
        return null;
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        return null;
    }

    @Override
    public ResultMsg loginForSina(String openId) {
        return null;
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return null;
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return null;
    }

    @Override
    public ResultMsg loginForRegister(String username, String passport) {
        return null;
    }

    @Override
    public ResultMsg regist(String username, String password) {
        return this.siginService.regist(username,password);
    }

    @Override
    public ResultMsg login(String username, String password) {
        return this.siginService.login(username,password);
    }
}
