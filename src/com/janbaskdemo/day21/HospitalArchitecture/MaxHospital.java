package com.janbaskdemo.day21.HospitalArchitecture;

public class MaxHospital extends Transportation implements USMedicalAssociation, UKMedicalAssociation
{

    @Override
    public void ambulanceServices() {
        System.out.println("MaxHospital----ambulanceServices");
    }

    @Override
    public void roboticServices() {

    }

    @Override
    public void cardioServices() {

    }

    @Override
    public void neurologyServices() {

    }

    @Override
    public void physioServices() {

    }

    @Override
    public void covidVaccination() {

    }

    @Override
    public void entServices() {

    }

    @Override
    public void dentalServices() {

    }
}
