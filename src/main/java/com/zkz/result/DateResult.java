package com.zkz.result;

import java.io.Serializable;

/**
 * 定义即有数据又有返回状态的DateResult
 */
public class DateResult<T> extends Result implements Serializable {
    private T result;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
