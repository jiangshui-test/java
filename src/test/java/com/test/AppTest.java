package com.test;

import org.apache.log4j.Logger;

public class AppTest {

    private  static Logger logger = Logger.getLogger(AppTest.class);

    public static void main(String[] args) {
        logger.debug("debug test........");
        logger.info("info test........... ");
        logger.error("error test........");
    }
}
