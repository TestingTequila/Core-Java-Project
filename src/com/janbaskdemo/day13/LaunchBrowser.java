package com.janbaskdemo.day13;

public class LaunchBrowser {
    public String openBrowser(String browserName) {
        if (browserName.equals("Chrome")) {
            return "Launch Chrome Browser....";
        } else if (browserName.equals("Firefox")) {
            return "Launch Firefox Browser....";
        } else if (browserName.equals("Edge")) {
            return "Launch Edge Browser....";
        } else if (browserName.equals("Safari")) {
            return "Launch Safari Browser....";
        } else {
            return browserName + " Please enter a valid browser Name";
        }
    }
}
