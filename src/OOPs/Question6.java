package OOPs;

public class Question6 {
//    We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B.
//    Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students.
//    The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student
//    B. Create an object for each of the two classes and print the percentage of marks for both the students.
    public static void main(String[] args) {
 A studentA = new A(84,72,45);
 B studentB = new B(54,75,98,65);

 float percentageA = studentA.getPercentage();
        System.out.println(percentageA);

        float percentageB = studentB.getPercentage();
        System.out.println(percentageB);
    }
}

abstract class Marks{
   abstract float getPercentage();
}

class A extends Marks{
    public int subject1;
    public int subject2;
    public int subject3;
    public A(int x,int y,int z){
        this.subject1 = x;
        this.subject2 = y;
        this.subject3 = z;
    }

    @Override
    public float getPercentage() {
      float  totalScore = ((float) (subject1 + subject2 + subject3) /300) * 100;
        return totalScore;
    }
}

class B extends Marks{
    public int subject1;
    public int subject2;
    public int subject3;
    public int subject4;
    public B(int x,int y,int z,int a){
        this.subject1 = x;
        this.subject2 = y;
        this.subject3 = z;
        this.subject4 = a;
    }

    @Override
    public float getPercentage(){
        float  totalScore = ((float) (subject1 + subject2 + subject3 + subject4)/400) * 100;
        return totalScore;
    }
}
