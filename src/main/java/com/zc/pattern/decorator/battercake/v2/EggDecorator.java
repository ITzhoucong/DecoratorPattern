package com.zc.pattern.decorator.battercake.v2;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/12 17:50
 * @description: 鸡蛋包装类
 */
public class EggDecorator extends BattercakeDecorator {

    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg() + " +1个鸡蛋";
    }

    @Override
    protected int price() {
        return super.price() + 2;
    }
}
