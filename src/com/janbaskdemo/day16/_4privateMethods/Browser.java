package com.janbaskdemo.day16._4privateMethods;

public class Browser
{
    private void checkRAM()
    {
        System.out.println("Checking RAM....");
    }

    private void checkVersion()
    {
        System.out.println("Checking Version....");
    }

    private void checkOS()
    {
        System.out.println("Checking OS....");
    }

    private void checkBrowserServices()
    {
        System.out.println("Checking OS....");
    }

    public  void launchBrowser()
    {
        checkRAM();
        checkOS();
        checkVersion();
        checkBrowserServices();
        System.out.println("Launched Chrome Browser.....");
    }
}
