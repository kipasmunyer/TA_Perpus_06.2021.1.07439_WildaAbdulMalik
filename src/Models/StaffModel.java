package Models;

import Entity.StaffEntity;
import java.util.ArrayList;

public class StaffModel implements InterfaceModel{
     private ArrayList<StaffEntity> DatabaseStaff;

    public StaffModel() {
        DatabaseStaff = new ArrayList<>();
    }
    
    public void createStaff(StaffEntity StaffE){
        DatabaseStaff.add(StaffE);
    }
    
    public void updateStaff(int ind, StaffEntity StaffE){
        DatabaseStaff.set(ind, StaffE);
    }
    
    public void delete(int ind){
        DatabaseStaff.remove(ind);
    }
    
    public ArrayList<StaffEntity> getDataStaff(){
        return DatabaseStaff;
    }
}
