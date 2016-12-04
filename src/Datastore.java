/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import models.Car;
import models.CarParks;
import models.Staff;

/**
 *
 * @author Fairymental
 */
public class Datastore {
    private ArrayList<Car> Cars;
    private ArrayList<Staff> Staff;
    
    public ArrayList<Staff> getStaffList()
    {
        return Staff;
    }
    public void AddCar(Car newCar)
    {
        Cars.add(newCar);
    }
    public void AddStaff(Staff newStaff)
    {
        Staff.add(newStaff);
    }
}
