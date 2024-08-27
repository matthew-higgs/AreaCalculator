public class area {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));

    }

    public static double area(double x, double y) {
        // return -1.0 if x or y or both are negative
        // return area of rectangle: Area = base * length
        if (x < 0 || y < 0) {
            return -1;
        }
        return x * y;
    }

    public static double area(double radius) {
        // return -1.0 if radius is negative
        // return area of circle: Area = Pi * radius * radius
        // use Math.PI for PI
        if (radius < 0) {
            return -1;
        }
        return Math.PI * radius * radius;
    }

}
