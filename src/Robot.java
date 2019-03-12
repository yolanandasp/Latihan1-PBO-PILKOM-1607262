/*
Robot yang akan bertarung. Robot punya senjata, perisai dan skor kesehatan.
*/
//
public class Robot {
    Senjata[] iSenjata = new Senjata[3];
    Perisai[] iPerisai = new Perisai[3];
    Senjata oSenjata ;
    Perisai oPerisai ;
    int kesehatan;
    String nama = "";
    int jmls=0;
    int jmlp=0;

    //isi senjata milik robot
    public void  tambahSenjata(Senjata s, Perisai p) {
        oSenjata = s;
        oPerisai = p;
    }

    public void  tambahSenjata1(Senjata s, int ke) {
        iSenjata[ke] = s;
    }

    public void  tambahPerisai1(Perisai p, int ke) {
        iPerisai[ke] = p;
    }

    //print kesehatan dsb
    public void printStatistik() {
        System.out.println("Nama Robot: "+nama);
        System.out.println("Kesehatan:"+kesehatan);
    }

    //constructor
    public Robot(String vNama) {
        nama = vNama;
        kesehatan = 100; //default
    }

    /* menyerang robot lain, skor kesehatan robot lain akan berkurang
    */
    public void serang(Robot rLawan) {
       //skor kesehatan robot lawan akan dikurangi
        rLawan.kesehatan = rLawan.kesehatan - oSenjata.kekuatan;
        //skor lawan hanya berkurang 15 karena menggunakan perisai
        rLawan.kesehatan = rLawan.kesehatan + oPerisai.skorKekuatan;

    }
}
