package horaDaPratica.heritage;

public class CarMainDeprecated {
    public static void main(String[] args) {
        CarDeprecated car = new CarDeprecated();

        car.setModel("SUV");
        car.setPrices(120000,135000,110000);

        car.displayInformation();
    }
}
