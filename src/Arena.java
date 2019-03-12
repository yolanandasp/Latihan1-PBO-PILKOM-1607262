/*
     Menjalankan pertarungan antar dua robot

 */

public class Arena{
    private Robot robot1;
    private Robot robot2;

    public void tambahRobot(Robot r1,Robot r2) {
        robot1 = r1;
        robot2 = r2;
    }

    public void bertanding() {
        //UI sederhana untuk pertandingan

        //loop sampai salah satu robot habis skor kesehatannya
        boolean isSelesai = false;

        //LENGKAPI dengan NIM dan NAMA
        System.out.println("Saya berjanji tdk berbuat curang dan/atau membantu orang lain berbuat curang");
        System.out.println(" Quiz 1 27 Feb ");
        System.out.println(" NIM: 1607262 "); //nomor 1
        System.out.println(" NAMA: Yola Nanda Sekar Prima");

        System.out.print("Pertandingan dimulai =====\n");

        //player
        Robot robotAktif = robot1;
        Robot robotPasif = robot2;

        while (!isSelesai) {
            System.out.println("");
            System.out.println("Giliran robot:"+robotAktif.nama);
            System.out.println("Robot menyerang dengan senjata "+robotAktif.oSenjata.nama); //nomor3
            robotAktif.serang(robotPasif);
            //print kesehatan
            robot1.printStatistik();
            robot2.printStatistik();
            //tukar peran
            Robot temp = robotAktif; //supaya tdk tertimpa
            robotAktif = robotPasif;
            robotPasif = temp;

            //stop jika salah satu robot skor kesehatanya nol
            isSelesai = (robotAktif.kesehatan<=0 || robotPasif.kesehatan<=0);

        }
        System.out.println("Pertandingan Selesai");

        //cek pemenang
        //lengkapi
        if(robotAktif.kesehatan>0){   //nomor 2
            System.out.println("Pemenang:"+robotAktif.nama);
        }else{
            System.out.println("Pemenang:"+robotPasif.nama);
        }

    }


    public static void main(String [] args) {
        //buat arena
        Arena oArena = new Arena();

        //siapkan robot
        Robot robot1 = new Robot("Robot pertama");
        Robot robot2 = new Robot("Robot kedua");

        //tambahkan senjata ke robot
        SenjataKilat oSenjataKilat1 = new SenjataKilat();
        Perisai oPerisai1 = new Perisai();
        robot1.tambahSenjata(oSenjataKilat1,oPerisai1 );

        Senjata oSenjataPukulan2 = new SenjataPukulan();
        Perisai oPerisai2 = new Perisai();
        robot2.tambahSenjata(oSenjataPukulan2, oPerisai2);

        //tambahkan robot ke arena
        oArena.tambahRobot(robot1,robot2);

        //mainkan
        oArena.bertanding();
    }

}
