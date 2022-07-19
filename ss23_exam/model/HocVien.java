package ss23_exam.model;

public class HocVien extends NhanSu{
    private double diemThi;
    private String tenLop;
    private String ngayNhapHoc;

    public HocVien() {
    }

    @Override
    void search() {
    }

    public HocVien(String maDinhDanh, String hoVaTen, String ngaySinh, String diaChi, int soDienThoai, double diemThi, String tenLop, String ngayNhapHoc) {
        super(maDinhDanh, hoVaTen, ngaySinh, diaChi, soDienThoai);
        this.diemThi = diemThi;
        this.tenLop = tenLop;
        this.ngayNhapHoc = ngayNhapHoc;
    }

    public double getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(double diemThi) {
        this.diemThi = diemThi;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getNgayNhapHoc() {
        return ngayNhapHoc;
    }

    public void setNgayNhapHoc(String ngayNhapHoc) {
        this.ngayNhapHoc = ngayNhapHoc;
    }

    @Override
    public String toString() {
        return super.toString()+"HocVien{" +
                "diemThi=" + diemThi +
                ", tenLop='" + tenLop + '\'' +
                ", ngayNhapHoc='" + ngayNhapHoc + '\'' +
                '}';
    }
    public String toData(){
        return String.format("%s,%s,%s,%s,0",super.toData(),diemThi,tenLop,ngayNhapHoc);
    }
}
