package horaDaPratica.interfac;

public class Polygon implements GeometricCalculation{
    private double sideLength;
    private int numberOfVertices;
    private String polygonType;


    private enum polygonClassification {
        EQUILATERAL_TRIANGLE, QUADRILATERAL, PENTAGON,HEXAGON,HEPTAGON,OCTAGON
    }


    public Polygon(double sideLength, int numberOfVertices) {
            if(numberOfVertices >= 3 && numberOfVertices <= 8) {
                this.sideLength = sideLength;
                this.numberOfVertices = numberOfVertices;
                polygonTypeClassification(numberOfVertices);
            }else{
            throw new IllegalArgumentException("Invalid number of vertices.\n" +
                    "This polygon class accept geometric figures from at least 3 and at maximum of 8 vertices.");
        }
    }

    public String getPolygonType() {
        if(polygonType!=null){
            return polygonType;
        }
        return null;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public int getNumberOfVertices() {
        return numberOfVertices;
    }

    public void setNumberOfVertices(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
    }

    public void polygonTypeClassification(int numberOfVertices) {
        switch (numberOfVertices) {
            case 3:
                polygonType = polygonClassification.EQUILATERAL_TRIANGLE.toString();
                break;
            case 4:
                polygonType = polygonClassification.QUADRILATERAL.toString();
                break;
            case 5:
                polygonType = polygonClassification.PENTAGON.toString();
                break;
            case 6:
                polygonType = polygonClassification.HEXAGON.toString();
                break;
            case 7:
                polygonType = polygonClassification.HEPTAGON.toString();
                break;
            case 8:
                polygonType = polygonClassification.OCTAGON.toString();
                break;
            default:
                System.out.println("Invalid number of vertices");
                break;
        }
    }

    public double calculateHTriangle() {
        if(polygonType.equals("EQUILATERAL_TRIANGLE")){
            return (Math.sqrt(3)/2) * this.sideLength;
        }else{
            throw new IllegalArgumentException("Invalid polygon type.\n" +
                    "Method used only to calculate Equilateral Triangle height.");
        }
    }

    @Override
    public double calculateArea() {
        double area = 0;

        switch(polygonType){
         case "EQUILATERAL_TRIANGLE":
            area = (this.sideLength * 0.5) * calculateHTriangle();
            return area;

         case "QUADRILATERAL":
            area = Math.pow(this.sideLength,2);
            return area;

         case "PENTAGON":
             area = calculatePerimeter() * calculateApothem();
            return area;

        }
        return 0;
    }

    private double calculateApothem() {
    return 1.2;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 0;
        perimeter = this.sideLength * this.numberOfVertices;
        return perimeter;
    }
}
