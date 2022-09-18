package org.example.demo.log4j;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.appender.ConsoleAppender;

public class Main {
    public static void main(String[] args) {
//        try{
        Logger logger = LogManager.getLogger();
//        logger.trace("Trace Log");
//        logger.debug("Debug Log");
//        logger.info("Info Log");
//        logger.warn("Warn Log");
//        logger.error("Error Log");
//        logger.fatal("Fatal Log");
//        System.out.println("-------------------------");
//        new Calculater().printSum(3,0);
//        new Calculater().printSum(3,1);+
        for (int i = 0; i < 100; i++) {
            logger.info("xyz- Deneme : " + (i + 1));
            logger.exit();
        }
//        logger.exit(); arastir
//        logger.exit(R); diye bisi var arastir

        logger.log(Level.valueOf("info"), "messageasdasd");
        logger.log(Level.valueOf("Fatal"), "messageasdasd");

//        ConsoleAppender consoleAppender
//        new Calculater().printSum(3,0);
//        }catch ()
    }
}