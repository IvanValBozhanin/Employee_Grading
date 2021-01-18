package com.company;


public class Main {

    public static Employee [] emp = new Employee[1000];
    public static int n = 0;

    public static void main(String[] args) {
        addDev( "adf", 3421.34, 21, true, true);
        addDev( "df", 66, 21, false, true);
        addMan( "ff", 21.34, 21 ,12);
        addMan( "Z", 7547, 21, 34);

        printAll();
        System.out.println("Sum of wages: " + sumOfWages());
        System.out.println("--------------------------");
        removeEmployee("df");
        printAll();
        System.out.println("Sum of wages: " + sumOfWages());

        System.out.println("--------------------------");
        removeEmployee("ddd"); // exception is thrown
        printAll();

        System.out.println("--------------------------");
        correctWage("Z", 1000);
        System.out.println("Sum of wages: " + sumOfWages());
        printAll();

        System.out.println("--------------------------");
        correctWage("ASASAS", 1232131);  // exception is thrown
        System.out.println("Sum of wages: " + sumOfWages());
    }

    public static void addDev(String name, double wage, int months, boolean j, boolean c){
        emp[n] = new Developer(name, months, wage, j, c);
        ++ n;
    }

    public static void addMan(String name, double wage, int months, int people){
        emp[n] = new Manager(name, months, wage, people);
        ++ n;
    }

    public static void removeEmployee(String name){
        try{
            for(int i=0;i<n;++i){
                if(emp[i] != null) {
                    if (emp[i].getName().equals(name)) {
                        emp[i] = null;
                        return;
                    }
                }
            }
            throw new Exception("No such person exists!!!");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static double sumOfWages(){
        double d = 0.0;
        for(int i=0;i<n;++i){
            if(emp[i] != null){
                d += emp[i].getWage();
            }
        }
        return d;
    }

    public static void correctWage(String name, int newWage){
        try{
            for(int i=0;i<n;++i){
                if(emp[i] != null) {
                    if (emp[i].getName().equals(name)) {
                        emp[i].setWage(newWage);
                        return;
                    }
                }
            }
            throw new Exception("No such person exists!!!");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void printAll(){
        for(int i=0;i<n;++i){
            if(emp[i] != null){
                System.out.println(emp[i].toString());
            }
        }
    }
}
