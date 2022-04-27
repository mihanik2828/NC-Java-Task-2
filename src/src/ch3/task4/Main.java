package src.ch3.task4;

public class Main {
    public static void main(String[] args) {
        IntSequence intSequence = IntSequence.of(1, 2, 3, 4, 5);

        while(intSequence.hasNext())
            System.out.println(intSequence.next());


    }
}
