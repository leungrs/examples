package com.winson.logging.log4j;

class ModifierDemo {
    private int a;

    private static int sa = 7;

    public ModifierDemo(int a) {
        this.a = a;
    }

    public double doSomething(int d) {
        double c = 10;
        int b = 9;

        class Local {
            private int b;
            private static final int f = 10;

            private Local(int b) {
                this.b = b;
            }

            private double sqrt() {
//                 c -=2;
                a -= 3;
                sa -= 1;
                return a + d + sa + +c * Math.sqrt((double) b);
            }
        }

        Local l = new Local(9);
        return l.sqrt();
    }


    public static void main(String[] args) {
        ModifierDemo d = new ModifierDemo(4);
        System.out.println(d.doSomething(10));
    }
}
