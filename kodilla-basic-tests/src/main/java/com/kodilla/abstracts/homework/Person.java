package com.kodilla.abstracts.homework;

public class Person {

    String name;
    String job;
    int age;
    public Person(String name, String job, int age) {
        this.name = name;
        this.job = job;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person("Andy","Project manager",32);

        Job projectManager = new ProjectManager("",0);
        Job scrumMaster = new ScrumMaster("", 0);
        Job javadeveloper = new JavaDeveloper("", 0);

        if (person.job.equals("Project manager")) {
            System.out.println("First name: "  + person.name + "\nAge:" + person.age + "\nJob: " + person.job);
            System.out.println("Responsibilities: " + projectManager.responsibilities());
            System.out.println("Salary:"+ projectManager.salary());

        } else if (person.job.equals("Scrum master")) {
            System.out.println("First name: "  + person.name + "\nAge:" + person.age + "\nJob: " + person.job);
            System.out.println("Responsibilities: " + scrumMaster.responsibilities());
            System.out.println("Salary: "+ scrumMaster.salary());

        }else if (person.job.equals("Java developer")) {
            System.out.println("First name: "  + person.name + "\nAge:" + person.age + "\nJob: " + person.job);
            System.out.println("Responsibilities: " + javadeveloper.responsibilities());
            System.out.println("Salary: "+ javadeveloper.salary());

        }else {
            System.out.println("Please choose a job from the list :\n'Project manager'\n'Scrum master' \n'Java developer'");
        }
    }
}

