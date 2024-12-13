package horaDaPratica.heritage;

public class CarDeprecated {
    private String model;
    private double priceYear1;
    private double priceYear2;
    private double priceYear3;

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrices(double priceYear1, double priceYear2, double priceYear3) {
        this.priceYear1 = priceYear1;
        this.priceYear2 = priceYear2;
        this.priceYear3 = priceYear3;
    }
    public void displayInformation() {
        System.out.println("\nModel: " + model);
        System.out.println("Price Year1: " + priceYear1);
        System.out.println("Price Year2: " + priceYear2);
        System.out.println("Price Year3: " + priceYear3);
        System.out.printf("Lower price: %.2f%n" ,calculateLowerPrice());  //%.2f format with two decimal places
        System.out.printf("Higher price: %.2f%n" ,calculateHigherPrice());  //%n add a new line after the output
    }

    private double calculateLowerPrice() {
        double lowerPrice = priceYear1;

        if(priceYear2 < lowerPrice){
            lowerPrice = priceYear2;
        } else if(priceYear3 < lowerPrice) {
            lowerPrice = priceYear3;
        }

        return lowerPrice;
    }

    private double calculateHigherPrice() {
        double higherPrice = priceYear1;

        if(priceYear2 > higherPrice) {
            higherPrice = priceYear2;
        }else if(priceYear3 > higherPrice) {
            higherPrice = priceYear3;
        }

        return higherPrice;
    }

}


