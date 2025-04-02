package com.janbaskdemo.day21.HospitalArchitecture;

public interface USMedicalAssociation extends WHO, UHO {

    int x = 12;
    String name = "Ashish";

    public void cardioServices();

    public void neurologyServices();

    public void physioServices();

    public static void taxCalculation() {
        System.out.println("USMedicalAssociation --taxCalculation");
    }

    default void getMedicalServices() {
        System.out.println("USMedicalAssociation --getMedicalServices");
    }
}
