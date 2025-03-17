package com.janbaskdemo.day13;

import java.util.Arrays;

public class TestEmployeeDevicesUsingSwitch {
    public static void main(String[] args) {
        EmployeeDevicesUsingSwitch employeeDevicesUsingSwitch = new EmployeeDevicesUsingSwitch();
        String[] myDevices = employeeDevicesUsingSwitch.empDevices("Kerrie");
        System.out.println(Arrays.toString(myDevices));
        System.out.println(Arrays.toString(employeeDevicesUsingSwitch.empDevices("Ashish")));
    }
}
