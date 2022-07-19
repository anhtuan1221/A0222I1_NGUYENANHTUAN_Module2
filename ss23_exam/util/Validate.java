package ss23_exam.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static final String DATE_REG = "^\\d{1,2}\\/\\d{1,2}\\/\\d{1,4}$";
    private static Pattern pattern;
    private static Matcher matcher;
    //    public static boolean isNumber(String val){
//        try{
//            Double.parseDouble(val);
//            return true;
//        }catch(Exception e){
//            return false;
//        }
//    }
//    public static boolean checkName(String name){
//        return name.matches("[A-Z]\\w*");
//    }
    public static Scanner scanner = new Scanner(System.in);

    public String checkIsEmpty() {
        while (true) {
            String result = scanner.nextLine().trim();
            if (!result.isEmpty()) {
                return result;
            } else {
                System.out.println("Your input must be not null");
                System.out.println("Please input again");
            }
        }
    }

    public int checkInputInt() {
        boolean check;
        while (true) {
            String result = checkIsEmpty();
            check = result.matches("^\\d+$");
            if (check) {
                return Integer.parseInt(result);
            } else {
                System.out.println("Your input must be format");
                System.out.println("Please input again");
            }
        }
    }

    public String checkInputString() {
        boolean check;
        while (true) {
            String result = checkIsEmpty();
            check = result.matches("^[A-Za-z ]+$");
            if (check) {
                return result;
            } else {
                System.out.println("Your input must be format");
                System.out.println("Please input again");
            }
        }
    }

    public String checkInputStringName() {
        boolean check;
        boolean check1;
        while (true) {
            String result = checkIsEmpty();
            check = result.matches("^[A-Z][a-z ]+$");

            if (check) {
                return result;
            } else {
                System.out.println("Your input must be format");
                System.out.println("Please input again");
            }
        }
    }

    public double checkInputDouble() {
        boolean check;
        while (true) {
            String result = checkIsEmpty();
            check = result.matches("^\\d+\\.\\d+$");
            if (check) {
                return Double.parseDouble(result);
            } else {
                System.out.println("Your input must be not string and int");
                System.out.println("Please input again");
            }
        }
    }

    public static boolean isDate(String val) {
        pattern = Pattern.compile(DATE_REG);
        matcher = pattern.matcher(val);
        return matcher.matches();
    }

    public static boolean checkValidDate(String dateString) {
        if (!isDate(dateString)) {
            return false;
        } else {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            df.setLenient(false); // set false để kiểm tra tính hợp lệ của date. VD: tháng 2 phải có 28-29 ngày, năm có 12 tháng,....
            try {
                df.parse(dateString); // parse dateString thành kiểu Date
                return true;
            } catch (ParseException e) { // quăng lỗi nếu dateString ko hợp lệ
                return false;
            }
        }
    }

    public String checkMaDinhDanh() {
        boolean check;
        boolean check1;
        while (true) {
            String result = checkIsEmpty();
            check = result.matches("[H][V]-\\d{3}");
            check1 = result.matches("[N][V]-\\d{3}");
            if (check || check1) {
                return result;
            } else {
                System.out.println("Your input must be format");
                System.out.println("Please input again");
            }
        }
    }
}
