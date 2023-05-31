package com.kodilla.collections.adv.immutable.homework;

import com.kodilla.collections.adv.immutable.BookRecord;

public class Task {
    protected String title;
    protected int duration;
    public Task (String title, int duration){
        this.duration = duration;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public static void main(String[] args) {
        TaskRecord taskRecord= new TaskRecord("Task_title", 77);
    }
}



