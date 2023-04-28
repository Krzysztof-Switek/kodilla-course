package com.kodilla.abstracts.homework;

public class ScrumMaster extends Job{
    private final String responsibilities;
    private final int salary;

    public ScrumMaster(String responsibilities, int salary){
        this.salary = salary();
        this.responsibilities = responsibilities();
    }
    @Override
    public int salary() {
        return 5000;
    }

    @Override
    public String responsibilities() {
        return "Keep the team organized, on track, and focused on what matters.";
    }
    }



