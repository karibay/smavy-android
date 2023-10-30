package abstraction;

import java.util.ArrayList;

public class Calculator {
    public ArrayList<Shape> shapes;

    public Calculator(){
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape){
        shapes.add(shape);
    }
    public double getTotalArea(){
        double totalArea = 0;
        for (Shape shape :
                shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}
