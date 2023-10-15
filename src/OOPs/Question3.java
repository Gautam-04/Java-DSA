package OOPs;

public class Question3 {
//    Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
//    creating a class named 'Triangle' with the constructor having the three sides as its parameters.
public static void main(String[] args) {
    int a = 3;
    int b = 4;
    int z = 5;

    Tri tri = new Tri();
    int Peri = tri.Perimeter(a,b,z);
    int Area = tri.Area(a,b,z);

    System.out.println(Peri);
    System.out.println(Area);
}
}

class Tri {
    public int Perimeter(int x,int y,int z){
        return x + y + z;
    }

    public int Area(int x,int y, int z){
        int s = Perimeter(x,y,z);
        return (int) Math.sqrt(s * (s - x) * (s - y) * (s - z));
    }
}
