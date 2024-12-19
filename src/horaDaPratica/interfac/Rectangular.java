package horaDaPratica.interfac;

public class RectangularShape extends Shape implements GeometricCalculation {
    private double length;
    private double width;

    public RectangularShape(double length, double width) {
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

    @Override
    public double calculateArea(double length, double width) {
        super.area = length * width;
        return super.area;
    }

    @Override
    public double calculatePerimeter(double length, double width) {
        this.perimeter = (length * 2) + (width * 2);
        return this.perimeter;
    }

    @Override
    public double calculateArea() {
            super.area = this.length * this.width;
        return this.area;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

}
