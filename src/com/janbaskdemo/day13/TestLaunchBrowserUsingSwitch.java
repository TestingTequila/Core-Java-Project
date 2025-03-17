package com.janbaskdemo.day13;

public class TestLaunchBrowserUsingSwitch
{
    public static void main(String[] args) {
        LaunchBrowserUsingSwitch launchBrowserUsingSwitch = new LaunchBrowserUsingSwitch();
        String launchingBrowser=launchBrowserUsingSwitch.openBrowser("ABCD");
        System.out.println(launchingBrowser);
        System.out.println(launchBrowserUsingSwitch.openBrowser("ABCD"));
    }
}
