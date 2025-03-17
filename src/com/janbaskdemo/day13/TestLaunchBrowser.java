package com.janbaskdemo.day13;

public class TestLaunchBrowser {
    public static void main(String[] args) {
        LaunchBrowser launchBrowser = new LaunchBrowser();
        String message =launchBrowser.openBrowser("Chrome");
        System.out.println(message);
    }
}
