package src.ch2.task5;

public class Point {
    private double x=0;
    private double y=0;

    public final static void main(String[] args) {

        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p.toString());
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double getX() {
        return x;
    }


    public double getY() {
        return y;
    }

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point translate(double x,double y)
    {
        return(new Point(this.getX()+x , this.getY()+y ));
    }

    public Point scale(double x)
    {
        return(new Point(this.getX()*x , this.getY()*x ));
    }

}
