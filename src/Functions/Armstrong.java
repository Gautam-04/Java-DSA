package Functions;

public class Armstrong {
    public static void main(String[] args) {
        int min = 100, max = 999;
        int i, digit, sum;

        System.out.println("Arm strong number between" + " "+ min + " " + max);
        armstrong();
    }
    static void armstrong(){
        int i, digit, sum;
        for (i = 100; i <= 999; i++)
        {
            digit = i;
            sum = 0;
            while (digit > 0)
            {
                int cube = (digit % 10) * (digit % 10) * (digit % 10);
                sum += cube;
                digit /= 10;
            }
            if (sum == i)
            {
                System.out.println(i);
            }
        }

    }
}
