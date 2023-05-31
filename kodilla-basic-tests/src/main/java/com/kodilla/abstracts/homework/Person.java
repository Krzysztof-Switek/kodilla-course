package com.kodilla.abstracts.homework;

public class Person {

    private String name;
    private Job job;
    private int age;

    public Person(String name, Job job, int age) {
        this.name = name;
        this.job = job;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Job getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person person = new Person("Andy", new JavaDeveloper(), 32);
        person.jobDetails();
    }

    public void jobDetails() {
        String jobTitle = job.getTitle();
        String responsibilities = job.getResponsibilities();
        double salary = job.getSalary();

        System.out.println("First name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Job: " + jobTitle);
        System.out.println("Responsibilities: " + responsibilities);
        System.out.println("Salary: " + salary);
    }
}