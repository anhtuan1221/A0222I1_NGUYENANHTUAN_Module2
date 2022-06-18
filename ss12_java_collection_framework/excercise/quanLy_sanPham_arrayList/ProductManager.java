package ss12_java_collection_framework.excercise.quanLy_sanPham_arrayList;

import java.util.*;

public class ProductManager extends Product {
    public static List<Product> products = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public void add(Product product) {
        products.add(product);
    }


    public void edit() {
        System.out.println("Edit product");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                System.out.println("Enter name");
                products.get(i).setName(scanner.nextLine());
                System.out.println("enter price");
                products.get(i).setPrice(Double.parseDouble(scanner.nextLine()));
                break;
            }
        }
    }

    public Product remove(int index) {
        return products.remove(index);
    }

    public void display() {
        for (Product p : products) {
            System.out.println(p + "\n");
        }
    }

    public Product search(String name) {
        for (Product p : products) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    public void sort(boolean isDESC) {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return isDESC ? (int) (o2.getPrice() - o1.getPrice()) : (int) (o1.getPrice() - o2.getPrice());
            }
        });

//        Collections.sort(products, (o1, o2) -> {
//            return isDESC? (int)(o2.getPrice() - o1.getPrice()) : (int)(o1.getPrice() - o2.getPrice());
//        });

//        ProductComparator productComparator = new ProductComparator(isDESC);
//        Collections.sort(products, productComparator);
    }

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product(1, "Hai", 10);
        Product product1 = new Product(2, "My", 12);
        Product product2 = new Product(3, "Tu", 114);
        Product product3 = new Product(4, "Qua", 110);
        products.add(product);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        productManager.display();
        System.out.println("----------");
//      productManager.remove(2);
//      productManager.display();
//      System.out.println("----------");
//      productManager.edit();
        productManager.display();
        Product search = productManager.search("My");
        System.out.println(search);
        System.out.println("Sort price by\n1. ASC\n2. DESC");
        int choice = Integer.parseInt(scanner.nextLine());
        boolean isDESC = choice != 1;
        productManager.sort(isDESC);
        productManager.display();

    }

}
