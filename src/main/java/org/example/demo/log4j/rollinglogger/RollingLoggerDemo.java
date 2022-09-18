package org.example.demo.log4j.rollinglogger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RollingLoggerDemo {
    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            logger.fatal("Deneme : " + (i + 1));
        }
    }
}
