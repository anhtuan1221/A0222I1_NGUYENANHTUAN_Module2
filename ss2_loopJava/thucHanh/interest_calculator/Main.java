package ss2_loopJava.thucHanh.interest_calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi ");
        double soTienGui = scanner.nextDouble();
        System.out.println("Nhập số tháng ");
        int soThang = scanner.nextInt();
        double tienLai = 1;
        for (int i = 1; i <= soThang; i++) {
            tienLai += soTienGui * 0.01 / 12 * soThang;
        }
        System.out.println("Tiền lãi= " + tienLai + " VND");
    }
}
