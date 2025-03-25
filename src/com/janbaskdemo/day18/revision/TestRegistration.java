package com.janbaskdemo.day18.revision;

public class TestRegistration {
    public static void main(String[] args) {
        System.out.println("==============Assigning Value using Constructor==============");
        RegistrationUsingConstructors registration = new RegistrationUsingConstructors("Jason", "Roger", 12, 'm', 1231.34, "jason.roger@gmail.com", "test@1234");
        registration.display();

        System.out.println("==============Assigning Value using Setter==============");
        RegistrationUsingSetter rus = new RegistrationUsingSetter();
        rus.setfName("Kerrie");
        rus.setlName("Wright");
        rus.setAge(24);
        rus.setGender('f');
        rus.setSalary(1234.56);
        rus.setEmail("kerrie.wright@janbask.com");
        rus.setPassword("test@1234");
        rus.display();

        System.out.println("==============Assigning Value using BuilderPattern==============");
        RegistrationUsingBuilderPattern rubt = new RegistrationUsingBuilderPattern();
        rubt.setfName("Ben")
                .setlName("Fletcher")
                .setAge(32).setGender('m')
                .setSalary(5436.78)
                .setEmail("ben.fletcher@janbask.com")
                .setPassword("test@1234").display();
        System.out.println("--------------------------------------------");

        RegistrationUsingBuilderPattern rubtn = new RegistrationUsingBuilderPattern();
        rubtn.setfName("Chris").setAge(60).setPassword("Test@9876").display();

        RegistrationUsingBuilderPattern rubt1 = new RegistrationUsingBuilderPattern();
        rubt1.setfName("Ronil").setlName("Hill").setEmail("ronil.hill@janbask.com").setPassword("test@4456").display();
        System.out.println("====Updating Password on Ronil=============");
        rubt1.updateUser(rubt1);
        rubt1.setfName("Ronil").setlName("Hill").display();

        System.out.println("=====Using Setter methods for updating values of global variables=======");

        RegistrationUsingConstructorsAndSetters rucs = new RegistrationUsingConstructorsAndSetters("Dan", "Brown", "dan.brown@janbask.com", "test@1122");
        rucs.display();
        System.out.println("=====After Updating using Setter Method===============");
        rucs.setPassword("Test@XYZ");
        rucs.display();


    }
}
