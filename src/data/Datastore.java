package data;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import models.Car;
import models.Staff;

/**
 *
 * @author Fairymental
 */
public class Datastore {
    private ArrayList<Car> cars;
    private ArrayList<Staff> staff;

    public ArrayList<Car> getVehicleList() {
        return cars;
    }
    
    public ArrayList<Staff> getStaffList() {
        return staff;
    }
}
