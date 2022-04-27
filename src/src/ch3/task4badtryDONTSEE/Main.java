package src.ch3.task4badtryDONTSEE;

public class Main {
    public static void main(String[] args) {
        IntSequention intSequention = (int... v)-> {
         int[] mass = new int[v.length];
         for (int i=0;i<v.length ; i++)
             mass[i]=v[i];
         return mass;
        };

        int[] m=intSequention.of(5,465,46,54,654,654,65,46,4,64,65);
        for (int a:
                m) {
            System.out.print(a+" ");
        }
    }
}
