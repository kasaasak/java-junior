package com.db.ooad.factories;

import com.db.ooad.filters.FilterSeverity;
import com.db.ooad.filters.MessageLengthFilter;
import com.db.ooad.filters.SeverityMessageFilter;
import com.db.ooad.filters.types.FilterTypes;
import com.db.ooad.interfaces.MessageFilter;

/**
 * Created by Java_1 on 10.07.2018.
 */
class MessageFactory {
    static MessageFilter getMessageFilterByType(FilterTypes filterType) {
        MessageFilter filter = null;
        switch (filterType) {
            case LENGHT: filter = new MessageLengthFilter(); break;
            case SEVERITY_DEBUG: filter = new SeverityMessageFilter(FilterSeverity.DEBUG); break;
            case SEVERITY_INFO: filter = new SeverityMessageFilter(FilterSeverity.INFO); break;
            case SEVERITY_ERROR: filter = new SeverityMessageFilter(FilterSeverity.ERROR); break;
        }
        return filter;
    }
}