package basics;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        //Single Dimensional Array
        Scanner scanner = new Scanner(System.in);
//        int [] numbers= {10,20, 30,40,50};
        System.out.println("Enter the Array size : ");
        int size = scanner.nextInt();
        arrayNumberMethod(size);  //Calling Numbers array Method
        Arrays arrays= new Arrays();
        arrays.arrayStrinrgMethod(size); // Calling the string Array Method

        //Multi Dimensional Array
        System.out.println("Please enter the  rows and columns of the Array");
        int col = scanner.nextInt();
        int row = scanner.nextInt();
        array2Dmethod(col, row);


    }

    public static void arrayNumberMethod(int size){
        int[] numbers= new int[size];
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the "+ size + "Numbers: ");
        for (int i=0; i<size; i++){
            numbers[i] = scanner.nextInt();
        }
        System.out.println("The Entered numbers are: ");
        for(int i : numbers){
            System.out.println(i);
        }
    }

    public void arrayStrinrgMethod(int size){
        String[] strings = new String[size];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the String Values: ");
        for (int i=0; i<size; i++){
            strings[i]  = scanner.nextLine();
        }
        for (int i = 0; i< strings.length; i++){
            System.out.println("The Entered words are : " + strings[i]);
        }
    }

    public static void array2Dmethod(int col, int row ){
        Scanner scanner = new Scanner(System.in);
        int[][] numbers = new int[col][row];

        System.out.println("Please enter the"+col*row + "Elements: ");
        for(int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                numbers [i][j]= scanner.nextInt();
            }
        }

        System.out.println("2D arrary elements: ");
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
