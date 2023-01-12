package Models;

import Entity.BukuEntity;
import java.util.ArrayList;

public class BukuModel {

    private ArrayList<BukuEntity> DatabaseBuku;

    public BukuModel() {
        DatabaseBuku = new ArrayList<>();
    }
    
    public void createBuku(BukuEntity bukuE){
        DatabaseBuku.add(bukuE);
    }
    
    public void updateBuku(int ind, BukuEntity bukuE){
        DatabaseBuku.set(ind, bukuE);
    }
    
    public void deleteBuku(int ind){
        DatabaseBuku.remove(ind);
    }
    
    public ArrayList<BukuEntity> getDataBuku(){
        return DatabaseBuku;
    }
}
