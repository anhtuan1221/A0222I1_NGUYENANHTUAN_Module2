package ss23_exam.model;

public abstract class NhanSu {
    private String maDinhDanh;
    private String hoVaTen;
    private String ngaySinh;
    private String diaChi;
    private int soDienThoai;

    public NhanSu() {
    }
    abstract void search();
    public NhanSu(String maDinhDanh, String hoVaTen, String ngaySinh, String diaChi, int soDienThoai) {
        this.maDinhDanh = maDinhDanh;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public String getMaDinhDanh() {
        return maDinhDanh;
    }

    public void setMaDinhDanh(String maDinhDanh) {
        this.maDinhDanh = maDinhDanh;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    @Override
    public String toString() {
        return "NhanSu{" +
                "maDinhDanh=" + maDinhDanh +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                '}';
    }

    public String toData(){
        return String.format("%s,%s,%s,%s,%s",maDinhDanh,hoVaTen,ngaySinh,diaChi,soDienThoai);
    }
}
