package com.kodilla.execution_model.homework;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Order {
    private double value;
    private Date date;


    public Order(double value, Date date) {
        this.value = value;
        this.date = date;

    }

    public double getValue() {
        return value;
    }

    public Date getDate() {
        return date;
    }


}



