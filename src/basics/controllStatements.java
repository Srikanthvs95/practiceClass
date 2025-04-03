package basics;

import java.util.Scanner;

public class controllStatements {

    public static void main(StringExmples[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        ifElseMethod(num);
        controllStatements l1 = new controllStatements();  // Create an Object to Call the Non-Static Method (Non Static loopMethod)
        l1.loopMethod(num);
        whileLoopMethod(num);
        switchMethod(num);
        System.out.println("\nCode exceuted Successfully");
    }

    public static void ifElseMethod(int num) {

        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static void switchMethod(int num) {
        switch (num) {
            case 5:
                System.out.print("Matched with the number" + num+"\n");
                break;
            case 10:
                System.out.print("Matched with the number" + num+"\n");
                break;
            case 15:
                System.out.print("Matched with the number" + num+"\n");
                break;
            case 20:
                System.out.print("Matched with the number" + num+"\n");
                break;
            default:
                System.out.print("Does Not Matched with the number" + num+"\n");
                break;
        }
    }

    public void loopMethod(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print("\nFor Loop Number: " + i);
        }
    }

    public static void whileLoopMethod(int num){
        while(num<=20){
            System.out.println("While Loop Number: "+num);
            num++;
        }
    }

}

