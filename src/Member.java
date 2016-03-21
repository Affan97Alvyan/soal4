package member;

public class Member {

    private String nama, team;
    private int umur, penampilan, suara, attitude, rata;

    public Member() {
        this.nama = "";
        this.umur = 0;
        this.team = "";
    }

    public Member(String n, int u, String t) {
        this.nama = n;
        this.umur = u;
        this.team = t;
    }

    public void setPenampilan(int p) {
        this.penampilan = p;
    }

    public void setSuara(int s) {
        this.suara = s;
    }

    public void setAttitude(int a) {
        this.attitude = a;
    }

    public String getNama() {
        return nama;
    }

    public String getTeam() {
        return team;
    }

    public int getUmur() {
        return umur;
    }

    public int getPenampilan() {
        return penampilan;
    }

    public int getSuara() {
        return suara;
    }

    public int getAttitude() {
        return attitude;
    }

    public int getNilai() {
        return rata = (penampilan + suara + attitude) / 3;
    }

}
