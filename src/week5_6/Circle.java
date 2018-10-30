package week5_6;

public class Circle extends Shape{
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void move(Point newPosition) {
        center = newPosition;
    }

    @Override
    public boolean isSimilar(Shape other) {
        if(other instanceof Circle){
            return (center.isSame(((Circle) other).center) && radius == ((Circle) other).radius);
        }
        return false;
    }

    @Override
    public boolean isSameType(Shape other) {
        return (other instanceof  Circle);
    }
}
