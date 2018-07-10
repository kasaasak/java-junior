package com.db.ooad;

import com.db.ooad.filters.types.FilterTypes;
import com.db.ooad.savers.types.SaverTypes;

/**
 * Created by Java_1 on 10.07.2018.
 */
public class AppLogger {
    public static void main(String[] args) {
        Logger logger = new Logger(FilterTypes.LENGHT, SaverTypes.CONSOLE);
        logger.Log("[INFO] Message");
    }
}