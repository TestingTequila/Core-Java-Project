package com.janbaskdemo.day22;

import java.util.Arrays;

public class RemoteWebDriver implements WebDriver, TakeScreenshot, JavaScripExecutor {
    public void checkVersion(int version) {
        System.out.println("RemoteWebDriver---checkVersion");
    }

    @Override
    public void findElement(String elementName) {
        System.out.println("RemoteWebDriver---findElement: " + elementName);
    }

    @Override
    public void findElements(String[] elements) {
        System.out.println("RemoteWebDriver---findElements: " + Arrays.toString(elements));
    }

    @Override
    public void get(String url) {
        System.out.println("RemoteWebDriver---get: " + url);
    }

    @Override
    public void getTitle(String pageTitle) {
        System.out.println("RemoteWebDriver---getTitle: " + pageTitle);
    }

    @Override
    public void getAttributeValue(String attributeName) {
        System.out.println("RemoteWebDriver---getAttributeValue: " + attributeName);
    }

    @Override
    public void close() {
        System.out.println("RemoteWebDriver---close ");
    }

    @Override
    public void refresh() {
        System.out.println("RemoteWebDriver---refresh ");
    }

    @Override
    public void takePicture(String picture) {
        System.out.println("RemoteWebDriver---takePicture " + picture);
    }

    @Override
    public void takeImage(String[] images) {
        System.out.println("RemoteWebDriver---takeImage " + images);
    }

    @Override
    public void JSElement(String elementName) {
        System.out.println("RemoteWebDriver---JSElement " + elementName);
    }

    @Override
    public void JSElements(String[] elements) {
        System.out.println("RemoteWebDriver---JSElements " + Arrays.toString(elements));
    }
}
