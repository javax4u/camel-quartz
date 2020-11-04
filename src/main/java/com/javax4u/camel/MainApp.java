package com.javax4u.camel;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    Logger logger = Logger.getLogger(MainApp.class);

    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-camel.xml");
        ctx.start();
        System.out.println("Application context started");
        try {
            Thread.sleep(6 * 60 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ctx.stop();
        ctx.close();
    }
}
