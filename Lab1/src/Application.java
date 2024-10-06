public class Application {
    public static void main(String[] args) {
        Car car = new Car(2020, 100000);
        AudiCar audiCar = new AudiCar(2021, 200000, "USA");
        PorcheCar porcheCar = new PorcheCar(2024,10000,"Taycan");
        Car anotherPorcheCar = new PorcheCar(2024,12342,"Macan");

        System.out.println(car.toString());
        System.out.println(audiCar.toString());
        System.out.println(porcheCar.toString());
        System.out.println(anotherPorcheCar);
        Car anotherotherPorcheCar = new PorcheCar(2024,12342,"hjmhnfgbfgrbv");
    }
}