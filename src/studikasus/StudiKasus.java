package studikasus;

import Entity.StaffEntity;
import Entity.BukuEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudiKasus {

//    static StudiKasus info = new StudiKasus();
//    static BukuEntity bk = new BukuEntity("", 1, "");
//    static Kode kd = new Kode(1, true);
//    static Penerbit pb = new Penerbit("", "");
//    static Penulis pn = new Penulis("","");
//    static StaffEntity st = new StaffEntity("", "", "", "");
//    static ArrayList<BukuEntity> bku = new ArrayList<>();
//    static ArrayList<Kode> code = new ArrayList<>();
//    static ArrayList<Penerbit> pbt = new ArrayList<>();
//    static ArrayList<Penulis> pns = new ArrayList<>();
//    static ArrayList<StaffEntity> stf = new ArrayList<>();
//
//    public static void main(String[] args) {
//        info.menu();
//        BukuEntity bk = new BukuEntity("", 1, "");
//        Kode kd = new Kode(1, true);
//        Penerbit pb = new Penerbit("", "");
//        Penulis pn = new Penulis("");
//        StaffEntity st = new StaffEntity("", "", "", "");
//
//        bk.cetakData();
//        kd.cetakData();
//        pb.cetakData();
//        pn.cetakData();
//       st.cetakData();
//    }
//
//    public void menu() {
//        int pil;
//        String i;
//        do {
//            System.out.print("\n1.Input Buku\n2.Output Buku\n3.Delete Buku");
//            Scanner menuInput = new Scanner(System.in);
//            System.out.println("");
//            System.out.print("Masukkan Pilihan :");
//            pil = menuInput.nextInt();
//            switch (pil) {
//                case 1:
//                    bk.inputData();
//                    bku.add(new BukuEntity(bk.judul, bk.jmlHal, bk.tglTerbit));
//                    break;
//                case 2:
//                    this.display();
//                    break;
//                case 3:
//                    System.out.println("\n===");
//                    for (BukuEntity itembuku : bku) {
//                        System.out.print("\n");
//                        itembuku.cetakData();
//                    }
//                    System.out.println("===");
//                    int urut = 1;
//                    do {
//                        System.out.print("Masukkan Nomor buku : ");
//                        int nomor = menuInput.nextInt();
//                        if ( nomor >= urut) {
//                            bku.remove(nomor - 1);
//                        }
//                            System.out.print("Apakah Ingin Menghapus Buku Lagi? (y/t) ");
//                            String pilih = menuInput.next();
//                            System.out.println("====================");
//                            switch (pilih) {
//                                case "y":
//                                    urut++;
//                                    break;
//                                case "t":
//                                    urut = 0;
//                                    break;
//                            }
//                        }while (urut>0);
//            }
//
//        } while (pil != 0);
//    }
//    
//   public void display (){
//       int nomor = 1;
//       for (int i=0;i<bku.size();i++){
//           System.out.println("Buku ke - " + nomor);
//            System.out.println("====================");
//            nomor++;
//            bku.get(i).cetakData();
//       }
//   }
}
