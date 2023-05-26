package com.kodilla.abstracts.homework;

public class ProjectManager extends Job {
    private static final int SALARY = 8000;
    private static final String RESPONSIBILITIES = "Develop and maintain software applications";
    private static final String TITLE = "Project Manager";

    public ProjectManager() {
        super(SALARY, RESPONSIBILITIES, TITLE);
    }
}
