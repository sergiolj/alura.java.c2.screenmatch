package horaDaPratica.interfac;

public class Pentagon extends Polygon implements GeometricCalculation{


    public Pentagon(double sideLength, int numberOfVertices) {
        super(sideLength, numberOfVertices);
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }
}
