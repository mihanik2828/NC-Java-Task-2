package src.ch3.task4;

import java.util.ArrayList;
import java.util.Arrays;

public interface IntSequence {

    int next();

    default boolean hasNext() {
        return true;
    }

    static IntSequence of(int... v) {
        return new IntSequence() {

            int[] values = Arrays.copyOf(v,v.length);
            int position=0;

            @Override
            public int next() {
                if (hasNext())
                    return values[position++];
                System.out.println("sequence is empty");
                return Integer.MIN_VALUE;
            }

            @Override
            public boolean hasNext() {
                return position<values.length;
            }

        };
    }
}