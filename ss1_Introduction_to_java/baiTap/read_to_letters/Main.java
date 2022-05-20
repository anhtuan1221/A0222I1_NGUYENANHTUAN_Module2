package ss1_Introduction_to_java.baiTap.read_to_letters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        double hundresdsNum, tensNum, unitNum;//221
        hundresdsNum = Math.floor(number / 100);//2
        tensNum = Math.floor((number - hundresdsNum * 100) / 10);//21/10=2.1=2
        unitNum = number - hundresdsNum * 100 - tensNum * 10;//221-200-21=1
        String hundresdText = "";
        String tensText = "";
        String unitText = "";
        switch ((int) hundresdsNum) {
            case 9:
                hundresdText = "nine hundreds";
                break;
            case 8:
                hundresdText = "eight hundreds";
                break;
            case 7:
                hundresdText = "seven hundreds";
                break;
            case 6:
                hundresdText = "six hundreds";
                break;
            case 5:
                hundresdText = "five hundreds";
                break;
            case 4:
                hundresdText = "four hundreds";
                break;
            case 3:
                hundresdText = "three hundreds";
                break;
            case 2:
                hundresdText = "two hundreds";
                break;
            case 1:
                hundresdText = "one hundreds";
                break;
            default:
                break;
        }
        switch ((int) tensNum) {
            case 9:
                tensText = "ninety";
                break;
            case 8:
                tensText = "eighty";
                break;
            case 7:
                tensText = "seventy";
                break;
            case 6:
                tensText = "sixty";
                break;
            case 5:
                tensText = "nighty";
                break;
            case 4:
                tensText = "fourty";
                break;
            case 3:
                tensText = "thrity";
                break;
            case 2:
                tensText = "twenty";
                break;
            case 1:
                switch ((int) unitNum) {
                    case 9:
                        unitText = "nineteen";
                        break;
                    case 8:
                        unitText = "eighteen";
                        break;
                    case 7:
                        unitText = "seventeen";
                        break;
                    case 6:
                        unitText = "sixteen";
                        break;
                    case 5:
                        unitText = "nighteen";
                        break;
                    case 4:
                        unitText = "fourteen";
                        break;
                    case 3:
                        unitText = "thriteen";
                        break;
                    case 2:
                        unitText = "twelve";
                        break;
                    case 1:
                        unitText = "eleven";
                        break;
                    default:
                        unitText = "ten";
                }
        }
        if (tensNum != 1) {
            switch ((int) unitNum) {
                case 9:
                    unitText = "nine";
                    break;
                case 8:
                    unitText = "eight";
                    break;
                case 7:
                    unitText = "seven";
                    break;
                case 6:
                    unitText = "six";
                    break;
                case 5:
                    unitText = "night";
                    break;
                case 4:
                    unitText = "four";
                    break;
                case 3:
                    unitText = "three";
                    break;
                case 2:
                    unitText = "two";
                    break;
                case 1:
                    unitText = "one";
                    break;
            }
        }
        if (hundresdsNum != 0 && tensNum == 0 && unitNum == 0) {
            System.out.println(hundresdText);
        }else if (hundresdsNum == 0) {
            System.out.println(tensText + " " + unitText);
        } else if (tensNum != 0 && unitNum != 0) {
            System.out.println(hundresdText + " and " + tensText + " " + unitText);
        } else if (hundresdsNum == 0 && tensNum == 0) {
            System.out.println(unitText);
        } else if (tensNum == 0) {
            System.out.println(hundresdText + " and " + unitText);
        }
    }
}
