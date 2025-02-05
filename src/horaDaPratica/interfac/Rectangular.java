package horaDaPratica.interfac;

public class Rectangular extends Shape implements GeometricCalculation {
    private double length;
    private double width;

    public Rectangular(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea(double length, double width) {
        double area = length * width;
        setArea(area);
        return this.getArea();
    }

    public double calculatePerimeter(double length, double width) {
        double perimeter =  (length * 2) + (width * 2);
        setPerimeter(perimeter);
        return this.getPerimeter();
    }

    @Override
    public double calculateArea() {
        setArea(this.length * this.width);
        return getArea();
    }

    @Override
    public double calculatePerimeter() {
        setPerimeter((length * 2) + (width * 2));
        return getPerimeter();
    }

}
