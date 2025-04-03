package oops;

import java.util.Scanner;

public class PolymorphismExample {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the 3 numbers : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println("Please enter the double format numbers: ");
        double A1 = scanner.nextDouble();
        double B2 = scanner.nextDouble();

        // Method Overloading Example
        MathOperations mathOperations = new MathOperations();
        System.out.println("Addition (int): " + mathOperations.add(a,b));
        System.out.println("Addition (double): " + mathOperations.add(A1,B2));
        System.out.println("Addition (3 numbers): " +mathOperations.add(a,b,c));

        //Method OverRidding Example
        Animal1 animal1 = new Animal1();
        animal1.makeSound();

        //UpCasting  ---> creating the parent class reference for the child class object
        Animal1 myDog = new Dog1();
        myDog.makeSound();

        Animal1 myCat = new Cat1();
        myCat.makeSound();

        //DownCasting -->  Down casting refers to converting a superclass reference back into a subclass reference.
        Dog1 realDog = (Dog1) myDog;
        realDog.makeSound();

    }
}

// Method Overloading (Compile-time Polymorphism)
class MathOperations{

    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public double add (double a, double b){
        return a+b;
    }
}

// Method Overriding (Runtime Polymorphism)

class Animal1{
    public void makeSound(){
        System.out.println("Animal is making the Sound");
    }
}

class Dog1 extends Animal1{

    public void makeSound(){
        System.out.println("Dog is Barking");
    }
}

class Cat1 extends  Animal1{
    public void makeSound(){
        System.out.println("Cat is meows");
    }
}

