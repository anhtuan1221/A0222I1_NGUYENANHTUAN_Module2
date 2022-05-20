package ss2_loopJava.baiTap.display_20_first_prime;

public class Main {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;
        while (count < 20) {
            int N = 0;
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    N++;
                }
            }
            if (N < 2) {
                System.out.println(number);
                count++;
            }
            number++;

        }
    }
}


