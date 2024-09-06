package d4operator_casting_scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Ornek 5: Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
//rakamlarin toplamini yazdiran kodu yaziniz.

//Example 5: The first two and last two digits of a 5-digit number you will receive from the user.
//Write the code that prints the sum of the numbers
//           45678 ==> 45 + 78 = 123


Scanner input =new Scanner(System.in);
        System.out.println("please enter a 5-digit number");
        int number= input.nextInt();
        int firstTwoDigits = number/1000;
        System.out.println(firstTwoDigits);

        int lastTwoDigits = number%100;
        System.out.println(lastTwoDigits);

        System.out.println("Sum of two numbers = " + (firstTwoDigits+lastTwoDigits));

    }
}
