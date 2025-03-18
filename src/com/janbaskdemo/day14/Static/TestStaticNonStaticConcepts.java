package com.janbaskdemo.day14.Static;

public class TestStaticNonStaticConcepts {
    public static void main(String[] args) {

        StaticNonStaticConcepts c1 = new StaticNonStaticConcepts();
        c1.nonStaticInteger = 12;
        c1.nonStaticString = "Jason";
        c1.nonStaticM1();
        c1.nonStaticM2();
        c1.nonStaticM1();
        StaticNonStaticConcepts.staticM1();
        StaticNonStaticConcepts.staticM2();
        StaticNonStaticConcepts.staticM3();
        StaticNonStaticConcepts.staticString = "Ashish";
        StaticNonStaticConcepts.staticInteger = 34;

    }
}
