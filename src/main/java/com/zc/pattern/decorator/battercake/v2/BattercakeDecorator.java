package com.zc.pattern.decorator.battercake.v2;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/12 17:46
 * @description: 包装抽象类，继承煎饼抽象类，再怎么包装也是煎饼
 */
public abstract class BattercakeDecorator extends Battercake {

//    静态代理，委派模式：将修改的权力交给了装饰器
    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    protected abstract void doSomething();

    @Override
    protected String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    protected int price() {
        return this.battercake.price();
    }
}
