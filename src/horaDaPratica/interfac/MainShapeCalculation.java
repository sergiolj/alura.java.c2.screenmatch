package horaDaPratica.interfac;

public class MainShapeCalculation {
    public static void main(String[] args) {

        Rectangular rectangle = new Rectangular(20.5,22.8);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        Polygon polygon = new Polygon(6,4);
        System.out.println(polygon.getPolygonType());
        //System.out.println(triangle.calculateHTriangle());
        System.out.println(polygon.getPolygonType() + " Area: " + polygon.calculateArea());

    }
}
