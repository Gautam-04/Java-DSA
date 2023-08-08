package Switches;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String Department = in.next();

//        switch(empID){
//            case 1:
//                System.out.println("Gautam");
//                break;
//            case 2:
//                System.out.println("Ayush");
//                break;
//            case 3:
//                System.out.println("Emp NO 3");
//                switch (Department) {
//                    case "IT" -> System.out.println("IT Department");
//                    case "Management" -> System.out.println("Management Department");
//                    default -> System.out.println("No department");
//                }
//                break;
//            default:
//                System.out.println("Enter correct value");
//        }

        switch (empID) {
            case 1 -> System.out.println("Gautam");
            case 2 -> System.out.println("Ayush");
            case 3 -> {
                System.out.println("Emp NO 3");
                switch (Department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department");
                }
            }
            default -> System.out.println("Enter correct value");
        }
    }
}
