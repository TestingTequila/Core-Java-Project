package com.janbaskdemo.day13;

public class LaunchBrowserUsingSwitch {
    public String openBrowser(String browserName) {
        String message = "Please provide a valid Browser Name";

        switch (browserName) {
            case "Chrome":
                message = "Launch Chrome Browser...";
                break;
            case "Firefox":
                message = "Launch Firefox Browser...";
                break;
            case "Edge":
                message = "Launch Edge Browser...";
                break;
            case "Safari":
                message = "Launch Safari Browser...";
                break;
        }
        return message;
    }
}
