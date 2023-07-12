package hrudin.hw_5;

public class Main {
    public static void main(String[] args) {
        SportCar car1 = SportCar.builder()
                .engineValue(2.9)
                .color("yellow")
                .year(23)
                .model(SportCar.ModelType.Lexus)
                .build();
        System.out.println(car1);
        SportCar car2 = SportCar.builder()
                .engineValue(3.2)
                .model(SportCar.ModelType.BMW)
                .color("black")
                .name("Alex")
                .year(2022)
                .build();
        System.out.println(car2);
    }
}
