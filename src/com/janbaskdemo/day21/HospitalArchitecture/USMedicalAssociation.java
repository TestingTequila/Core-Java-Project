package com.janbaskdemo.day21.HospitalArchitecture;

public interface USMedicalAssociation extends WHO, UHO
{
    public void cardioServices();
    public void neurologyServices();
    public void physioServices();
}
