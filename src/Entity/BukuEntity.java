package Entity;

import java.util.Date;

public class BukuEntity extends KomponenPerpusEntity {

    private String judul;
    private String jmlHal;
    private String Penerbit;
    private Date tglTerbit;

    public BukuEntity(String judul, String jmlHal, String Penerbit, Date tglTerbit, String nama) {
        super(nama);
        this.judul = judul;
        this.jmlHal = jmlHal;
        this.Penerbit = Penerbit;
        this.tglTerbit = tglTerbit;
    }

    public String getPenerbit() {
        return Penerbit;
    }

    public void setPenerbit(String Penerbit) {
        this.Penerbit = Penerbit;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJmlHal() {
        return jmlHal;
    }

    public void setJmlHal(String jmlHal) {
        this.jmlHal = jmlHal;
    }

    public Date getTglTerbit() {
        return tglTerbit;
    }

    public void setTglTerbit(Date tglTerbit) {
        this.tglTerbit = tglTerbit;
    }

//    void inputData() {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Judul BukuEntity :");
//        this.judul = input.next();
//        System.out.print("Jumlah Halaman :");
//        this.jmlHal = input.nextInt();
//        System.out.print("Tanggal Terbit :");
//        this.tglTerbit = input.next();
//    }
//
//    void cetakData() {
//        System.out.println("Judul buku = " + this.judul);
//        System.out.println("Jumlah Halaman buku = " + this.jmlHal);
//        System.out.println("Tanggal Terbit buku = " + this.tglTerbit);
//    }
    @Override
    public void setNama(String nama) {
        super.setNama(nama); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNama() {
        return super.getNama(); //To change body of generated methods, choose Tools | Templates.
    }

}
