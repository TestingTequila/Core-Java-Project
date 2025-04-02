package com.janbaskdemo.day22;

public interface WebDriver extends SearchContext {

    @Override
    public void findElement(String elementName);

    @Override
    public void findElements(String[] elements);

    public void get(String url);

    public void getTitle(String pageTitle);

    public void getAttributeValue(String attributeName);

    public void close();

    public void refresh();
}
