package OOPs;

import javax.print.attribute.standard.MediaName;

public class Question13 {
//    Write a Java program to create a class Employee with a method called calculateSalary().
//    Create two subclasses Manager and Programmer. In each subclass, override the calculateSalary()
//    method to calculate and return the salary based on their specific roles.

    public static void main(String[] args) {
        Manager manage = new Manager("John",40000,4);
        manage.display("John",40000,4);
        System.out.println(manage.calculateSalary(40000));
    }
}

class Employ{
    private String name;

    public  Employ(String name){
        this.name = name;
    }
    double calculateSalary(double salary){
        return 0.0;
    }
}

class Manager extends Employ{

    private double salary;
    private int NoOfYears;

    public Manager(String name, double salary,int NoOfYears){
        super(name);
        this.salary = salary;
        this.NoOfYears = NoOfYears;
    }

    void display(String name,double salary,int NoOfYears){
        System.out.println(name);
        System.out.println(salary);
        System.out.println(NoOfYears);
    }
    @Override
    double calculateSalary(double salary){
        return salary*NoOfYears;
    }
}

class Programmer extends Employ{

    public Programmer(String name) {
        super(name);
    }
}
