package week4.task1;

public class Tao extends HoaQua {
    private int doNgot;
    private String loaiTao;

    public int getDoNgot() {
        return doNgot;
    }

    public void setDoNgot(int doNgot) {
        this.doNgot = doNgot;
    }

    public String getLoaiTao() {
        return loaiTao;
    }

    public void setLoaiTao(String loaiTao) {
        this.loaiTao = loaiTao;
    }

    public boolean cungLoai(Tao o){
        return (loaiTao.equals(o.loaiTao));
    }

    public boolean soSanhDoNgot(Tao o){
        return (doNgot < o.doNgot);
    }
}
