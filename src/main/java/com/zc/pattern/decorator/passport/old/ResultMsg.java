package com.zc.pattern.decorator.passport.old;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/12 11:55
 * @description:
 */
public class ResultMsg {

    private int code;
    private String msg;
    private String data;

    public ResultMsg(int code, String msg, String data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
