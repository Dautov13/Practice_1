public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle(16);
        myCircle.setRadius(1.0);
        myCircle.getRadius();
        myCircle.getArea();
        myCircle.getCircumference();
        System.out.println(new StringBuilder("Override toString: ").append(myCircle).toString());
    }
}

class Circle {
    private double radius;
    private double area;
    private double circumference;
    final double pi = Math.PI;

    Circle(double radius) {
        this.radius = radius;
    }

    double setRadius(double radius) {
        this.radius = radius;
        return radius;
    }

    void getRadius() {
        System.out.println("The radius of the circle is " + radius + ".");
    }

    void getArea() {
        area = pi * Math.pow(radius, 2);
        System.out.println("The area of the circle is " + area + ".");
    }

    void getCircumference() {
        circumference = 2 * pi * radius;
        System.out.println("The circumference of the circle is " + circumference + ".");
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + "}";
    }
}