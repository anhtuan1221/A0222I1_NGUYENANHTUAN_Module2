package ss12_java_collection_framework.excercise.quanLy_sanPham_linkedList;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
       ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int choose = -1;
        while (choose != 0) {
            System.out.println("1.ADD");
            System.out.println("2.EDIT");
            System.out.println("3.REMOVE");
            System.out.println("4.DISPLAY");
            System.out.println("5.SEARCH");
            System.out.println("6.SORT");
            System.out.println("0.EXIT");
            System.out.println("select option ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    productManager.addProduct();
                    break;
                case 2:
                    productManager.edit();
                    break;
                case 3:
                    productManager.removeProduct();
                    break;
                case 4:
                    productManager.display();
                    break;
                case 5:
                    productManager.searchNameProduct();
                    break;
                case 6:
                    int choice = Integer.parseInt(scanner.nextLine());
                    boolean isDESC = choice != 1;
                    productManager.sort(isDESC);
                case 0 :
                    System.out.println("Exit");
                    break;
                default:
                    break;

            }
        }
    }
}
