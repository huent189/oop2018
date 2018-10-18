package week5_6;

import java.util.ArrayList;

public class Diagram {
    private ArrayList<Layer> layers = new ArrayList<>();

    public void removeCircle(){
        for (int i = 0; i < layers.size(); i++){
            ArrayList<Shape> shapeList = layers.get(i).getShapes();
            int j = 0;
            while (j < shapeList.size()){
                if(shapeList.get(j) instanceof Circle){
                    shapeList.remove(j);
                } else {
                    j++;
                }
            }
        }
    }

    public ArrayList<Layer> getLayers() {
        return layers;
    }

    public void addLayer(Layer newLayer) {
        this.layers.add(newLayer);
    }
}
