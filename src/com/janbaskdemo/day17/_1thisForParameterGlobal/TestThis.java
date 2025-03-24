package com.janbaskdemo.day17._1thisForParameterGlobal;

public class TestThis
{
    public static void main(String[] args) {
        ThisAsGlobalVariable thisAsGlobalVariable= new ThisAsGlobalVariable("Jason", 32);
        System.out.println(thisAsGlobalVariable.getName());
        System.out.println(thisAsGlobalVariable.getAge());

        System.out.println("=========================================");
        thisAsGlobalVariable.setName("Kerrie");
        thisAsGlobalVariable.setAge(18);
        System.out.println(thisAsGlobalVariable.getName());
        System.out.println(thisAsGlobalVariable.getAge());
    }
}
