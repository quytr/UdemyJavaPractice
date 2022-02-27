package academy.javabasics;

public class AreaCalculator {

    public static double area(double radius){
//        return (radius < 0) ? -1 : radius * radius * Math.PI;

        if(radius < 0){
            return -1;
        }
        double area = Math.PI * radius * radius;
        System.out.println(area);
        return area;
    }

    public static double area(double x, double y){
//        return (x < 0 || y < 0) ? -1 : x * y;

        if(x < 0 || y < 0){
            return -1;
        }
        double area = x * y;
        System.out.println(area);
        return area;
    }

    public static void main(String[] args) {
        area(5.0);
        area(-1);

        area(5.0,4.0);
        area(-1.0,4.0);

    }
}
