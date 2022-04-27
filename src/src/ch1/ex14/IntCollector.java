package src.ch1.ex14;

import java.util.ArrayList;

public class IntCollector {
    public ArrayList<Integer> collector;

    public IntCollector() {
        collector = new ArrayList<>();
    }

    public IntCollector(String str) {
        collector = new ArrayList<>();
        for(String s: str.split(" "))
                collector.add(Integer.parseInt(s));
        }

    @Override
    public String toString() {
        return "IntCollector{" +
                "collector=" + collector +
                '}';
    }
}
