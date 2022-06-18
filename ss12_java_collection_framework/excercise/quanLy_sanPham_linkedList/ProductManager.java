package ss12_java_collection_framework.excercise.quanLy_sanPham_linkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static List<Product> list = new LinkedList<>();
    public static Scanner scanner = new Scanner(System.in);

    public void add(Product product) {
        list.add(product);
    }

    public void edit(){
        System.out.println("Edit product");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId()==id){
                System.out.println("Enter name ");
                list.get(i).setName(scanner.nextLine());
                System.out.println("Enter price");
                list.get(i).setPrice(Double.parseDouble(scanner.nextLine()));

            }
        }
    }

}
