package com.company;

public class Employee {
    private String name;
    private int monthsOfApprenticeship;
    private double wage;


    public Employee(String name, int monthsOfApprenticeship, double wage) {
        this.name = name;
        this.monthsOfApprenticeship = monthsOfApprenticeship;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonthsOfApprenticeship() {
        return monthsOfApprenticeship;
    }

    public void setMonthsOfApprenticeship(int monthsOfApprenticeship) {
        this.monthsOfApprenticeship = monthsOfApprenticeship;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", monthsOfApprenticeship=" + monthsOfApprenticeship +
                ", wage=" + wage;
    }
}
