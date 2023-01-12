package studikasus;

public class Perpustakaan {

    protected String nama;
    protected String alamat;
    protected String nikStaff;
    protected String passStaff;
    protected String judul;
    protected String tglTerbit;
    protected int jmlHal;
    protected int idBuku;
    protected boolean status;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getnikStaff() {
        return nikStaff;
    }

    public void setnikStaff(String nikStaff) {
        this.nikStaff = nikStaff;
    }

    public String getpassStaff() {
        return passStaff;
    }

    public void setpassStaff(String passStaff) {
        this.passStaff = passStaff;
    }

    public String getjudul() {
        return judul;
    }

    public void setjudul(String judul) {
        this.judul = judul;
    }

    public String gettglTerbit() {
        return tglTerbit;
    }

    public void settglTerbit(String tglTerbit) {
        this.tglTerbit = tglTerbit;
    }

    public int getjmlHal() {
        return jmlHal;
    }

    public void setjmlHal(int jmlHal) {
        this.jmlHal = jmlHal;
    }

    public int getidBuku() {
        return idBuku;
    }

    public void setidBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public boolean getstatus() {
        return status;
    }

    public void setstatus(boolean status) {
        this.status = status;
    }

}
