package OOPs;


public class Question5 {
//    Write a program by creating an 'Employee' class having the following methods and print the final salary.
//1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
//2 - 'AddSal()' which adds  10000 to the salary of the employee if it is less than 5000.
//3 - 'AddWork()' which adds 1000 to the salary of an employee if the number of hours of work per day is more than 6 hours.

    public static void main(String[] args) {
        Employee employee = new Employee();
double salary = 4000;
int hours = 7;

employee.getInfo(salary,hours);
employee.AddSal(salary);
employee.AddWork(salary,hours);

    }
}

class Employee{

    public void getInfo(double salary,int hours){
        System.out.println("Salary of the person" + salary + " Hours he have to work" + hours);
    }

    public void AddSal(double salary){
        if(salary < 5000){
            salary += 10000;
        }

        System.out.println("Salary of person " + salary);
    }

    public void AddWork(double salary,double hours){
        if(hours > 6){
            salary += 1000;
            System.out.println("Salary of the person" + salary + " Hours he have to work" + hours);
        }
    }
}
