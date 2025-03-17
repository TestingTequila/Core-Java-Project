package com.janbaskdemo.day13;

public class EmployeeDevicesUsingSwitch
{
    public  String[]  empDevices(String empName)
    {
        String[] devices = null;
        switch (empName)
        {
            case "Kerrie":
                devices = new String[] {"Desktop", "MacBook", "iphone", "3DVisualizer"};
                break;
            case "Jason":
                devices = new String[] {"MacBook", "iphone"};
                break;
            case "Rose":
                devices = new String[] {"iphone", "3DVisualizer"};
                break;
            case "Roger":
                devices = new String[] {"Laptop", "MacBook", "iphone"};
                break;
        }
        return devices;
    }
}
