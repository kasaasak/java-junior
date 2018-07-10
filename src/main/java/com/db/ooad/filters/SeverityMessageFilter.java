package com.db.ooad.filters;

import com.db.ooad.interfaces.MessageFilter;

/**
 * Created by Java_1 on 10.07.2018.
 */
public class SeverityMessageFilter implements MessageFilter{
    FilterSeverity severity;
    public SeverityMessageFilter(FilterSeverity severtiy) {
        this.severity = severity;
    }
    public String getMessage(String message) {
        return null;
    }
}