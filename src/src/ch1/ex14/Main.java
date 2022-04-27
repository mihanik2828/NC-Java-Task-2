package src.ch1.ex14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<IntCollector> square = new ArrayList<>();
        String[] firstList;
        Scanner sc;
        sc = new Scanner(System.in);

        String s;
        do {
            s = sc.nextLine();
            if ("".equals(s)) break;
            square.add(new IntCollector(s));
        } while (true);

        System.out.println("it`s your input");
        for (IntCollector a : square) {
            for (Integer i : a.collector) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        for (IntCollector ic : square) {
            if (square.size() != ic.collector.size()) {
                System.out.println("It`s not square, bye bye");
                System.exit(0);
            }
        }
        int sumCol = 0, sumRow = 0, sumDiag = 0;
        for (int i = 0; i < square.size(); i++) {
            sumCol += square.get(i).collector.get(0);
            sumRow += square.get(0).collector.get(i);
            sumDiag += square.get(i).collector.get(i);
        }
        int helpSumDiag = 0;
        boolean flag=true;
        for (int i = 0; i < square.size(); i++) {
            int helpSumRow = 0, helpSumCol = 0;
            for (int j = 0; j < square.size(); j++) {
                helpSumCol += square.get(i).collector.get(j);
                helpSumRow += square.get(j).collector.get(i);
            }
            helpSumDiag += square.get(i).collector.get(square.size() - 1 - i);
            flag =(helpSumCol == sumCol) && ((helpSumRow == sumRow));
            if(!flag) break;
        }
        if (helpSumDiag != sumDiag) flag=false;
        System.out.println(flag?"it`magic square)":"it`s not magic square(");
    }


}



