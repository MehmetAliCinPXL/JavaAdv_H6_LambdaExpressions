package be.pxl.ja;

public class Car {
    private Engine engine;
    private static String fuel;

    public Car(String fuel){
        Car.fuel = fuel;
        engine = new Engine();
    }

    public void start(){
        engine.start();
    }
    /*
    OEFENING 6.1
    public class Engine{
        public  void start(){
            System.out.println("Engine has started, Fuel type:" + fuel);
        }
    }*/


    public static class Engine{

        public void start(){
            System.out.println("Engine has started " + fuel);
        }
    }


    public static void main(String[] args) {
        Car ferrari = new Car("Benzine");
        ferrari.start();

        Engine ford = new Car.Engine();
        ford.start();
    }
}

