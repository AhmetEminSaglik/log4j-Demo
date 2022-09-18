package org.example.demo.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculater {
    public void printSum(int a, int b) {
        Logger logger = LogManager.getLogger();
        try {
//            logger.info("sum : " + a / b);
//            logInfo("sum :"+a/b);
        } catch (Exception e) {
//            logFatal("error " +e.getMessage());
        }
    }


//    private void logFatal(String message) {
//        LogManager.getLogger().fatal(message);
//    }
//
//    private void logInfo(String message) {
//        LogManager.getLogger().info(message);
//    }

}
