package com.janbaskdemo.day21.HospitalArchitecture;

public class TestHospital {
    public static void main(String[] args) {
        FortisHospital fh = new FortisHospital();
        System.out.println("=====USMedicalAssociation Services===============");
        fh.cardioServices();
        fh.neurologyServices();
        fh.physioServices();
        fh.covidVaccination();

        System.out.println("=====UKMedicalAssociation Services===============");
        fh.entServices();
        fh.dentalServices();

        System.out.println("=====IndianMedicalAssociation Services===============");

        fh.orthopedicServices();
        fh.gynecologyServices();
        fh.oncologyServices();

        System.out.println("=====Fortis Hospitals own  Services===============");
        fh.medicalTraining();
        fh.medicalInsurance();

        System.out.println("====Cannot create objects on an interface");
        //USMedicalAssociation uma = new USMedicalAssociation();
        //UKMedicalAssociation uma = new UKMedicalAssociation();
        //IndianMedicalAssociation uma = new IndianMedicalAssociation();

        System.out.println("==============Top Casting With USMedicalAssociation=================");
        USMedicalAssociation uma = new FortisHospital();
        uma.cardioServices();
        uma.neurologyServices();
        uma.physioServices();
        uma.covidVaccination();

        System.out.println("==============Top Casting With UKMedicalAssociation=================");
        UKMedicalAssociation ukma = new FortisHospital();
        ukma.entServices();
        ukma.dentalServices();

        System.out.println("==============Top Casting With IndianMedicalAssociation=================");
        IndianMedicalAssociation ima = new FortisHospital();
        ima.orthopedicServices();
        ima.gynecologyServices();
        ima.oncologyServices();

        System.out.println("==============Top Casting With Hospital Class=================");
        Hospital hospital= new FortisHospital();
        hospital.medicalRD();
        hospital.medicalNews();// Hospital--medicalNews

        System.out.println("=====Extending Hospital Class  Services ===============");
        fh.medicalRD();
        fh.medicalNews();// Hospital--medicalNews

        System.out.println("====Creating object of Hospital=============");
        Hospital hospital1 = new Hospital();
        hospital1.medicalNews();// Hospital ----News




    }
}
