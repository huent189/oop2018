package week5_6;

import java.util.ArrayList;

public class Layer {
    private boolean visible;
    private ArrayList<Shape> shapes = new ArrayList<>();

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void removeAllType(Class C){
        int i = 0;
        while (i < shapes.size()){
            if(C.isInstance(shapes.get(i))){
                shapes.remove(i);
            } else {
                i++;
            }
        }
    }

    public void removeDuplicate(){
        for (int i = 0; i < shapes.size(); i++){
            for (int j = i + 1; j < shapes.size(); j++){
                if(shapes.get(i).isSimilar(shapes.get(j))){
                    shapes.remove(j);
                    j--;
                }
            }
        }
    }
}
