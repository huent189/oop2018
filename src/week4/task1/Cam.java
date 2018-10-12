package week4.task1;

public class Cam extends HoaQua {
    private int soMui;
    private boolean acid;

    public int getSoMui() {
        return soMui;
    }

    public void setSoMui(int soMui) {
        this.soMui = soMui;
    }

    public boolean isAcid() {
        return acid;
    }

    public void setAcid(boolean acid) {
        this.acid = acid;
    }

    @Override
    public void info() {
        System.out.println("Loai hoa qua: Cam");
        super.info();
        System.out.println("vi " + (acid ? "chua" : "khong chua"));
    }
}
