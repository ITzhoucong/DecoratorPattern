package com.zc.pattern.decorator.passport.upgrade;

import com.zc.pattern.decorator.passport.old.ISiginService;
import com.zc.pattern.decorator.passport.old.ResultMsg;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/12 18:43
 * @description: 三方登录接口
 */
public interface ISiginForThirdService extends ISiginService {
    /**
     * QQ登录
     */
    ResultMsg loginForQQ(String openId);

    /**
     * 微信登录
     */
    ResultMsg loginForWechat(String openId);

    /**
     * 新浪登录
     */
    ResultMsg loginForSina(String openId);

    /**
     * token登录
     */
    ResultMsg loginForToken(String token);

    /**
     * 手机验证登录
     */
    ResultMsg loginForTelphone(String telphone,String code);

    /**
     * 注册账号后自动登录
     */
    ResultMsg loginForRegister(String username,String passport);


}
