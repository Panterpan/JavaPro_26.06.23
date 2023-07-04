package hrudin.hw_2.car;

public class Car {

    public void start(){
       startElectricity();
       startCommand();
       startFuelSystem();
    }
    private void startElectricity(){
        System.out.println("Car on");
    }
    private void startCommand(){
        System.out.println("Car going");
    }
    private void startFuelSystem(){
        System.out.println("start of fuel supply");
    }


}
