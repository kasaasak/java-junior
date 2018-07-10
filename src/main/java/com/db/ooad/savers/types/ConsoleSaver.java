package com.db.ooad.savers.types;

import com.db.ooad.interfaces.Saver;

/**
 * Created by Java_1 on 10.07.2018.
 */
public class ConsoleSaver implements Saver {
    public void saveMessage(String message) {
        System.out.println();
    }
}