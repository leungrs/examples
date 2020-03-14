package com.winson.logging.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloService {
    private static Logger logger = LogManager.getLogger(HelloService.class);

    public String sayHello(String name) {
        logger.trace("HelloService.sayHello trace");
        logger.debug("HelloService.sayHello debug");
        logger.info("HelloService.sayHello info");
        logger.warn("HelloService.sayHello warn");
        logger.error("HelloService.sayHello error");
        logger.fatal("HelloService.sayHello fatal");
        return "Hello " + name;

    }
}
