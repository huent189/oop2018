package week5_6;

public class Hexagon extends Shape {
    private Point center;
    private double edge;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public void move(Point newPosition) {
        center = newPosition;
    }

    @Override
    public boolean isSimilar(Shape other) {
        if(other instanceof Hexagon){
            return (center.isSame(((Hexagon) other).center) && edge == ((Hexagon) other).edge);
        }
        return false;
    }

    @Override
    public boolean isSameType(Shape other) {
        return (other instanceof Hexagon);
    }
}
