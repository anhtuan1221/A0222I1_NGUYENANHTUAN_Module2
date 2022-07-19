//package ss12_java_collection_framework.excercise.quanLy_sanPham_arrayList;
//
//import java.util.*;
//
//public class DanhBaManager extends DanhBa {
//    public static List<DanhBa> danhBas = new ArrayList<>();
//    private static Scanner scanner = new Scanner(System.in);
//
//    public void add(DanhBa danhBa) {
//        danhBas.add(danhBa);
//    }
//
////
////    public void edit() {
////        System.out.println("Edit product");
////        int id = Integer.parseInt(scanner.nextLine());
////        for (int i = 0; i < danhBas.size(); i++) {
////            if (danhBas.get(i).getId() == id) {
////                System.out.println("Enter name");
////                danhBas.get(i).setName(scanner.nextLine());
////                System.out.println("enter price");
////                danhBas.get(i).setPrice(Double.parseDouble(scanner.nextLine()));
////                break;
////            }
////        }
////    }
//
//    public DanhBa remove(int index) {
//        return danhBas.remove(index);
//    }
//
//    public void display() {
//        for (DanhBa p : danhBas) {
//            System.out.println(p + "\n");
//        }
//    }
//
//    public DanhBa search(String name) {
//        for (DanhBa p : danhBas) {
//            if (p.getName().equals(name)) {
//                return p;
//            }
//        }
//        return null;
//    }
//
////    public void sort(boolean isDESC) {
////        Collections.sort(danhBas, new Comparator<DanhBa>() {
////            @Override
////            public int compare(DanhBa o1, DanhBa o2) {
////                return isDESC ? (int) (o2.getPrice() - o1.getPrice()) : (int) (o1.getPrice() - o2.getPrice());
////            }
////        });
//
////        Collections.sort(products, (o1, o2) -> {
////            return isDESC? (int)(o2.getPrice() - o1.getPrice()) : (int)(o1.getPrice() - o2.getPrice());
////        });
//
////        ProductComparator productComparator = new ProductComparator(isDESC);
////        Collections.sort(products, productComparator);
//    }
//
////    public static void main(String[] args) {
////        DanhBaManager productManager = new DanhBaManager();
////        DanhBa danhBa = new DanhBa(1, "Hai", 10);
////        DanhBa danhBa1 = new DanhBa(2, "My", 12);
////        DanhBa danhBa2 = new DanhBa(3, "Tu", 114);
////        DanhBa danhBa3 = new DanhBa(4, "Qua", 110);
////        danhBas.add(danhBa);
////        danhBas.add(danhBa1);
////        danhBas.add(danhBa2);
////        danhBas.add(danhBa3);
////        productManager.display();
////        System.out.println("----------");
//////      productManager.remove(2);
//////      productManager.display();
//////      System.out.println("----------");
//////      productManager.edit();
////        productManager.display();
////        DanhBa search = productManager.search("My");
////        System.out.println(search);
////        System.out.println("Sort price by\n1. ASC\n2. DESC");
////        int choice = Integer.parseInt(scanner.nextLine());
////        boolean isDESC = choice != 1;
////        productManager.sort(isDESC);
////        productManager.display();
////
////    }
//
//}
