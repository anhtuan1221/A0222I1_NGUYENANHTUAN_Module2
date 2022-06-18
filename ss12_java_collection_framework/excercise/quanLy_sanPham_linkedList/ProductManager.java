package ss12_java_collection_framework.excercise.quanLy_sanPham_linkedList;

import java.util.*;

public class ProductManager extends Product {
    public List<Product> list = new LinkedList<>();
    public static Scanner scanner = new Scanner(System.in);

    public ProductManager() {
        list.add(new Product(1, "tuan", 10));
        list.add(new Product(400, "hai", 20));
        list.add(new Product(10, "quang", 100));
        list.add(new Product(20, "duc", 101));
    }

    public void display() {
        System.out.println("List product: ");
        for (Product p : list) {
            System.out.println(p.toString());
        }
    }

    public void addProduct() {
        System.out.println("Add Product");
        System.out.println("Add ID");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Add name ");
        String name = scanner.nextLine();
        System.out.println("Add price");
        double price = Double.parseDouble(scanner.nextLine());
        list.add(new Product(id, name, price));
        System.out.println("add success");
    }

    public void removeProduct() {
        System.out.println("REMOVE PRODUCT");
        System.out.println("CHOOSE ID");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
                break;
            }
        }
    }

    public void edit() {
        System.out.println("EDIT PRODUCT");
        System.out.println("choose id");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                System.out.println("Enter Id ");
                list.get(i).setId(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter name");
                list.get(i).setName(scanner.nextLine());
                System.out.println("Enter price");
                list.get(i).setPrice(Double.parseDouble(scanner.nextLine()));
                break;
            }
        }
    }

    public void searchNameProduct() {
        System.out.println("SEARCH NAME PRODUCT");
        System.out.println("ENTER NAME");
        String name = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                System.out.println(list.get(i).toString());
            }
        }
    }

    public void sort(boolean isDESC) {
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (isDESC ? (o2.getPrice() - o1.getPrice()) : (o1.getPrice() - o2.getPrice()));
            }
        });
    }

}
