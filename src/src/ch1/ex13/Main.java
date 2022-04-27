package src.ch1.ex13;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] list = new int[49];
        //System.out.println(list)
        //for (int i = 0; i < 8; i++)
        for (int i = 0; i < 6; i++)
        Main.lotery(list);

       // for (int i = 0; i < 49; i++) если раскомментить этот цикл и сверху, убрав тот, что под ним, можно увидеть правильность работы программы
         //   if(list[i]!=1) System.out.println((i+1));
    }

    public static void lotery(int[] list) {
        Random random = new Random();

        int[] distinctNumbers = new int[6];
        for (int i = 0; i < 6; i++) {
            boolean flag=true;
            int a=random.nextInt(49)+1;
            for (int b:distinctNumbers) {
                if (a==b || list[a-1]==1)
                {
                    flag=false;
                    break;
                }
            }
             if(flag){
                 distinctNumbers[i]=a;
                 list[a-1]=1;
             }
             else i--;
        }
        Arrays.sort(distinctNumbers);
        for (int a:distinctNumbers
             ) {
            System.out.print(a+" ");
        }
        System.out.println();
    }
}
