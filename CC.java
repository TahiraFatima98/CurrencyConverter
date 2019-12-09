import java.util.*;
import java.text.DecimalFormat;
public class CC {
    void method() {
        double amount, dollar, pound, code, euro, rupee;

        DecimalFormat f = new DecimalFormat("##.##");
        Scanner sc = new Scanner(System.in);

        System.out.println("hi, Welcome to the Currency Converter!");

        System.out.println("which currency You want to Convert ? ");

        System.out.println("1:Ruppe \t2:Dollar \t3:Pound \n4:Euro ");
        code = sc.nextInt();

        System.out.println("How much Money you want to convert ?");
        amount = sc.nextFloat();

        // For amounts Conversion
        if (code == 1) {

            dollar = amount / 70;
            System.out.println("Your " + amount + " Rupee is : " + f.format(dollar) + " Dollar");

            pound = amount / 88;
            System.out.println("Your " + amount + " Rupee is : " + f.format(pound) + " Pound");

            euro = amount / 80;
            System.out.println("Your " + amount + " Rupee is : " + f.format(euro) + " Euro");
            
        } else if (code == 2) {
            // For Dollar Conversion

            rupee = amount * 70;
            System.out.println("Your " + amount + " Dollar is : " + f.format(rupee) + " Ruppes");

            pound = amount * 0.78;
            System.out.println("Your " + amount + " Dollar is : " + f.format(pound) + " Pound");

            euro = amount * 0.87;
            System.out.println("Your " + amount + " Dollar is : " + f.format(euro) + " Euro");
            
        } else if (code == 3) {
            // For Pound Conversion

            rupee = amount * 88;
            System.out.println("Your " + amount + " pound is : " + f.format(rupee) + " Ruppes");

            dollar = amount * 1.26;
            System.out.println("Your " + amount + " pound is : " + f.format(dollar) + " Dollar");

            euro = amount * 1.10;
            System.out.println("Your " + amount + " pound is : " + f.format(euro) + " Euro");
            
        } else if (code == 4) {
            // For Euro Conversion

            rupee = amount * 80;
            System.out.println("Your " + amount + " euro is : " + f.format(rupee) + " Ruppes");

            dollar = amount * 1.14;
            System.out.println("Your " + amount + " euro is : " + f.format(dollar) + " Dollar");

            pound = amount * 0.90;
            System.out.println("Your " + amount + " euro is : " + f.format(pound) + " Pound");

        } else {
            System.out.println("Invalid input");
        }

        System.out.println("Thank You!");
    }
}


