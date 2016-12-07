/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands.vehicleManagement;

import commands.interfaces.ICommandBehavior;
import data.Datastore;
import models.Car;
import models.CarParks;

/**
 *
 * @author Wing
 */
public class AddVehicle implements ICommandBehavior {
    private Car vehicle;

    public AddVehicle(String _carId) {
        vehicle = new Car(_carId);
    }

    public AddVehicle(String _carId, String _brand, String _model, 
            int _seats, CarParks _loc, String _desc) {
        vehicle = new Car(_carId, _brand, _model, _seats, _loc, _desc);
    } 

    @Override
    public boolean executeCommand() {
        return Datastore.cars.add(vehicle);
    }

    @Override
    public boolean undoCommand() {
        return Datastore.cars.remove(vehicle);
    }
}
