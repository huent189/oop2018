package week4.task2;

public class Shape {
    private String color;
    private boolean filled;

    public Shape(){
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

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

    /**
     *
     * @return cac thong tin co ban cua hinh
     */
    @Override
    public String toString() {
        return "Shape: " +
                "color='" + color + '\'' +
                ", filled=" + filled;
    }
}
