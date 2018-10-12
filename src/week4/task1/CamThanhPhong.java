package week4.task1;

public class CamThanhPhong extends Cam {
    private String mucdich;
    private String tinhTrang;

    public String getMucdich() {
        return mucdich;
    }

    public void setMucdich(String mucdich) {
        this.mucdich = mucdich;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public boolean coTheBan(){
        if(tinhTrang.equals("hong")){
            return false;
        }
        return true;
    }

    public boolean coGiamGia(){
        if(tinhTrang.equals("de lau")){
            return true;
        }
        return false;
    }
}