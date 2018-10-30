package week5_6;

import java.util.ArrayList;

public class Diagram {
    private ArrayList<Layer> layers = new ArrayList<>();

    public void removeCircle(){
        for (int i = 0; i < layers.size(); i++){
            layers.get(i).removeAllType(Circle.class);
        }
    }

    public ArrayList<Layer> getLayers() {
        return layers;
    }

    public void addLayer(Layer newLayer) {
        this.layers.add(newLayer);
    }

    public void show(){
        for (int i = 0; i < layers.size(); i++){
            System.out.println("Layer " + i);
            if (layers.get(i).isVisible()){
                for (int j = 0; j < layers.get(i).getShapes().size(); j++){
                    System.out.println(layers.get(i).getShapes().get(j).getClass());
                }
            }
        }
    }

    public void arrangeLayer(){
        ArrayList<Layer> arrangedlayers = new ArrayList<>();
        for (int i = 0; i < layers.size(); i++){
            Layer currentLayer = layers.get(i);
            for (int j = 0; j < currentLayer.getShapes().size(); j++){
                int d = 0;
                Shape currentShape = currentLayer.getShapes().get(j);
                while (d < arrangedlayers.size()){
                    if(arrangedlayers.get(d).getShapes().get(d).isSameType(currentShape)){
                        arrangedlayers.get(d).addShape(currentShape);
                        break;
                    }
                }
                if(d >= arrangedlayers.size()){
                    arrangedlayers.add(new Layer());
                    arrangedlayers.get(d).addShape(currentShape);
                }
            }
        }
    }
}
