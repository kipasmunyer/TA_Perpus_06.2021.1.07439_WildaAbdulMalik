package studikasus;

import java.util.*;

public class Kode extends Perpustakaan {

    public Kode(int idbuku, boolean status) {
        super.status = status;
        super.idBuku = idbuku;

    }

    public int getidbuku() {
        return idBuku;
    }

    public void setidbuku(int idbuku) {
        this.idBuku = idbuku;
    }

    @Override
    public boolean getstatus() {
        return status;
    }

    @Override
    public void setstatus(boolean status) {
        this.status = status;
    }

    void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.println("ID Buku :");
        this.idBuku = input.nextInt();
        System.out.println("status :");
        this.status = input.nextBoolean();
    }

    void cetakData() {
        System.out.println("idbuku  = " + this.idBuku);
        System.out.println("status buku= " + this.status);
    }

}
