package src.ch1.ex8;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String a = sc.nextLine();
        for (int i = 0; i < a.length(); i++)
            for (int j = 0; j < a.length(); j++) {
                if(i<j)
                    System.out.println(a.substring(i, j));
            }
    }

    public static void lotery(int[] list)
    {
        Random random = new Random();
        for(int i=0;i<6;i++)
        {
            if(list[i]!=1)
            list[random.nextInt(50)]=1;
            else i--;
        }
    }
}
