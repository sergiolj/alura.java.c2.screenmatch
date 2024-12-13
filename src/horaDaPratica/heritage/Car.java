package horaDaPratica.heritage;

public class Car extends Vehicle {


    @Override
    public String toString() {
        String description;
        description = """
                Car Model: %s
                Car License Plate: %s
                Car ModelYear: %s
                Car Price US$: %.2f
                """.formatted(this.getModel(),this.getLicensePlate(),this.getModelYear(),this.getPrice());
        return description;
    }
}
