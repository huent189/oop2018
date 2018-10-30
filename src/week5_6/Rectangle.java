package week5_6;

public class Rectangle extends Shape {
    private Point upperLeft;
    private double width;
    private double height;

    public Rectangle(Point upperLeft, double width, double height) {
        this.upperLeft = upperLeft;
        this.width = width;
        this.height = height;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void move(Point newPosition) {
        upperLeft = newPosition;
    }

    @Override
    public boolean isSimilar(Shape other) {
        if(other instanceof Rectangle){
            return (upperLeft.isSame(((Rectangle) other).upperLeft) &&
                    width == ((Rectangle) other).width &&
                    height == ((Rectangle) other).height);
        }
        return false;
    }

    @Override
    public boolean isSameType(Shape other) {
        return (other instanceof Rectangle);
    }
}
