package com.driver;

public class Main {
    public static void main(String[] args) {
        A objA=new A();
        B objb=new B();

        //calling method of A class from object of B
        String str=objb.meth();
        System.out.println(str);

        // calling class A overridden method from B
        String str1=objb.meth();
        System.out.println(str1);


    }
  
}