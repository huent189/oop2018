package week5_6;

public class Triangle extends Shape{
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    @Override
    public void move(Point newPosition) {
        double centerX = (point1.getX() + point2.getX() + point3.getX()) / 3;
        double centerY = (point1.getY() + point2.getY() + point3.getY()) / 3;
        double shiftX = newPosition.getX() - centerX;
        double shiftY = newPosition.getY() - centerY;
        point1.setX(point1.getX() + shiftX);
        point1.setY(point1.getY() + shiftY);
        point2.setX(point2.getX() + shiftX);
        point2.setY(point2.getY() + shiftY);
        point3.setX(point3.getX() + shiftX);
        point3.setY(point3.getY() + shiftY);
    }

    @Override
    public boolean isSimilar(Shape other) {
        if(other instanceof Triangle){
            Triangle otherTriangle = (Triangle) other;
            return (point1.isSame(otherTriangle.point1) && point2.isSame(otherTriangle.point2) &&
                    point3.isSame(otherTriangle.point3));
        }
        return false;
    }

    @Override
    public boolean isSameType(Shape other) {
        return (other instanceof Triangle);
    }
}
