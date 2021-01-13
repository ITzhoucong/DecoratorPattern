package com.zc.pattern.decorator.battercake.v2;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/12 17:54
 * @description:
 */
public class BattercakeTest {

    public static void main(String[] args) {

        Battercake battercake;
//    路边买一个煎饼
        battercake = new BaseBattercake();
//        煎饼有点小，再想加个鸡蛋
        battercake = new EggDecorator(battercake);
//        再加一个鸡蛋
        battercake = new EggDecorator(battercake);
//        再加一跟香肠
        battercake = new SausageDecorator(battercake);

        System.out.println(battercake.getMsg() + "总价：" + battercake.price());

    }


}
