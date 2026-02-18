import java.util.*;

class power_of_two {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        power_of_two obj = new power_of_two();

        if(obj.isPowerOfTwo(n))
            System.out.println("It is a power of 2");
        else
            System.out.println("It is NOT a power of 2");
    }

    public boolean isPowerOfTwo(int n) {
        if(n < 1)
            return false;

        while(n % 2 == 0)
            n /= 2;

        return n == 1;
    }
}