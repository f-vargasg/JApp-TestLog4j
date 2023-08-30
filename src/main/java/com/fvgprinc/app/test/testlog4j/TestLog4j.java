/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.fvgprinc.app.test.testlog4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author garfi
 */
public class TestLog4j {

    private static final Logger logger = LogManager.getLogger(TestLog4j.class);

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        logger.debug("Hello from Log4j");
    }
}
