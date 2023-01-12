package Main;

import Entity.BukuEntity;
import Entity.StaffEntity;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Main p = new Main();
        p.LoginCLI();
    }

    Scanner inout = new Scanner(System.in);
    static Date tgl = new Date();

    public void LoginCLI() {
        boolean yn = true;
        while (yn) {
            System.out.println("1. Daftar Staff ");
            System.out.println("2. Login  Staff ");
            System.out.println("3. Keluar");
            System.out.print("pilih : ");
            int pilih = inout.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Username : ");
                    String username = inout.next();
                    System.out.print("Masukkan Password : ");
                    String password = inout.next();
                    AllObjectController.StaffCtrl.create(new StaffEntity(password, username));
                    System.out.println("");
                    for (int i = 0; i < AllObjectController.StaffCtrl.getDataStaff().size(); i++) {
                        System.out.println("Username : " + AllObjectController.StaffCtrl.getDataStaff().get(i).getNama());
                        System.out.println("Password : " + AllObjectController.StaffCtrl.getDataStaff().get(i).getPassword());
                    }
                    System.out.println("");
                    break;
                case 2:
                    if (AllObjectController.BukuCtrl.DataBuku().size() > 0) {
                        System.out.println("kosong");
                    }else{
                        boolean abc = false;
                        System.out.print("Masukkan Username : ");
                        username = inout.next();
                        System.out.print("Masukkan Password : ");
                        password = inout.next();
                        for (int i = 0; i < AllObjectController.StaffCtrl.getDataStaff().size(); i++) {
                            if ((AllObjectController.StaffCtrl.getDataStaff().get(i).getNama().equals(username))
                                    && (AllObjectController.StaffCtrl.getDataStaff().get(i).getPassword().equals(password))) {
                                abc = true;
                                break;
                            } else {
                                i++;
                            }
                        }
                        if (abc) {
                            menuBuku();
                        } else {
                            System.out.println("gagal");
                        }
                    }

                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan Anda salah ");
                    break;
            }
        }
    }

    public void menuBuku() {
        try {
            Date tanggal;
            boolean x = true;
            while (x) {
                System.out.println("1. Tambah Buku");
                System.out.println("2. Update Buku ");
                System.out.println("3. Delete Buku");
                System.out.println("4. Data Buku");
                System.out.println("5. Keluar data buku");
                System.out.print("pilih : ");
                int pilih = inout.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.print("Masukkan Nama Buku  : ");
                        String namaBk = inout.next();
                        System.out.print("Masukkan Judul Buku : ");
                        String judulBk = inout.next();
                        System.out.print("Masukkan Jumlah Hal : ");
                        String ind = inout.next();
                        System.out.print("Masukkan Penerbit Buku : ");
                        String penerbit = inout.next();
                        System.out.println("Tanggal Terbit : " + tgl);
                        Date tgll = tgl;
                        AllObjectController.BukuCtrl.createBuku(new BukuEntity(namaBk, judulBk, ind, tgll, penerbit));
                        break;
                    case 2:
                        if (dataKosong()) {
                            System.out.println(" Data Kosong ");
                        } else {
                            System.out.print("Masukkan Index : ");
                            int index = inout.nextInt();
                            System.out.print("Masukkan Nama Buku  : ");
                            String nmBk = inout.next();
                            System.out.print("Masukkan Judul Buku : ");
                            String jdlBk = inout.next();
                            System.out.print("Masukkan Jumlah Hal : ");
                            String jmlhHal = inout.next();
                            System.out.print("Masukkan Penerbit Buku : ");
                            String pnbr = inout.next();
                            System.out.println("Tanggal Terbit : " + tgl);
                            Date tgl2 = tgl;
                            AllObjectController.BukuCtrl.updateBuku(index, new BukuEntity(nmBk, jdlBk, jmlhHal, tgl2, pnbr));
                        }
                        break;
                    case 3:
                        if (dataKosong()) {
                            System.out.println("Data kosong");
                        } else {
                            System.out.print("Masukkan Index : ");
                            int indx = inout.nextInt();
                            AllObjectController.BukuCtrl.deleteBuku(indx);
                        }
                        break;
                    case 4:
                        if (dataKosong()) {
                            System.out.println("Data kosong");
                        } else {
                            for (int i = 0; i < AllObjectController.BukuCtrl.DataBuku().size(); i++) {
                                System.out.println("Data Buku ke " + i);
                                System.out.println("Nama Buku  : " + AllObjectController.BukuCtrl.DataBuku().get(i).getNama());
                                System.out.println("Judul Buku : " + AllObjectController.BukuCtrl.DataBuku().get(i).getJudul());
                                System.out.println("Jumlah Halaman : " + AllObjectController.BukuCtrl.DataBuku().get(i).getJmlHal());
                                System.out.println("Tanggal Terbit Buku : " + AllObjectController.BukuCtrl.DataBuku().get(i).getTglTerbit());
                                System.out.println("Penerbit Buku : " + AllObjectController.BukuCtrl.DataBuku().get(i).getPenerbit());
                                System.out.println("-----");
                            }
                        }
                        break;
                    case 5:
                        LoginCLI();
                        break;
                    default:
                        System.out.println("Pilihan Anda salah ");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean dataKosong() {
        if (AllObjectController.BukuCtrl.DataBuku().isEmpty() == true) {
            return true;
        } else {
            return false;
        }
    }
}
