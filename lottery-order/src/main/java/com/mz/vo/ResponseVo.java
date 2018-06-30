package com.mz.vo;

import lombok.Builder;
import lombok.Data;

/**
 * @author mz
 * @Description：
 * @date 2018/6/30
 * @time 9:09
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
