package OOPs;

public class Question3 {
//    Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
//    creating a class named 'Triangle' with the constructor having the three sides as its parameters.
public static void main(String[] args) {


    Tri tri = new Tri(3,4,5);
    int Peri = tri.Perimeter();
    int Area = tri.Area();

    System.out.println(Peri);
    System.out.println(Area);
}
}

class Tri {
    int x;
    int y,z;
    public Tri(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z=z;
    }
    public int Perimeter(){
        return x + y + z;
    }

    public int Area(){
        int s = Perimeter()/2;
        return (int) Math.sqrt(s * (s - x) * (s - y) * (s - z));
    }
}
