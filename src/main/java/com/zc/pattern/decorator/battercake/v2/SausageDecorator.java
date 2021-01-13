package com.zc.pattern.decorator.battercake.v2;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/12 17:52
 * @description: 香肠包装类
 */
public class SausageDecorator extends BattercakeDecorator {

    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSomething() {

    }

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
