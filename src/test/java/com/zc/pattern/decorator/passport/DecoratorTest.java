package com.zc.pattern.decorator.passport;

import com.zc.pattern.decorator.passport.old.SiginService;
import com.zc.pattern.decorator.passport.upgrade.SiginForThirdService;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/13 10:34
 * @description:
 */
public class DecoratorTest {

    public static void main(String[] args) {
        SiginForThirdService siginForThirdService = new SiginForThirdService(new SiginService());
        siginForThirdService.loginForQQ("fdfdfasd");
    }
}
