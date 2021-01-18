package com.company;

public class Manager extends Employee{
    private int numOfPeople;

    public Manager(String name, int monthsOfApprenticeship, double wage, int numOfPeople) {
        super(name, monthsOfApprenticeship, wage);
        this.numOfPeople = numOfPeople;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    @Override
    public String toString() {
        return "Manager{ " + super.toString() +
                ", numOfPeople=" + numOfPeople +
                '}';
    }
}
