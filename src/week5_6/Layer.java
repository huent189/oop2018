package week5_6;

import java.util.ArrayList;

public class Layer {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeAll(Class C){
        int i = 0;
        while (i < shapes.size()){
            if(C.isInstance(shapes.get(i))){
                shapes.remove(i);
            } else {
                i++;
            }
        }
    }

    public void removeAllTriangle(){
        int i = 0;
        while (i < shapes.size()){
            if(shapes.get(i) instanceof Triangle){
                shapes.remove(i);
            } else {
                i++;
            }
        }
    }
}
