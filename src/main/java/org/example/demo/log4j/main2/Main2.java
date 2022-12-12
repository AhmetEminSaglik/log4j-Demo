package org.example.demo.log4j.main2;

import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.appender.ConsoleAppender;
import org.apache.logging.log4j.core.layout.PatternLayout;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main2 {
    private static Logger log = Logger.getLogger(String.valueOf(Main2.class));
    public static void main(String[] args) {
//        Layout layout =new PatternLayout.SerializerBuilder("");
//        Appender app = new ConsoleAppender();
        log.info("info test");
//        log.warning("warning test");
//        log.finer("finer test");
//        log.finest("finest test");
    }
}
