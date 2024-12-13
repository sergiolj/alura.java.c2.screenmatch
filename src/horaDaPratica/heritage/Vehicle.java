package horaDaPratica.heritage;

public class Vehicle {
    private double price = 0.0;
    private String model;
    private String licensePlate;
    private int modelYear;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getModelYear() {
        return modelYear;
    }

    private static double sumResalePrice = 0.0;
    private static final double [] listSalePrice = new double [10];
    private static int countCarSales = 0;

    public void sold() {
        if(countCarSales < listSalePrice.length){
            listSalePrice[countCarSales] = this.price;
            sumResalePrice += this.price;
            countCarSales++;
        }else {
            System.out.println("Car sale list is full. Cannot add more sales.");
        }
    }

    public static void calculateMarketPrice(){
        if(countCarSales != 0){
            calculateAverageMarketPrice(listSalePrice);
            calculateLowerMarketPrice(listSalePrice);
            calculateHigherMarketPrice(listSalePrice);
        }else{
            System.out.println("No cars have been sold yet. Cannot determine the market price.");
        }
    }

    private static void calculateHigherMarketPrice(double[] listSalePrice) {
        double higherModelPrice = listSalePrice[0];
        for (int i = 0; i < countCarSales; i++) {
            if (listSalePrice[i] != 0) {
                if (listSalePrice[i] > higherModelPrice) {
                    higherModelPrice = listSalePrice[i];
                }
            }
        }
        System.out.println("Higher model price is " + higherModelPrice);
    }

    private static void calculateLowerMarketPrice (double[] listSalePrice) {
        double lowerModelPrice = listSalePrice[0];
        for (int i = 0; i < countCarSales; i++) {
            if (listSalePrice[i] != 0) {
                if (listSalePrice[i] < lowerModelPrice) {
                    lowerModelPrice = listSalePrice[i];
                }
            }
        }
        System.out.println("Lower model price: " + lowerModelPrice);
    }

    private static void calculateAverageMarketPrice(double[] listSalePrice) {
        double averageModelPrice = sumResalePrice / countCarSales;
        System.out.println("Average Sale Price: " + averageModelPrice);
    }
}
