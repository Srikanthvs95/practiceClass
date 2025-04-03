package basics;

import java.util.Arrays;
import java.util.Scanner;

public class StringExmples {

    public static void main(String[] args) {

        String str1 = "Hello Shree ...!";  //Using string literal
        String str2 = new String("Bye Shree...!");  //Using New Key word

        System.out.println(str1);
        System.out.println(str2);

        Scanner scanner = new Scanner(System.in);        //using Scanner class
        System.out.println("Please enter Your Name : ");
        String name = scanner.nextLine();
        System.out.println("your name is : "+name);

        //Methods in the Strings
        //1. Length
        System.out.println("Please Enter the word: ");
        String string1 = scanner.nextLine();
        System.out.println(string1.length());

        //2. Converting Uppercase and the Lowercase
        System.out.println(string1.toUpperCase());
        System.out.println(string1.toLowerCase());

        //3.concatenation
        System.out.println("Please enter the 2 Words:");
        String str3 = scanner.nextLine();
        String str4 = scanner.nextLine();
        System.out.println(str3+str4);

        //4. contains
        System.out.println("Please enter the sentence: ");
        String str5 = scanner.nextLine();
        if(str5.contains("srikanth")){
            System.out.println("The String contains " +str5);
        }else {
            System.out.println("The String Doesn't containes "+str5);
        }

        //5. Comparing 2 String
        String str6 ="srikanth";
        String str7 = "Shree";
        String str8 ="srikanth";

        System.out.println(str6.compareTo(str7));
        System.out.println(str6.compareTo(str8));
        System.out.println(str8.compareTo(str7));

        //6.Equals
        System.out.println(str6.equals(str7));
        System.out.println(str8.equalsIgnoreCase(str7));

        //7. charAt
        System.out.println(str6.charAt(5));

        //8.Replace
        System.out.println(str6.replace("srikanth","Shree"));

        //9. Split
        String str9= "apple,banana,grape,orange";
        String [] fruits = str9.split(",");
        System.out.print(Arrays.toString(fruits));

        //10 Blank and Empty
        System.out.println("Is str6 empty? " + str6.isEmpty());  // true
        System.out.println("Is str2 blank? " + str2.isBlank());

    }
}
