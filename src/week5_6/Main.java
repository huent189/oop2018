package week5_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Diagram diagram = new Diagram();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of layer: ");
        int numOfLayer = scanner.nextInt();
        for (int i = 0; i < numOfLayer; i++){
            System.out.println("Layer " + i + "\nNumber of shape: ");
            int numOfShape = scanner.nextInt();
            Layer layer = new Layer();
            for (int j = 0; j < numOfShape; j++){
                int shapeIndex = scanner.nextInt();
                switch (shapeIndex){
                    case 1:
                        layer.addShape(new Circle(new Point(0,0), 1));
                        break;
                    case 2:
                        layer.addShape(new Rectangle(new Point(0,0), 2, 3));
                        break;
                    case 3:
                        layer.addShape(new Triangle(new Point(0,0), new Point(1, 2), new Point(2, 3)));
                        break;
                    case 4:
                        layer.addShape(new Square(new Point(0,0), 3));
                        break;
                    default:
                        break;
                }
            }
            diagram.addLayer(layer);
        }
        for (int i = 0; i < diagram.getLayers().size(); i++){
            System.out.println("Layer " + i);
            for (int j = 0; j < diagram.getLayers().get(i).getShapes().size(); j++){
                System.out.println(diagram.getLayers().get(i).getShapes().get(j).getClass());
            }
        }
        diagram.removeCircle();
        for (int i = 0; i < diagram.getLayers().size(); i++){
            System.out.println("Layer " + i);
            for (int j = 0; j < diagram.getLayers().get(i).getShapes().size(); j++){
                System.out.println(diagram.getLayers().get(i).getShapes().get(j).getClass());
            }
        }
    }
}
