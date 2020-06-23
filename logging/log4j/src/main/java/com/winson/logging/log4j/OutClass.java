package com.winson.logging.log4j;

public class OutClass {
    // 内部类，是一个接口
    public interface HelloWorld {
        String sayHello(String name);
    }

    public void sayHello(String name) {
        // 这是一个局部类，因为有名字
        class ChineseSayHello implements HelloWorld {
            public String sayHello(String name) {
                return "你好，" + name;
            }
        }
        HelloWorld hello = new ChineseSayHello();
        // 这是一个匿名类：new + interface + () + 类体
        HelloWorld hello1 = new HelloWorld() {
            public String sayHello(String name) {
                return "Hello, " + name;
            }
        };
        System.out.println(hello.sayHello(name));
        System.out.println(hello1.sayHello(name));
    }
    public static void main(String[] args) {
        new OutClass().sayHello("Winson");
    }
}