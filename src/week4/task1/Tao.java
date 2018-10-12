package week4.task1;

public class Tao extends HoaQua {
    private boolean sweet;
    private String loaiTao;
    public boolean isSweet() {
        return sweet;
    }

    public void setSweet(boolean sweet) {
        this.sweet = sweet;
    }

    public String getLoaiTao() {
        return loaiTao;
    }

    public void setLoaiTao(String loaiTao) {
        this.loaiTao = loaiTao;
    }

    /**
     *
     * @return true neu co the ngam ruou duoc, false neu khong
     */
    public boolean coTheNgamRuou(){
        if(loaiTao == "tao meo"){
            return true;
        }
        return false;
    }
    @Override
    public void info() {
        System.out.println("Loai hoa qua: Tao");
        super.info();
        System.out.println("Loai tao: " + loaiTao);
    }
}
