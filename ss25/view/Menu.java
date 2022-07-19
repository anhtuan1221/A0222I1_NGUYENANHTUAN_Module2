package ss25.view;


import ss25.exception.NotFoundException;
import ss25.model.DanhBa;
import ss25.service.Service;
import ss25.util.FileHelper;
import ss25.util.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static Service service = new Service();
    public static List<DanhBa> danhBas = new ArrayList<>();
    private FileHelper fileHelper = new FileHelper();
    private static final String PATH = "ss25/data/File.csv";

    public static void main(String[] args) {
        while (true) {
            System.out.println("---------CHƯONG TRÌNH QUẢN LÝ DANH BẠ-------");
            System.out.println("Chọn chức năng theo số (để tiếp tục): ");
            System.out.println("1Xem danh sách");
            System.out.println("2. Thêm mới ");
            System.out.println("3. Cập nhật");
            System.out.println("4. xoá");
            System.out.println("5. tìm kiếm");
            System.out.println("6. Thoát ");
            int choice = getChoice();

            switch (choice) {
                case 1:
                    display();
                    break;
                case 2:
                    create();
                    break;
                case 3:
                    edit();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }


    private static void readFile() {

    }

    private static void writeFile() {

    }

    public static void create() {
        DanhBa danhBa;
        System.out.println("Số điện thoại");
        String sdt = Regex.checkPhone();
        System.out.println("Nhom danh ba");
        String nhom = Regex.checkName();
        System.out.println("ho va ten");
        String hoTen = Regex.checkName();
        System.out.println("gioi tinh");
        String gioiTinh = scanner.nextLine();
        System.out.println("dai chi");
        String daiChi = Regex.checkAddress();
        System.out.println("ngay sinh");
        String ngaySinh = Regex.inputBirthday();
        System.out.println("email");
        String emai = scanner.nextLine();
        danhBa = new DanhBa(sdt,nhom,hoTen,gioiTinh,daiChi,ngaySinh,emai);
        service.create(danhBa);
        System.out.println("Thêm mới thành công");
    }

    private static void display() {
        //create();
        List<DanhBa> danhBas = service.findAll();

        for (int i = 0; i < danhBas.size(); i++) {
            System.out.println(danhBas.get(i));
        }
    }

    private static void delete() {
        display();

        boolean tmp = false;

        do {
            System.out.println(tmp ? "nhap sdt de xoa lai:" : "nhap vao sdt de xoa:");
            String sdt = scanner.nextLine();
            try {
                System.out.println("Bạn có muốn xoá không \n" + "1. yes\n2. no");
                int choice = getChoice();
                if (choice == 1) {
                    service.delete(sdt);
                    System.out.println("Xoá thành công ");
                    tmp = false;
                } else {
                    System.out.println("Bạn đã huỷ");
                }

            } catch (NotFoundException e) {
                System.out.println(e.getMessage());
                tmp = true;
            }
        } while (tmp);
    }

    private static void search() {
        System.out.print("Input name to search:");
        String name = Regex.checkName();
        List<DanhBa> danhBas = service.search(name);

        if (danhBas.size() > 0) {
            for (int i = 0; i < danhBas.size(); i++) {
                System.out.println(danhBas.get(i));
            }
        } else {
            System.out.println("ko tim thay");
        }
    }

    private static int getChoice() {
        System.out.print("Enter your choice:");
        return Integer.parseInt(scanner.nextLine());
    }
    public static void edit() {
        System.out.println("Edit danh ba");
        System.out.println("nhap so dt ");
        String sdt = scanner.nextLine();
        for (int i = 0; i < danhBas.size(); i++) {
            if (danhBas.get(i).getSdt().equals(sdt) ) {
                System.out.println("Nhom");
                danhBas.get(i).setNhom(scanner.nextLine());
                System.out.println("ho ten");
                danhBas.get(i).setHoten(scanner.nextLine());
                System.out.println("gioi tinh");
                danhBas.get(i).setGoiTinh(scanner.nextLine());
                System.out.println("dia chi");
                danhBas.get(i).setGoiTinh(scanner.nextLine());
                System.out.println("ngay sinh");
                danhBas.get(i).setDiachi(scanner.nextLine());
                System.out.println("email");
                danhBas.get(i).setEmail(scanner.nextLine());
                break;
            }
        }
    }

}
