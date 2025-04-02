package com.janbaskdemo.day21.HospitalArchitecture;

public class TestHospital {
    public static void main(String[] args) {
        FortisHospital fh = new FortisHospital();
        System.out.println("=====USMedicalAssociation Services===============");
        fh.cardioServices();
        fh.neurologyServices();
        fh.physioServices();
        fh.covidVaccination();
        fh.getMedicalServices();
        FortisHospital.taxCalculation();
        USMedicalAssociation.taxCalculation();


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
        uma.getMedicalServices();


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
        Hospital hospital = new FortisHospital();
        hospital.medicalRD();
        hospital.medicalNews();// Hospital--medicalNews

        System.out.println("=====Extending Hospital Class  Services ===============");
        fh.medicalRD();
        fh.medicalNews();// Hospital--medicalNews

        System.out.println("====Creating object of Hospital=============");
        Hospital hospital1 = new Hospital();
        hospital1.medicalNews();// Hospital ----News

        System.out.println("=================Calling Variables from an Interface=====");
        System.out.println(USMedicalAssociation.x);
        System.out.println(USMedicalAssociation.name);

        //USMedicalAssociation.x =14; since the variable of an interface is final by default, this value cannot be
        //overridden or changed

        // We cannot create object on an Abstract class
        // Abstract class can have constructors
        // We cannot create object of an Interface
        // Interface cannot have constructors
        // Interface variables will be static and final by default

        //5-	Static method from class can be inherited into child class
        //      but static method from parent interface cannot be inherited in child class.

        //Summary:
        //1. An interface can have static method, this cannot be inherited
        //2. An interface can have concrete method, provided that its access modifier is default

        System.out.println(TestData.BROWSER_NAME);
        System.out.println(TestData.EMAIL_ID);
        System.out.println(TestData.PASSWORD);
    }
}
