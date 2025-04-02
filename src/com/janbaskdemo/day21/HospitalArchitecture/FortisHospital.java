package com.janbaskdemo.day21.HospitalArchitecture;

public class FortisHospital extends Hospital implements USMedicalAssociation, UKMedicalAssociation, IndianMedicalAssociation {

    @Override
    public void cardioServices() {
        System.out.println("FH---cardioServices");
    }

    @Override
    public void neurologyServices() {
        System.out.println("FH---neurologyServices");
    }

    @Override
    public void physioServices() {
        System.out.println("FH---physioServices");
    }

    @Override
    public void entServices() {
        System.out.println("FH---entServices");
    }

    @Override
    public void dentalServices() {
        System.out.println("FH---dentalServices");
    }

    @Override
    public void orthopedicServices() {
        System.out.println("FH---orthopedicServices");
    }

    @Override
    public void gynecologyServices() {
        System.out.println("FH---gynecologyServices");
    }

    @Override
    public void oncologyServices() {
        System.out.println("FH---oncologyServices");
    }

    public void medicalTraining() {
        System.out.println("FH---medicalTraining");
    }

    public void medicalInsurance() {
        System.out.println("FH---medicalInsurance");
    }

    @Override
    public void covidVaccination() {
        System.out.println("FH---covidVaccination");
    }

    @Override
    public void roboticServices() {
        System.out.println("fh----roboticServices");
    }

    public static void taxCalculation() {
        System.out.println("Fortis Hospital --taxCalculation");
    }

    @Override
    public void getMedicalServices() {
        System.out.println("FortisHospital --getMedicalServices");
    }

// cannot override medicalNews as this is final
//    @Override
//    public void medicalNews() {
//        System.out.println("FH---medicalNews");
//    }
}
