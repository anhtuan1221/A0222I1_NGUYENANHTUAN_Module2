package ss1_Introduction_to_java.baiTap.currency_conversion;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        float vnd, usd, rate;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  US currency: ");
        usd = scanner.nextFloat();
        vnd = 23000 * usd;
        System.out.println("VND :" + vnd);
    }
}
