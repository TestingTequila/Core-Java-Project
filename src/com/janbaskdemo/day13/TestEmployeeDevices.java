package com.janbaskdemo.day13;

import java.util.ArrayList;
import java.util.Arrays;

public class TestEmployeeDevices {
    public static void main(String[] args) {
        EmployeeDevices employeeDevices = new EmployeeDevices();
        String[] devices = employeeDevices.employee("Rose");
        System.out.println(Arrays.toString(devices));

    }
}
