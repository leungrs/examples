package com.winson.logging.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloService {
    private static Logger logger = LogManager.getLogger(HelloService.class);

    private int a;

    private String name;

    private boolean flag;

    public String sayHello(String name) {
        Util.log(logger);
        return "Hello " + name;
    }

    @Override
    public String toString() {
        return name + "_" + flag + "_" + a;
    }
}
