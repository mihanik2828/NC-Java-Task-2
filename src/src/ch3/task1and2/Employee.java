package src.ch3.task1and2;

import java.util.ArrayList;

public class Employee implements Measurable{

    public double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public double getMeasure() {
        return salary*salary;
    }


    static Measurable larges(ArrayList<Measurable> meas) {
        Measurable measurable = new Employee(Double.MIN_VALUE);
        for(Measurable m: meas)
        {
            if(m.getMeasure()-Employee.average(meas)>measurable.getMeasure()-Employee.average(meas) )
                measurable = m;
        }
        return measurable;
    }

    static double average(ArrayList<Measurable> objects)
    {
        double sum=0;
        for(Measurable m: objects)
            sum+=m.getMeasure();
        return sum/objects.size();
    }

    public static void main(String[] args) {
        Measurable measurable1 = new Employee(1);
        Measurable measurable2 = new Employee(2);
        Measurable measurable3 = new Employee(3);
        Measurable measurable4 = new Employee(4);

        ArrayList<Measurable> arrMeas = new ArrayList<Measurable>();
        arrMeas.add(measurable1);
        arrMeas.add(measurable2);
        arrMeas.add(measurable3);
        arrMeas.add(measurable4);

        System.out.println(Employee.average(arrMeas));
        System.out.println(Employee.larges(arrMeas));
    }
}
