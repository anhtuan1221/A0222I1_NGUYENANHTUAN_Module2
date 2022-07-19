package ss12_java_collection_framework.excercise.quanLy_sanPham_arrayList;

public class DanhBa {
    private String sdt;
    private String nhom;
    private String hoten;
    private String goiTinh;
    private String diachi;
    private String ngaySinh;
    private String email;
    public DanhBa() {
    }

    public DanhBa(String sdt, String nhom, String hoten, String goiTinh, String diachi, String ngaySinh, String email) {
        this.sdt = sdt;
        this.nhom = nhom;
        this.hoten = hoten;
        this.goiTinh = goiTinh;
        this.diachi = diachi;
        this.ngaySinh = ngaySinh;
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGoiTinh() {
        return goiTinh;
    }

    public void setGoiTinh(String goiTinh) {
        this.goiTinh = goiTinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "DanhBa{" +
                "sdt='" + sdt + '\'' +
                ", nhom='" + nhom + '\'' +
                ", hoten='" + hoten + '\'' +
                ", goiTinh='" + goiTinh + '\'' +
                ", diachi='" + diachi + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
