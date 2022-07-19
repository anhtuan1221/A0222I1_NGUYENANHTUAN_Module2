//package ss23_exam.view.view;
//
//import ss24.exception.NotFoundException;
//import ss25.model.HandPhone;
//import ss25.model.Phone;
//import ss25.service.PhoneService;
//import ss25.util.Regex;
//
//import java.util.List;
//import java.util.Scanner;
//
//public class View {
//    private static Scanner scanner = new Scanner(System.in);
//    private static PhoneService phoneService = new PhoneService();
//
//    public static void main(String[] args) {
//        while (true) {
//            System.out.println("---------CHƯONG TRÌNH QUẢN LÝ NHÂN SƯ-------");
//            System.out.println("Chọn chức năng theo số (để tiếp tục): ");
//            System.out.println("1. Thêm mới nhân sự");
//            System.out.println("2. xoá nhân sự");
//            System.out.println("3. Xem danh sách nhân sự");
//            System.out.println("4. Thoát ");
//            int choice = getChoice();
//
//            switch (choice) {
//                case 1:
//                    create();
//                    break;
//                case 2:
//                    display();
//                    break;
//                case 3:
//                    delete();
//                    break;
//                case 4:
//                    search();
//                    break;
//                case 5:
//                    System.exit(0);
//            }
//        }
//    }
//
//    private static void create() {
//        System.out.println("1. Authentic\n2. Hand\n3. Quay lai");
//        int choice = getChoice();
//        Phone phone = null;
//
//        if (choice == 1) {
//            System.out.println("Nhập Họ Và Tên Nhân Viên: ");
//            String name = Regex.checkName();
//
//            System.out.println("gia");
//            String price = Regex.inputRentalCosts();
//
//            System.out.println("manufacturer");
//
//            String manufacturer = Regex.checkName();
//            System.out.println("");
//            // int granteeByYear = Regex.inputNumber();
//            String code = Regex.inputStandard();
//            //  phone = new AuthenticPhone(0, name, price, manufacturer, granteeByYear, code);
//        } else if (choice == 2) {
//            System.out.println("Nhập Họ Và Tên: ");
//            String name = Regex.checkName();
//
//            System.out.println("gia");
//            String price = Regex.inputRentalCosts();
//
//            System.out.println("manufacturer");
//
//            String manufacturer = Regex.checkName();
//            String country = inputWithEmpty("Country");
//            String status = inputWithEmpty("Status");
//           // phone = new HandPhone(0, name, Double.parseDouble(price), manufacturer, country, status);
//        } else {
//            main(null);
//        }
//
//        phoneService.create(phone);
//        System.out.println("Thêm mới thành công");
//
//    }
//
//    private static void display() {
//        List<Phone> phones = phoneService.findAll();
//
//        for (int i = 0; i < phones.size(); i++) {
//            System.out.println(phones.get(i));
//        }
//    }
//
//    private static void delete() {
//        display();
//
//        boolean tmp = false;
//
//        do {
//            System.out.println(tmp ? "nhap vao ma dinh danh de xoa lai:" : "nhap vao ma dinh danh de xoa:");
//            int id = Integer.parseInt(scanner.nextLine());
//            try {
//                System.out.println("Are you sure to delete\n" + "1. yes\n2. no");
//                int choice = getChoice();
//                if (choice == 1) {
//                    phoneService.delete(id);
//                    System.out.println("Xoá thành công ");
//                    tmp = false;
//                } else {
//                    System.out.println("Ban da huy");
//                }
//
//            } catch (NotFoundException e) {
//                System.out.println(e.getMessage());
//                tmp = true;
//            }
//        } while (tmp);
//    }
//
//    private static void search() {
//        System.out.print("Input name to search:");
//        String name = scanner.nextLine();
//        List<Phone> phones = phoneService.search(name);
//
//        if (phones.size() > 0) {
//            for (int i = 0; i < phones.size(); i++) {
//                System.out.println(phones.get(i));
//            }
//        } else {
//            System.out.println("Empty list");
//        }
//    }
//
//    private static int getChoice() {
//        System.out.print("Enter your choice:");
//        return Integer.parseInt(scanner.nextLine());
//    }
//
//    private static String inputWithEmpty(String field) {
//        String val = "0";
//        do {
//            System.out.print(val.isEmpty() ? "Invalid format. Input again:" : field + ":");
//            val = scanner.nextLine();
//        } while (val.trim().isEmpty());
//
//        return val;
//    }
//}
