package week5_6;

public abstract class Shape {
    private String color;
    private boolean filled;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void fillColor(String color){
        this.color = color;
        filled = true;
    }
    public abstract void move(Point newPosition);

    public abstract boolean isSimilar(Shape other);

    public abstract boolean isSameType(Shape other);
}
