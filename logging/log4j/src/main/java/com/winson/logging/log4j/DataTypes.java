package com.winson.logging.log4j;

public class DataTypes {
    private byte b = -128;
//    private byte bb = null;
    private byte b1 = 0x10;
    private short s = 1;
    private short s1 = 0b1010101;
    private int i = 3;
    private long l = 4;
    private long l1 = 1000000000000000L;
    private long l2 = 0x100000000000L;
    private boolean flag = false;
    private char c = 'C';
    private char c1 = '\uffff';
    private float f = 1.0f;
    private float f2 = 1.02e2f;
//    private float f1 = 1.0;
    private double d = 2.0e2;
    private double d2 = 2.0e10;
    private double d1 = 1.0f;

    private String str1 = "abc";
    private String str2 = null;
    private String hello = "Hello, \"World\"";

    private Object clazz = String.class; // 类字面量

    public void print() {
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(l1);
        System.out.println(flag);
        System.out.println(c);
        System.out.println(f);
        System.out.println(d);
    }

    private void printNumbers() {
        int[] array = new int[10];
        for(int i:array) {
            System.out.println(i);
        }
    }

    private void printObjectArray() {
        HelloService[] array = new HelloService[3];
        array[0] = new HelloService();
        for(HelloService s:array) {
            System.out.println(s);
        }
        int[] a = {1, 2, 3};
    }

    public static void main(String[] args) {
        DataTypes dataTypes = new DataTypes();
//        dataTypes.print();
//        dataTypes.printNumbers();
        dataTypes.printObjectArray();
    }
}
