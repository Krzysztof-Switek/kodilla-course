package com.kodilla.abstracts.homework;

public abstract class Job {
    private int salary;
    private String responsibilities;
    private String title;

    public Job(int salary, String responsibilities, String title) {
        this.salary = salary;
        this.responsibilities = responsibilities;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public int getSalary() {
        return salary;
    }
}



