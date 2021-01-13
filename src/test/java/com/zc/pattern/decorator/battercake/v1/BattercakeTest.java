package com.zc.pattern.decorator.battercake.v1;

import com.zc.pattern.decorator.battercake.v1.Battercake;
import com.zc.pattern.decorator.battercake.v1.BattercakeWithEgg;
import com.zc.pattern.decorator.battercake.v1.BattercakeWithEggAndSausage;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/12 17:26
 * @description:
 */
public class BattercakeTest {

    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getMsg() + ",总价格：" + battercake.price());

        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getMsg() + ",总价格：" + battercakeWithEgg.price());
        Battercake battercakeWithEggAndSausage = new BattercakeWithEggAndSausage();
        System.out.println(battercakeWithEggAndSausage.getMsg() + ",总价格：" + battercakeWithEggAndSausage.price());

    }
}
