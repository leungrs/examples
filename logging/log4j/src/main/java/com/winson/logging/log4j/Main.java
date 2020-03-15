package com.winson.logging.log4j;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        Util.log(logger);
        HelloService service = new HelloService();
        service.sayHello("Winson");
    }
}
