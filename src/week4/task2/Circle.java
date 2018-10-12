package week4.task2;

public class Circle extends Shape {
    private static final double PI = 3.1416;
    private double radius;
    public Circle(){
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     *
     * @return dien tich hinh tron
     */
    public double getArea(){
        return (PI * radius * radius);
    }

    /**
     *
     * @return chu vi hinh tron
     */
    public double getPerimeter(){
        return (2 * PI * radius);
    }

    /**
     *
     * @return cac thong tin co ban cua hinh
     */
    @Override
    public String toString() {
        return "Circle: " +
                "radius=" + radius + "color='" + getColor() + '\'' +
                ", filled=" + isFilled();
    }
}
