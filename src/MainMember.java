package member;

import java.util.ArrayList;

public class MainMember {

    public static ArrayList<Member> listMember = new ArrayList<>();

    public static void main(String[] args) {
        Member m1 = new Member("Alvin", 23, "Coli");
        Member m2 = new Member("Kevin", 20, "Coli");
        Member m3 = new Member("Rizal", 28, "Coli");
        listMember.add(m1);
        listMember.add(m2);
        listMember.add(m3);

        m1.setPenampilan(70);
        m1.setSuara(75);
        m1.setAttitude(85);

        m2.setPenampilan(75);
        m2.setSuara(70);
        m2.setAttitude(88);

        m3.setPenampilan(78);
        m3.setSuara(68);
        m3.setAttitude(78);

        for (int i = 0; i < listMember.size(); i++) {
            System.out.println("=====Daftar Member=====");
            System.out.println("Nama\t: " + listMember.get(i).getNama());
            System.out.println("Umur\t: " + listMember.get(i).getUmur());
            System.out.println("Team\t: " + listMember.get(i).getTeam());
            System.out.println("Rata-rata nilai : " + listMember.get(i).getNilai());
            System.out.println("=======================");
            System.out.println();
        }
    }
}
