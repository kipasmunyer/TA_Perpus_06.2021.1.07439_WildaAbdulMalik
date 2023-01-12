/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entity.StaffEntity;

/**
 *
 * @author ASUS
 */
public interface InterfaceModel {
    public void createStaff(StaffEntity StaffE);
    
    public void updateStaff(int ind, StaffEntity StaffE);
    
    public void delete(int ind);
    }
