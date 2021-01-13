package com.zc.pattern.decorator.battercake.v2;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/12 17:45
 * @description: 基础煎饼（什么也不加）
 */
public class BaseBattercake extends Battercake {

    @Override
    public String getMsg(){
        return "煎饼";
    }

    @Override
    public int price(){
        return 5;
    }
}
