package horaDaPratica.interfac;

public class Circle extends Shape implements GeometricCalculation{
    private double radius = 0;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * Math.pow(this.radius, 2);
        setArea(area);
        return getArea();
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 2 * Math.PI * this.radius;
        setPerimeter(perimeter);
        return getPerimeter();
    }
}
