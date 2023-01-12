package studikasus;

public class Penulis extends Perpustakaan {

    public Penulis(String nama, String alamat) {
        super.nama = nama;
        super.alamat = alamat;
    }

    Penulis(String string) {
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String getAlamat() {
        return alamat;
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
//
//    void cetakData() {
//        System.out.println("namaPenulis buku= " + this.nama);
//    }
}
