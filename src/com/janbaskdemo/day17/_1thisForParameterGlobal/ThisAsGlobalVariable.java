package com.janbaskdemo.day17._1thisForParameterGlobal;

public class ThisAsGlobalVariable
{

    private String name;
    private int age;

    ThisAsGlobalVariable(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public  void setAge(int age)
    {
        this.age=age;
    }

    public  String getName()
    {
        return name;
    }

    public  int getAge()
    {
        return age;
    }



}
