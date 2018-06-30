package com.mz.vo;

import lombok.Builder;
import lombok.Data;

/**
 * @author mz
 * @Description：响应封装类
 * @date 2018/6/29
 * @time 22:52
 */
@Data
@Builder
public class ResponseVo<T> {

    private boolean flag;
    private String msg;
    private T data;


    public static <T> ResponseVo<T> success() {
        return success(null);
    }

    public static <T> ResponseVo<T> success(T data) {
        return (ResponseVo<T>) builder().flag(true).data(data).build();
    }

    public static ResponseVo error(String msg) {
        return builder().flag(false).msg(msg).build();
    }
}
