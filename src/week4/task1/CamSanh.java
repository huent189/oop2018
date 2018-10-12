package week4.task1;

public class CamSanh extends Cam {
    private String noiTrong;
    private String noiBan;

    public String getNoiTrong() {
        return noiTrong;
    }

    public void setNoiTrong(String noiTrong) {
        this.noiTrong = noiTrong;
    }

    public String getNoiBan() {
        return noiBan;
    }

    public void setNoiBan(String noiBan) {
        this.noiBan = noiBan;
    }

    public boolean cungNoiTrong(CamSanh other){
        return (noiTrong.equals(other.noiTrong));
    }

    public boolean cungNoiBan(CamSanh other){
        return noiBan.equals(other.noiBan);
    }
}
