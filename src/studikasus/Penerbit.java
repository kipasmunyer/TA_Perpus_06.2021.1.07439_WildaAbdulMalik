package studikasus;

public class Penerbit extends Perpustakaan {

    public Penerbit(String nama, String alamat) {
        super.nama = nama;
        super.alamat = alamat;
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
//        System.out.println("namaPenerbit buku= " + this.nama);
//        System.out.println("alamatPenerbit buku= " + this.alamat);
//    }
}
