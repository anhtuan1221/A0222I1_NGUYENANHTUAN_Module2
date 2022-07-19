package ss24.service;


import ss24.model.Employee;
import ss24.model.Student;
import ss25.util.Regex;
import ss24.model.Human;
import ss24.util.ReadAndWriteHR;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HRService implements IHRService {
    static Scanner scanner = new Scanner(System.in);
    public static final String PATH_FILE_HR = "ss24/data/personal_record.csv";

    @Override
    public void addNew() {
        do {
            System.out.println("=====Thêm mới=====\n" +
                    "1. Thêm Nhân Viên\n" +
                    "2. Thêm Học Sinh\n" +
                    "3. Quay lại menu");
            System.out.println("****Nhập lựa chọn****");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    addEmployee();
                    break;
                case "2":
                    addStudent();
                    break;
                case "3":
                    return;
                default:
                    System.out.printf("Chỉ chọn 1 - 3 \n");
            }
        } while (true);


    }

    @Override
    public void delete() {
        Boolean flag = false;
        List<Human> humanList = ReadAndWriteHR.readHRList(PATH_FILE_HR);
        System.out.println("nhập id  cần xóa");
        String id = scanner.nextLine();
        for (Human e : humanList) {
            if (e.getId().equals(id)) {
                System.out.println(e);
                System.out.println("Bạn muốn xóa hay không: \n" +
                        "1. Xóa\n" +
                        "2. không xóa");
                int choose = Integer.parseInt(scanner.nextLine());
                if (choose == 1) {
                    flag = true;
                    humanList.remove(e);
                    System.out.println("Đã xóa");
                    ReadAndWriteHR.writeHRList(humanList, PATH_FILE_HR, false);
                    System.out.println("Cập nhập thành công");
                    break;
                } else if (choose == 2) {
                    System.out.println(" không xóa");
                    display();
                    break;
                }else {
                    try {
                        throw new NumberFormatException("Không đúng định dạng");
                    } catch (NumberFormatException exception) {
                        System.out.println("Chỉ chọn 1 hoạc 2");
                    }
                    break;
                }
            }
        }

    }

    @Override
    public void display() {
        List<Human> humanList = ReadAndWriteHR.readHRList(PATH_FILE_HR);
        if (humanList.isEmpty()) {
            System.out.println("Chưa có tài khoản được thêm vào: ");
        } else
            for (Human e : humanList) {
                System.out.println(e);
            }

    }


    private void addEmployee() {
        String id;
        while (true) {
            System.out.println("Nhập mã nhân viên (NV-xxxx): ");
            id = scanner.nextLine();
            if (Regex.checkEmployeeID(id)) {
                break;
            } else {
                System.out.println("Mã nhân viên nhập sai");
            }
        }
        System.out.println("Nhập Họ Và Tên Nhân Viên: ");
        String name = Regex.checkName();
        System.out.println("Nhập ngày sinh(dd/MM/yyyy): ");
        String birthDay = Regex.inputBirthday();
        System.out.println("Nhập địa chỉ: ");
        String address = Regex.checkAddress();
        System.out.println("Nhập số điện thoại: ");
        String phoneNumber = Regex.checkPhone();
        System.out.println("Lương: ");
        String salary = Regex.inputNumber();
        System.out.println("Nhập bộ phận làm việc: ");
        String department = Regex.checkName();
        System.out.println("Nhập vị trí làm việc: ");
        String job = Regex.checkName();
        List<Human> humanList = new ArrayList<>();
        humanList.add(new Employee(id, name, birthDay, address, phoneNumber, salary, department, job));
        ReadAndWriteHR.writeHRList(humanList, PATH_FILE_HR, true);
        System.out.println("Thêm mới thành công");
    }

    private void addStudent() {
        String id;
        while (true) {
            System.out.println("Nhập mã học viên (HV-xxxx): ");
            id = scanner.nextLine();
            if (Regex.checkStudentID(id)) {
                break;
            } else {
                System.out.println("Mã học viên nhập sai");
            }
        }
        System.out.println("Nhập Họ Và Tên học Viên: ");
        String name = Regex.checkName();
        System.out.println("Nhập ngày sinh(dd/MM/yyyy): ");
        String birthDay = Regex.inputBirthday();
        System.out.println("Nhập địa chỉ: ");
        String address = Regex.checkAddress();
        System.out.println("Nhập số điện thoại: ");
        String phoneNumber = Regex.checkPhone();
        System.out.println("Điểm thi: ");
        String score = Regex.inputNumber();
        System.out.println("Nhập tên lớp: ");
        String className = scanner.nextLine();
        System.out.println("Nhập ngày nhập học: ");
        String dayJoin =  scanner.nextLine();
        List<Human> humanList = new ArrayList<>();
        humanList.add(new Student(id, name, birthDay, address, phoneNumber, score, className, dayJoin));
        ReadAndWriteHR.writeHRList(humanList, PATH_FILE_HR, true);
        System.out.println("Thêm mới thành công");
    }
}
