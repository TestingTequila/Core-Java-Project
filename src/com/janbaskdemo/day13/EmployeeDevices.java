package com.janbaskdemo.day13;

public class EmployeeDevices
{
    public String[] employee(String empName)
    {
        String[] myDevices = null;

        if(empName.equals("Jason"))
        {
            String[] devices={"MacBook", "iphone"};
             myDevices= devices;
        }
        else if(empName.equals("Roger"))
        {
            String[] devices={"Laptop", "MacBook", "iphone"};
            myDevices=  devices;
        }
        else if(empName.equals("Kerrie"))
        {
            String[] devices={"Desktop", "MacBook", "iphone", "3DVisualizer"};
            myDevices=  devices;
        }
        else if(empName.equals("Rose"))
        {
            String[] devices={"iphone", "3DVisualizer"};
            myDevices=  devices;
        }
            return myDevices;
    }
}
