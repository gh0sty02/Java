package com.pranay;

public class InnerClasses {
     static class Test{
         String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Pranay");
        Test b = new Test("Hello");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
