package com.janbaskdemo.day21.HospitalArchitecture;

public abstract class Transportation
{
    int x ;
    public Transportation()
    {

    }
    public abstract void ambulanceServices();


    public  void airAmbulanceServices()
    {
        System.out.println("Transportation----airAmbulanceServices");
    }

    public  void PickNDropServices()
    {
        System.out.println("Transportation----PickNDropServices");
    }
}
