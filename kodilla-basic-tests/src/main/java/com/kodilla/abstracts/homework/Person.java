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
        Person person = new Person("Andy", new ProjectManager("", 0), 32);

        Job projectManager = new ProjectManager("", 0);
        Job scrumMaster = new ScrumMaster("", 0);
        Job javaDeveloper = new JavaDeveloper("", 0);

        if (person.getJob() instanceof ProjectManager) {
            System.out.println("First name: " + person.getName() + "\nAge: " + person.getAge() + "\nJob: " + person.getJob().getTitle());
            System.out.println("Responsibilities: " + person.getJob().responsibilities());
            System.out.println("Salary: " + person.getJob().salary());

        } else if (person.getJob() instanceof ScrumMaster) {
            System.out.println("First name: " + person.getName() + "\nAge: " + person.getAge() + "\nJob: " + person.getJob().getTitle());
            System.out.println("Responsibilities: " + person.getJob().responsibilities());
            System.out.println("Salary: " + person.getJob().salary());

        } else if (person.getJob() instanceof JavaDeveloper) {
            System.out.println("First name: " + person.getName() + "\nAge: " + person.getAge() + "\nJob: " + person.getJob().getTitle());
            System.out.println("Responsibilities: " + person.getJob().responsibilities());
            System.out.println("Salary: " + person.getJob().salary());

        } else {
            System.out.println("Please choose a job from the list:\n'Project manager'\n'Scrum master'\n'Java developer'");
        }
    }
}


