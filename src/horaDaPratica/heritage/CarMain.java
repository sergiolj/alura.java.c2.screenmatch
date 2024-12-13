package horaDaPratica.heritage;

public class CarMain {
    public static void main (String[]args){
        Car mustang1 = new Car();
        mustang1.setModel("Ford Mustang");
        mustang1.setModelYear(2023);
        mustang1.setLicensePlate("ABC1234");
        mustang1.setPrice(20000);


        Car mustang2 = new Car();
        mustang2.setModel("Ford Mustang");
        mustang2.setModelYear(2023);
        mustang2.setLicensePlate("XYZ4321");
        mustang2.setPrice(23000);


        Car mustang3 = new Car();
        mustang3.setModel("Ford Mustang");
        mustang3.setModelYear(2023);
        mustang3.setLicensePlate("BBK3400");
        mustang3.setPrice(19000);


        Car mustang4 = new Car();
        mustang4.setModel("Ford Mustang");
        mustang4.setModelYear(2023);
        mustang4.setLicensePlate("DAD0011");
        mustang4.setPrice(18999);

        mustang1.sold();
        mustang2.sold();
        mustang4.sold();
        mustang3.sold();

        System.out.println(mustang1.toString());

        Car.calculateMarketPrice();


    }
}