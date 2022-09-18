package org.example.demo.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Loggin2 {
    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        insertPersonel();
        insertPersonel();
        System.out.println("eklendi");
    }

    public static void insertPersonel() {
        logger.info("personel added successfully");
    }
}
