package com.test;

import org.apache.log4j.Logger;

public class App {

    private  static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {
        logger.debug("debug........");
        logger.info("info........... ");
        logger.error("error........");
    }
}
