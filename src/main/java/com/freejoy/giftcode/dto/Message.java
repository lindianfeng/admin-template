package com.freejoy.giftcode.dto;

import java.io.Serializable;

public class Message implements Serializable {
    private final Integer code;
    private final String msg;

    private Message(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public String toJson() {
        return "{\"code\":" + this.getCode() + ",\"msg\": \"" + this.getMsg() + "\"}";
    }

    public static Message build(Integer code, String msg) {
        return new Message(code, msg);
    }
}
