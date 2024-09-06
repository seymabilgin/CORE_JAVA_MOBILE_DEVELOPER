package d4operator_casting_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

/*Ornek 1:
Kullanıcıdan;
i)Adini ve Soyadini ii)Yaşını
iii)Boyunu
iv)Kilosunu
v)Medeni durumunu girmesini isteyin.

Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın
Example 1:
From the user;
i) Name and Surname ii) Age
iii)Height
iv) Weight
v) Ask him to enter his marital status.

Then print them on separate lines in the console with a label*/
        //nextLine() methodu ile birden fazla kelime girisi alabilirsiniz. next() ile tek kelimelik girişler

        Scanner input =new Scanner(System.in);

        System.out.println("Please enter your name");
        String name=input.nextLine();


        System.out.println("Please enter your surname");
        String surname=input.nextLine();


        System.out.println("Pleae enter your age");
        byte age= input.nextByte();


        System.out.println("Please enter your height");
        float height =input.nextFloat();


        System.out.println("Please enter your weight");
        short weight=input.nextShort();


        System.out.println("Please enter your marital status");
        String maritalStatus=input.next();

        System.out.println("name = " + name);
        System.out.println("surname = " + surname);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("maritalStatus = " + maritalStatus);
    }
}
