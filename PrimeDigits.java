import java.util.Scanner;
public class PrimeDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.print("Prime Digits: ");

        while (num > 0) {
            int digit = num % 10;

            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                System.out.print(digit + " ");
            }

            num = num / 10;
        }
    }
}

