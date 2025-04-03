package oops;

import java.util.Scanner;

public class inheritence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of the Dog: ");
        String name = scanner.nextLine();

        Dog myDog = new Dog();
        myDog.name = name;
        myDog.bark();
        myDog.eat();

        Puppy puppy = new Puppy();
        puppy.name = name;
        puppy.eat();
        puppy.bark();
        puppy.weep();

        Cat cat = new Cat(); // in the  Hierarchical Inheritance we can't call the subClass method if we extends only parent class
        cat.name = name;
        cat.eat();
        cat.meow();

        Bird bird = new Bird();
        bird.name=name;
        bird.fly();
        bird.eat();

    }
}

//Parent class
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }
}

//Derived class (Child class) - Single Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is Barking");
    }
}

// Multi-Level Inheritance
class Puppy extends Dog {
    public void weep() {
        System.out.println(name + " is weeping");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    public void meow() {
        System.out.println(name + " is meowing.");
    }
}


interface flyAble{
    void fly();
}

class Bird extends Animal implements flyAble{

    @Override
    public void fly() {
        System.out.println(name + " is flying.");
    }
}


