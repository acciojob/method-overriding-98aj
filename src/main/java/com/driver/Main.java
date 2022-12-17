package com.driver;

public class Main {
 static class A{
        public static String met(){
            String s = "Invoking method from class A";
            return s;
        }
    }
    static class B extends A{
        public static String met(){
            String s1 = "Method is overridden in Extendend class B";
            return s1;
        }
    }
    public static void main(String[] args) {
        B st = new B();
        System.out.println(st.met());
    }
}
