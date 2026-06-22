import java.util.Scanner;

public class OddEvenCount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int oddCount = 0;
        int evenCount = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            num = num / 10;
        }

        System.out.println("Odd = " + oddCount + ", Even = " + evenCount);
    }
}

