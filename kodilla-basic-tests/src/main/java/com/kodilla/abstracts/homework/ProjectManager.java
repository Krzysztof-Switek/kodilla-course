package com.kodilla.abstracts.homework;

public class ProjectManager extends Job{

    private String responsibilities;
    private int salary;

    public ProjectManager(String responsibilities, int salary){
        this.salary = salary();
        this.responsibilities = responsibilities();
    }
    @Override
    public int salary() {
        return 8000;
    }
    @Override
    public String responsibilities() {
        return "Develop and maintain software applications";
    }
}
