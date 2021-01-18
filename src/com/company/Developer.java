package com.company;

public class Developer extends Employee{
    private boolean Java;
    private boolean CPP;

    public Developer(String name, int monthsOfApprenticeship, double wage, boolean java, boolean CPP) {
        super(name, monthsOfApprenticeship, wage);
        Java = java;
        this.CPP = CPP;
    }

    public boolean isJava() {
        return Java;
    }

    public void setJava(boolean java) {
        Java = java;
    }

    public boolean isCPP() {
        return CPP;
    }

    public void setCPP(boolean CPP) {
        this.CPP = CPP;
    }

    @Override
    public String toString() {
        return "Developer{ " + super.toString() +
                ", Java=" + Java +
                ", CPP=" + CPP +
                '}';
    }
}
