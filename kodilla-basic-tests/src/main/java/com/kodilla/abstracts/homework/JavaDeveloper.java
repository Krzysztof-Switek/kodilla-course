package com.kodilla.abstracts.homework;

public class JavaDeveloper extends Job{

    private final String responsibilities;
    private final int salary;

    public JavaDeveloper(String responsibilities, int salary){
        this.salary = salary();
        this.responsibilities = responsibilities();
    }
    @Override
    public int salary() {
        return 9000;
    }

    @Override
    public String responsibilities() {
        return "Designing, implementing, and maintaining Java-based software and applications";
    }
    }


