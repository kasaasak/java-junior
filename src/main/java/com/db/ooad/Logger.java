package com.db.ooad;

import com.db.ooad.factories.MessageFactory;
import com.db.ooad.factories.SaverFactory;
import com.db.ooad.filters.types.FilterTypes;
import com.db.ooad.interfaces.MessageFilter;
import com.db.ooad.interfaces.Saver;
import com.db.ooad.savers.types.SaverTypes;

/**
 * Created by Java_1 on 10.07.2018.
 */
public class Logger {
    private Saver saver;
    private MessageFilter filter;
    public Logger (FilterTypes filterType, SaverTypes saverType) {
        this.filter = MessageFactory.getMessageFilterByType(filterType);
        this.saver = SaverFactory.getSeverByType(saverType);
    }

    public void Log(String message) {
        String preparedMessage = filter.getMessage(message);
        saver.saveMessage(preparedMessage);
    }
}