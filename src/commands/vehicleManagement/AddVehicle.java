/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands.vehicleManagement;

import data.Datastore;
import commands.interfaces.ICommandBehavior;
import java.util.ArrayList;
import models.Car;
import models.CarParks;

/**
 *
 * @author Wing
 */
public class AddVehicle implements ICommandBehavior {
    private ArrayList<Car> vehicleList;
    private Car vehicle;

    public AddVehicle(String _carId, Datastore _db) {
        vehicle = new Car(_carId);
        vehicleList = _db.getVehicleList();
    }

    public AddVehicle(String _carId, String _brand, String _model, 
            int _seats, CarParks _loc, String _desc, Datastore _db) {
        vehicle = new Car(_carId, _brand, _model, _seats, _loc, _desc);
        vehicleList = _db.getVehicleList();
    } 

    @Override
    public boolean executeCommand() {
        return vehicleList.add(vehicle);
    }

    @Override
    public boolean undoCommand() {
        return vehicleList.remove(vehicle);
    }
}
