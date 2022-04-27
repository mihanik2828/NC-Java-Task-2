package src.ch1.ex6;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println(Main.factorial(a));
    }

    public static BigInteger factorial(int a)
    {
        if (a<2) return BigInteger.ONE;
        else return BigInteger.valueOf(a).multiply(factorial(a-1));
    }
}
