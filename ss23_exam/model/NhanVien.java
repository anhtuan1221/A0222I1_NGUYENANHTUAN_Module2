package ss23_exam.model;

public class NhanVien extends NhanSu{
    private double luong;
    private int phongBan;
    private String viTri;

    public NhanVien() {
    }

    @Override
    void search() {
    }

    public NhanVien(String maDinhDanh, String hoVaTen, String ngaySinh, String diaChi, int soDienThoai, double luong, int phongBan, String viTri) {
        super(maDinhDanh, hoVaTen, ngaySinh, diaChi, soDienThoai);
        this.luong = luong;
        this.phongBan = phongBan;
        this.viTri = viTri;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(int phongBan) {
        this.phongBan = phongBan;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    @Override
    public String toString() {
        return super.toString()+"NhanVien{" +
                "luong=" + luong +
                ", phongBan=" + phongBan +
                ", viTri='" + viTri + '\'' +
                '}';
    }
    public String toData(){
        return String.format("%s,%s,%s,%s,1",super.toData(),luong,phongBan,viTri);
    }
}
