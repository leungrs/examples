package com.winson.logging.log4j;

import org.apache.logging.log4j.Logger;

public abstract class Util {
    public static void log(Logger logger) {
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        logger.fatal("fatal");
    }
}
