package Controller;

import Entity.BukuEntity;
import java.util.ArrayList;

public class BukuController {

    public void createBuku(BukuEntity bukuE) {
        AllObjectModel.BukuMdl.createBuku(bukuE);
    }
    
    public void updateBuku(int ind, BukuEntity bukuE) {
        AllObjectModel.BukuMdl.updateBuku(ind, bukuE);
    }
    
    public void deleteBuku(int ind) {
        AllObjectModel.BukuMdl.deleteBuku(ind);
    }
    
    public ArrayList<BukuEntity> DataBuku(){
        return AllObjectModel.BukuMdl.getDataBuku();
    }
}
