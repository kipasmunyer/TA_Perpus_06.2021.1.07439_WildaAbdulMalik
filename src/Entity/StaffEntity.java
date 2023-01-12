package Entity;

import studikasus.Perpustakaan;

public class StaffEntity extends KomponenPerpusEntity {

    private String password;

    public StaffEntity(String password, String nama) {
        super(nama);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNama() {
        return super.getNama(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
//    void cetakData() {
//        System.out.println("namaStaff buku= " + this.nama);
//        System.out.println("alamatStaff buku= " + this.alamat);
//        System.out.println("nikStaff buku= " + this.nikStaff);
//        System.out.println("passStaff buku= " + this.passStaff);
//    }

}
