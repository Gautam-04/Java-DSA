package Conditionals;

public class Main {
    public static void main(String[] args) {
        /*
        syntax of if statements:-
        if(condition){
        //body
        } else{
         //body
        }
        */
         int salary = 25400;
         if(salary > 10000){
             salary += 2000;
         } else {
             salary += 1000;
         }

         //else if is also present

        System.out.println(salary);
    }
}
