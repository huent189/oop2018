package week5_6;

public class Square extends Rectangle {

    Square(Point upperLeft, double side){
        super(upperLeft, side, side);
    }

    public double getSide(){
        return getHeight();
    }

    public void setSide(double side){
        super.setHeight(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public void setHeight(double side) {
        super.setHeight(side);
        super.setWidth(side);
    }
}
