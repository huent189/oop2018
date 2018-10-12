package week4.task1;

public class HoaQua {
    private String nguonGoc;
    private int soLuong;
    private int giaMua;

    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
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
        System.out.println("Nguon goc " + nguonGoc +"\nSo luong" + soLuong);
    }
}
