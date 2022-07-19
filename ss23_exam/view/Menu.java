//package ss23_exam.view;
//
//
//import ss23_exam.model.HocVien;
//import ss23_exam.model.NhanSu;
//import ss23_exam.model.NhanVien;
//import ss23_exam.service.Service;
//import ss23_exam.util.Validate;
//
//import java.util.List;
//import java.util.Scanner;
//
//public class Menu {
//    private static Scanner scanner = new Scanner(System.in);
//    private static Service services = new Service();
//    private static Validate val = new Validate();
//
//    public static void main(String[] args) throws NotFoundException {
//        while (true) {
//            System.out.println("---------CHƯONG TRÌNH QUẢN LÝ NHÂN SƯ-------");
//            System.out.println("Chọn chức năng theo số (để tiếp tục): ");
//            System.out.println("1. Thêm mới nhân sự");
//            System.out.println("2. xoá nhân sự");
//            System.out.println("3. Xem danh sách nhân sự");
//            System.out.println("4. Thoát ");
//            int choice = getchoice();
//            switch (choice) {
//                case 1:
//                    themMoiNhanSu();
//                    break;
//                case 2:
//                    xoaNhanSu();
//                    break;
//                case 3:
//                    xemDanhSach();
//                    break;
//                case 5:
//                    System.exit(0);
//            }
//        }
//    }
//
//    private static void themMoiNhanSu() throws NotFoundException {
//        System.out.println("1. Thêm mới nhân viên\n2. Thêm mới học viên\n3. Quay lại\n Chon chuc nang");
//        int choice = getchoice();
//        NhanSu nhanSu = null;
//        if (choice == 1) {
//            System.out.println("Nhập mã định danh");
//            String maDinhDanh = scanner.nextLine();
//            System.out.println("Nhập ho va ten");
//            String hoVaTen = val.checkInputStringName();
//            System.out.println("nhap ngay sinh");
//            String ngaySinh = "";
//            do {
//                System.out.print("Input name again with correct format:");
//                ngaySinh = scanner.nextLine();
//            } while (!val.checkValidDate(ngaySinh));
//            System.out.println("nhap dia chi");
//            String diaChi = val.checkInputString();
//            System.out.println("Nhap so dien thoai");
//            int sdt = val.checkInputInt();
//
//            System.out.println("nhap luong");
//            double luong = val.checkInputDouble();
//            System.out.println("nhap phong ban");
//            int phongBan = val.checkInputInt();
//            System.out.println("nhap vi tri");
//            String viTri = val.checkInputString();
//            nhanSu = new NhanVien(maDinhDanh, hoVaTen, ngaySinh, diaChi, sdt, luong, phongBan, viTri);
//        } else if (choice == 2) {
//            System.out.println("Nhập mã định danh");
//            String maDinhDanh = scanner.nextLine();
//            System.out.println("Nhập ho va ten");
//            String hoVaTen = val.checkInputStringName();
//            System.out.println("nhap ngay sinh");
//            String ngaySinh = "";
//            do {
//                System.out.print("Input name again with correct format:");
//                ngaySinh = scanner.nextLine();
//            } while (!val.checkValidDate(ngaySinh));
//            System.out.println("nhap dia chi");
//            String diaChi = val.checkInputString();
//            System.out.println("Nhap so dien thoai");
//            int sdt = val.checkInputInt();
//            System.out.println("nhap diem thi ");
//            double diemThi = val.checkInputDouble();
//            System.out.println("nhap ten lop ");
//            String tenLop = scanner.nextLine();
//            String ngayNhapHoc = "";
//            do {
//                System.out.print("Input name again with correct format:");
//                ngayNhapHoc = scanner.nextLine();
//            } while (!val.checkValidDate(ngayNhapHoc));
//            nhanSu = new HocVien(maDinhDanh, hoVaTen, ngaySinh, diaChi, sdt, diemThi, tenLop, ngayNhapHoc);
//        } else if (choice == 3) {
//            main(null);
//        }
//
//        services.themMoiNhanSu(nhanSu);
//        System.out.println("them moi thanh cong");
//    }
//
//    private static void xemDanhSach() {
//        List<NhanSu> nhanSus = services.findAll();
//        for (int i = 0; i < nhanSus.size(); i++) {
//            System.out.println(nhanSus.get(i));
//        }
//    }
//
//    private static void xoaNhanSu() throws NotFoundException {
//        xemDanhSach();
//        boolean tmp = false;
//        do {
//            System.out.println(tmp ? "nhap vao ma dinh danh de xoa lai:" : "nhap vao ma dinh danh de xoa:");
//            String maDinhDanh = scanner.nextLine();
//            System.out.println("Are you sure to delete\n" + "1. yes\n2. no");
//            int choice = getchoice();
//            if (choice == 1) {
//                services.xoaNhanSu(maDinhDanh);
//                System.out.println("Delete successfully ");
//                tmp = false;
//            } else {
//                System.out.println("Ban da huy");
//            }
//        } while (tmp);
//    }
//
//
//    private static int getchoice() {
//        System.out.println("Enter your choice: ");
//        return Integer.parseInt(scanner.nextLine());
//    }
//}
