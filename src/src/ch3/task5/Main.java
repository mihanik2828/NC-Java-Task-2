package src.ch3.task5;

import src.ch3.task4.IntSequence;

public class Main {
    public static void main(String[] args) {
        IntSequence intSequence = new IntSequence()
        {
            @Override
            public int next() {
                return 1;
            }

            @Override
            public boolean hasNext() {
                return true;
            }
        };

        while(true)
        System.out.println(intSequence.next());
    }
}
