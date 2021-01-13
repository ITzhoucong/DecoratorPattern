package com.zc.pattern.decorator.battercake.v1;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/12 17:22
 * @description:
 */
public class BattercakeWithEggAndSausage extends BattercakeWithEgg {

    @Override
    public String getMsg() {
        return super.getMsg() + " +1个香肠";
    }

    /**
     * 1个香肠价格加2元
     */
    @Override
    public int price() {
        return super.price() + 2;
    }
}
