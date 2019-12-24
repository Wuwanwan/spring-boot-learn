package com.learn.springdatalearn.exception;

/**
 * 该模块专用异常
 *
 * @author wuww
 * @version 1.0
 */
public class LearnException extends RuntimeException {

    public LearnException(String message) {
        super(message);
    }

    public LearnException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
