package week4.task1;

public class Cam extends HoaQua {
    private int soMui;
    private int doChua;

    public int getSoMui() {
        return soMui;
    }

    public void setSoMui(int soMui) {
        this.soMui = soMui;
    }

    public int getDoChua() {
        return doChua;
    }

    public void setDoChua(int doChua) {
        this.doChua = doChua;
    }

    public boolean soSanhSoMui(Cam o){
        return (soMui < o.soMui);
    }

    public boolean soSanhDoChua(Cam o){
        return (doChua < o.doChua);
    }

}
