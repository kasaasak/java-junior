package com.db.ooad.filters;

import com.db.ooad.interfaces.MessageFilter;

/**
 * Created by Java_1 on 10.07.2018.
 */
public class MessageLengthFilter implements MessageFilter {
    final static Integer maxMessageLength = 6;
    public String getMessage(String message) {
        if (message.length() > 6) return message;
        return null;
    }
}