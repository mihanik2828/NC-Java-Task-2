package src.ch1.ex2;

import static java.lang.System.in;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        System.out.println("hello");
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println(a%360);
        System.out.println(Math.floorMod(a+0,360));
    }
}
