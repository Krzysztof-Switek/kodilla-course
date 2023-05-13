package com.kodilla.abstracts.homework;

public class Person {
    public static void main(String[] args) {
        String firstName = "Arek";
        int age = 30;
        String job = "Java developer";
        Job projectManager = new ProjectManager("",0);
        Job scrumMaster = new ScrumMaster("", 0);
        Job javadeveloper = new JavaDeveloper("", 0);

        System.out.println("First name: "  + firstName + "\nAge:" + age+ "\nJob: " + job);

        if (job.equals("Project manager")) {
                        System.out.println("Responsibilities: " + projectManager.responsibilities());
            System.out.println("Salary:"+ projectManager.salary());

        } else if (job.equals("Scrum master")) {
            System.out.println("Responsibilities: " + scrumMaster.responsibilities());
            System.out.println("Salary: "+ scrumMaster.salary());

        }else if (job.equals("Java developer")) {
            System.out.println("Responsibilities: " + javadeveloper.responsibilities());
            System.out.println("Salary: "+ javadeveloper.salary());

        }else {
            System.out.println("Please choose a job from the list :\n'Project manager'\n'Scrum master' \n'Java developer'");
        }
    }
    public Person( String firstName, int age, String job) {}
}
