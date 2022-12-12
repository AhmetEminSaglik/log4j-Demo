package org.example.demo.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getCharOfAsciiValue(35);
//        String[] word = new String[]{"xwq", "şŞçÇöÖüÜıIiİ", "áÁéÉñÑ", "こんにちは"};
      /*  List<String> wordList = new ArrayList<>();
        List<int[]> valueList = new ArrayList<>();
        wordList.add("24");
        wordList.add("şişe");
        wordList.add("こは");

        for (String tmp : wordList) {
            valueList.add(getValueOfCharsAndPrintAsciiValueOfWord(tmp));
        }
        int index = 0;
        for (int[] tmp : valueList) {
            for (int i = 0; i <= wordList.get(index).length()-1; i++) {
                System.out.println("int[" + i + "] test : " + (char)tmp[i]);
            }
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            index++;
        }*/

//        print10000Ascii();



//        int asciiCharacter = Integer.MAX_VALUE - 1;
//        System.out.println(65 + " : " + (char) 65);
//        System.out.println(65_601 + " : " + (char) 65_601);
//        System.out.println(131_137 + " : " + (char) 131_137);
//
//        try{
        Logger logger = LogManager.getLogger();
//        logger.trace("Trace Log");
//        logger.debug("Debug Log");
        logger.error("Info Log");
        logger.warn("Info Log");
        System.out.println("test");
//        logger.warn("Warn Log");
//        logger.error("Error Log");
//        logger.fatal("Fatal Log");
//        System.out.println("-------------------------");
//        new Calculater().printSum(3,0);
//        new Calculater().printSum(3,1);+
//        for (int i = 0; i < Integer.MAX_VALUE; i++) {
//            logger.info(getEasyReadString(i) + " : " + (char) i);
//        }
//        logger.exit(); arastir
//        logger.exit(R); diye bisi var arastir

//        logger.log(Level.valueOf("info"), "messageasdasd");
//        logger.log(Level.valueOf("Fatal"), "messageasdasd");

//        ConsoleAppender consoleAppender
//        new Calculater().printSum(3,0);
//        }catch ()

    }

    static void print10000Ascii(){
        for(int i=0;i<10000;i++){
            System.out.println(i+"-) "+(char)i);
        }
    }

    private static String getEasyReadString(int num) {
        //123456789
        String text = Integer.toString(num);
        char[] charText = text.toCharArray();
//        waitMe();
        String clearText = "";
        int digit = 0;
        for (int i = text.length() - 1; i >= 0; i--) {
            digit++;
            clearText = charText[i] + clearText;
            if (digit % 3 == 0 && text.length() > digit) {
                clearText = "_" + clearText;
            }
        }
        return clearText;
    }

    static int[] getValueOfCharsAndPrintAsciiValueOfWord(String word) {
        char[] chars = word.toCharArray();
        int[] values = new int[chars.length];
        int i = 0;
        for (char c : chars) {
            int val = getAsciiValue(c);
            values[i] = val;
            i++;
        }
        System.out.println("----");
        return values;
    }

    static int getAsciiValue(char c) {
        System.out.println(c + " : " + (int) c);
        return (int) c;
    }

    static char getCharOfAsciiValue(int val) {
        System.out.println(val + " : " + (char) val);
        return (char) val;
    }
}