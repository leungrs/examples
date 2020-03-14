package com.winson.logging.log4j;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        logger.trace("trace");
        logger.debug("debug");
        logger.info("debug");
        logger.warn("warn");
        logger.error("error");
        logger.fatal("fatal");

        HelloService service = new HelloService();
        service.sayHello("Winson");
    }
}
