package oops;

public class AbstractionExample {

    public static void main(String[] args) {
        Vehical myCar = new Car1();
        myCar.start();
        myCar.fuelType();

        Vehical myBike = new Bike();
        myBike.start();
    }
}

abstract class Vehical{

    abstract void start();

    public void fuelType(){
        System.out.println("Most vehicles use petrol or diesel.");
    }
}

class Car1 extends Vehical{

    @Override
    public void start(){
        System.out.println("Car starts with a key or push button.");
    }
}

class Bike extends Vehical{

    public void start(){
        System.out.println("Bike starts with a self-start or kick.");
    }
}