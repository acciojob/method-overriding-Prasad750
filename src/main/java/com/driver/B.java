package com.driver;

class B extends A{

    B()
    {
        System.out.println(super.meth());
    }
    @Override
    String meth()
    {
        return "Method is overridden in Extended class B";
    }

}
