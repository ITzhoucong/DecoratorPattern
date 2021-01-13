package com.zc.pattern.decorator.battercake.v1;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/12 17:20
 * @description: 煎饼加一个鸡蛋
 */
public class BattercakeWithEgg extends Battercake {

    @Override
    public String getMsg() {
        return super.getMsg() + " +1个鸡蛋";
    }

    /**
     * 加一个鸡蛋加2元
     */
    @Override
    public int price() {
        return super.price() + 2;
    }
}
