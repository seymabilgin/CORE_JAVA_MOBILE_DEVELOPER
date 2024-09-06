package d4operator_casting_scanner;

import java.util.Locale;
import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //Ornek 3: Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz.
       //Example 3: Write the code that takes two numbers from the user, performs 4 operations and displays the results of the operations on the screen.


        Scanner input =new Scanner(System.in).useLocale(Locale.US); //ondalık sayıyı nokta seklşnde yazmak icin ayar
        System.out.println("Please enter two number");

        double firstNumber= input.nextDouble();
        double secondNumber= input.nextDouble();

        System.out.println("Addition : " + (firstNumber+secondNumber));
        System.out.println("Subtraction : " + String.format("%.2f",(firstNumber-secondNumber))); //String.format("%.2f") bunu uzun ondalık sayının sag tarafındaki rakamı kısaltmak için kullandık
        System.out.println("Multiplication : " + (firstNumber*secondNumber));
        System.out.println("Division : " + (firstNumber/secondNumber));




    }
}
