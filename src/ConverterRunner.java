import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class ConverterRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to the Number Converter!");
        System.out.println("--------------------------------");
        System.out.print("Enter the base of your number (2, 8, 10 or 16): ");

        Scanner s = new Scanner(System.in);
        String choice = s.nextLine();
        int base = Integer.parseInt(choice);

        System.out.print("Enter your number: ");
        String number = s.nextLine();
        String n = number;



        NumberConverter nc = new NumberConverter(n, base);
        int[] digits = nc.getDigits();
        System.out.println("\n\nDigit array: " + Arrays.toString(digits));
        System.out.println("Number: " + nc.displayOriginalNumber());
        if(base!=10) {
            System.out.print("To decimal: ");
            System.out.println(Arrays.toString(nc.convertToDecimal()));
        }
        if(base!=2){
        System.out.print("To binary: ");
        System.out.println(Arrays.toString(nc.convertToBinary()));
        }
        if(base!=8) {
            System.out.print("To octal: ");
            System.out.println(Arrays.toString(nc.convertToOctal()));
        }
        if(base!=16) {
            System.out.print("To HexaDecimal");
            System.out.println(Arrays.toString(nc.convertToHexaDecimal()));
        }



        System.out.print("Type a number in base 10 to convert to another base: ");
        String newChoice = s.nextLine();
        int decimal = Integer.parseInt(newChoice);
        System.out.println("Now type the base you want to convert to: ");
        String newBase = s.nextLine();
        int baseNew = Integer.parseInt(newBase);
        System.out.println(Arrays.toString(nc.baseConverter(decimal, baseNew)));



    }
}
