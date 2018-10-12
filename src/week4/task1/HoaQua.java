package week4.task1;

public class HoaQua {
    private String ngayNhap;
    private int soLuong;
    private int giaMua;

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public void setGiaMua(int gia) {
        this.giaMua = gia;
    }

    /**
     *
     * @return so tien can dung de mua hoa qua
     */
    public int tongTienMua(){
        return giaMua * soLuong;
    }

    public void info(){
        System.out.println("Ngay nhap " + ngayNhap +"\nSo luong" + soLuong);
    }
}
