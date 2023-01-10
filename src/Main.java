import java.util.Scanner;

public class Main {

    static boolean isPalindrom(int number) {

        System.out.print("Lütfen palindrom sayı kontrolü için bir sayı giriniz :");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (number == reverseNumber) {
            System.out.print(number + " palindrom bir sayıdır.");
            return true;
        } else {
            System.out.print(number + " palindrom bir sayı değildir.");
            return false;
        }
    }

    public static void main(String[] args) {
        isPalindrom(0);





    }
}