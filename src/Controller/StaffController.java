/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.StaffEntity;
import java.util.ArrayList;

public class StaffController {

    public void create(StaffEntity StaffE) {
        AllObjectModel.StaffMdl.createStaff(StaffE);
    }

    public boolean update(int ind, StaffEntity StaffE) {
        if (AllObjectModel.StaffMdl.getDataStaff().size() >= 0) {
            AllObjectModel.StaffMdl.updateStaff(ind, StaffE);
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<StaffEntity> getDataStaff() {
        return AllObjectModel.StaffMdl.getDataStaff();
    }

    public boolean delete(int ind) {
        if (AllObjectModel.StaffMdl.getDataStaff().size() >= 0) {
            AllObjectModel.StaffMdl.delete(ind);
            return true;
        } else {
            return false;
        }
    }

    public boolean cekLogin(String nama, String password) {
        int loop = 0;
        boolean yn = false;
        for (int i = 0; i < AllObjectModel.StaffMdl.getDataStaff().size(); i++) {
            if (nama.equals(AllObjectModel.StaffMdl.getDataStaff().get(i).getNama())) {
                yn = true;
                break;
            } else {
                loop++;
            }
        }
        return yn;
    }

//                    && (password.equals(AllObjectModel.StaffMdl.getDataStaff().get(i).getPassword())
}
