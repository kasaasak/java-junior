package com.db.ooad.factories;

import com.db.ooad.interfaces.Saver;
import com.db.ooad.savers.types.ConsoleSaver;
import com.db.ooad.savers.types.SaverTypes;

/**
 * Created by Java_1 on 10.07.2018.
 */
public class SaverFactory {
    public static Saver getSeverByType(SaverTypes saverType) {
        Saver saver = null;
        switch (saverType) {
            case CONSOLE: saver = new ConsoleSaver(); break;
        }
        return saver;
    }
}