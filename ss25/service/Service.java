package ss25.service;


import ss25.exception.NotFoundException;
import ss25.model.DanhBa;
import ss25.util.FileHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service extends DanhBa {
    private static Scanner scanner = new Scanner(System.in);

    private List<DanhBa> danhBas = new ArrayList<>();
    private FileHelper fileHelper = new FileHelper();
    private static final String PATH = "ss25/data/File.csv";

    public Service() {
        danhBas = mapToPhones();
    }

    public void add(DanhBa danhBa) {
        danhBas.add(danhBa);
    }

    public void create(DanhBa danhBa) {
        danhBas.add(danhBa);
       fileHelper.write(PATH, danhBas, false);
    }

    //    public void display() {
//        create((DanhBa) danhBas);
//        for (DanhBa p : danhBas) {
//            System.out.println(p + "\n");
//        }
//    }
    public List<DanhBa> findAll() {
        return danhBas;
    }

    public void delete(String sdt) throws NotFoundException {
        for (int i = 0; i < danhBas.size(); i++) {
            if (danhBas.get(i).getSdt().equals(sdt)) {
                danhBas.remove(i);
                fileHelper.write(PATH, danhBas, false);
                return;
            }
        }

        throw new NotFoundException(sdt + " is not exists");
    }

    public List<DanhBa> search(String hoten) {
        List<DanhBa> result = new ArrayList<DanhBa>();

        for (int i = 0; i < danhBas.size(); i++) {
            if (danhBas.get(i).getHoten().contains(hoten)) {
                result.add(danhBas.get(i));
            }
        }

        return result;
    }

    private List<DanhBa> mapToPhones() {
        List<DanhBa> result = new ArrayList<>();

        List<String> lines = fileHelper.read(PATH);

        for (int i = 0; i < lines.size(); i++) {
            String[] tmp = lines.get(i).split(",");
            String sdt = tmp[0];
            String nhom = tmp[1];
            String hoTen = tmp[2];
            String gioiTinh = tmp[3];
            String diaChi = tmp[4];
            String ngaySinh = tmp[5];
            String email = tmp[6];

            DanhBa danhBa = new DanhBa(sdt, nhom, hoTen, gioiTinh, diaChi, ngaySinh, email);
            result.add(danhBa);
        }
        return result;
    }





}
