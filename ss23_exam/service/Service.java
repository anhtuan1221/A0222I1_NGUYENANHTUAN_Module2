package ss23_exam.service;

import ss23_exam.model.HocVien;
import ss23_exam.model.NhanSu;
import ss23_exam.model.NhanVien;
import ss23_exam.util.FileHelperExam;
import ss23_exam.util.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
    private static Validate val = new Validate();
    private static Scanner scanner = new Scanner(System.in);
    private List<NhanSu> nhanSus = new ArrayList<>();
    private FileHelperExam fileHelper = new FileHelperExam();
    private static final String PATH = "ss23_exam/data/personal_records.csv";

    public Service() {
        nhanSus = mapToNhanSu();
    }

    private List<NhanSu> mapToNhanSu() {
        List<NhanSu> result = new ArrayList<>();
        List<String> lines = fileHelper.read(PATH);
        for (int i = 0; i < lines.size(); i++) {
            String[] tmp = lines.get(i).split(",");
            String maDinhDanh = tmp[0];
            String hoVaTen = tmp[1];
            String ngaySinh = tmp[2];
            String diaChi = tmp[3];
            int sdt = Integer.parseInt(tmp[4]);
            if (tmp[tmp.length - 1].equals("0")) {
                double diemThi = Double.parseDouble(tmp[5]);
                String tenLop = tmp[6];
                String ngayNhapHoc = tmp[7];
                HocVien hocVien = new HocVien(maDinhDanh, hoVaTen, ngaySinh, diaChi, sdt, diemThi, tenLop, ngayNhapHoc);
                result.add(hocVien);
            } else {
                double luong = Double.parseDouble(tmp[5]);
                int phongBan = Integer.parseInt(tmp[6]);
                String viTri = tmp[7];
                NhanVien nhanVien = new NhanVien(maDinhDanh, hoVaTen, ngaySinh, diaChi, sdt, luong, phongBan, viTri);
                result.add(nhanVien);
            }
        }
        return result;
    }

    public List<NhanSu> findAll() {
        return nhanSus;
    }

    public void themMoiNhanSu(NhanSu nhanSu)  {
        nhanSus.add(nhanSu);
        fileHelper.write(PATH, nhanSus, false);
    }

    public void xoaNhanSu(String maDinhDanh) {
        for (int i = 0; i < nhanSus.size(); i++) {
            if (nhanSus.get(i).getMaDinhDanh() == maDinhDanh) {
                nhanSus.remove(i);
                fileHelper.write(PATH, nhanSus, false);
                return;
            }
        }
    }

}


