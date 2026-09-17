package T03;
class Car {
    static void ConvertKmstoMiles() {
        System.out.println("Converting Kms in to miles....");
    }

    void calculateMilage() {
        System.out.println("Calculating milage...");
    }
}

public class StaticLearn {
    public static void main(String[] args) {
        Car.ConvertKmstoMiles();
        Car nano = new Car();
        nano.calculateMilage();

        Car bmw = new Car();
        bmw.calculateMilage();
    }
}