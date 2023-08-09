package com.driver;

public class Main {

    public static class A{
        public String meth()
        {
            return "Invoking method from class A";

        }
    }
    public static class B
    {
        public String meth()
        {
           return "Method is overridden in Extendend class B";

        }
    }
    public static void main(String[] args) {
        A objA=new A();
        B objb=new B();

        //calling method of A class from object of B
        String str=objb.meth();
        System.out.println(str);
        String str1=objb.meth();
        System.out.println(str1);




    }
  
}