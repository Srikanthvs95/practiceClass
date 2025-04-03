package oops;

import java.util.Scanner;

public class main {

    //Example for the Class and the Object
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Brand Name the car: ");
        String brand = scanner.nextLine();
        System.out.println("Please enter the Speed of  the car: ");
        int speed = scanner.nextInt();
        Car car= new Car(brand, speed); //object for the class
        car.display();
    }
}

class Car{

    String brand;
    int speed;

    //constructor
    Car(String brand, int speed){
        this.brand=brand;
        this.speed= speed;
    }

    //class method
    void display(){
        System.out.println("Brand : "+brand+","+"Speed :"+speed);
    }
}
