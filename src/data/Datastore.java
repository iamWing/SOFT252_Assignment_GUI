package data;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.Car;
import models.CarParks;
import models.Staff;

/**
 *
 * @author Fairymental
 */
public class Datastore implements Serializable {
    private ArrayList<Car> cars = new ArrayList<Car>();
    private ArrayList<Staff> staff = new ArrayList<Staff>();
    public transient static Datastore store;
    public Datastore()
    {
        store=this;
    }
    public boolean AddCar(Car car)
    {
        return this.cars.add(car);
    }
    public ArrayList<Car> GetCars(CarParks location)
    {
        ArrayList<Car> foundCars = new ArrayList<Car>();
        for (Car car : this.cars)
        {
            if (car.getLocation() == location)
                foundCars.add(car);
        }
        return foundCars;
    }
    public ArrayList<Car> GetCars()
    {
        ArrayList<Car> foundCars = new ArrayList<Car>();
        for (Car car : this.cars)
        {

                foundCars.add(car);
        }
        return foundCars;
    }
    public Car GetCarAtIndex(int index)
    {
        return this.cars.get(index);
    }
    
    public boolean RemoveCar(Car car)
    {
        return this.cars.remove(car);
    }
    public boolean AddStaff(Staff staff)
    {
        return this.staff.add(staff);
    }
    public ArrayList<Staff> GetStaff()
    {
        ArrayList<Staff> foundStaff = new ArrayList<Staff>();
        for (Staff staff : this.staff)
        {
            foundStaff.add(staff);
        }
        return foundStaff;
    }
    public boolean RemoveStaff(Staff staff)
    {
        return this.staff.remove(staff);
    }
    public static Datastore GetDatastore()
    {
        if (Datastore.store == null)
        {
            Datastore.store = LoadDatastore();
        }
        return Datastore.store;
    }
    private static Datastore LoadDatastore()
    {
        try
        {
            InputStream in = Files.newInputStream(Paths.get("database.dat"));
            ObjectInputStream objectReader = new ObjectInputStream(in);
            return (Datastore) objectReader.readObject();
        }
        catch (Exception Ex)
        {
            Datastore newStore = new Datastore();
            int result = JOptionPane.showConfirmDialog(null, "No data found. Load sample data?", "Datastore", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION)
            {
                int x;
                for (x=0; x<10; x++)
                {
                    Car car = new Car("CAR0" + x, "Sample Car", "Model " + x, 4, CarParks.CarPark01, "Sample Car");
                    newStore.AddCar(car);
                }
                for (x=0; x<10; x++)
                {
                    Car car = new Car("CAR1" + x, "Sample Car", "Model " + x, 4, CarParks.CarPark02, "Sample Car");
                    newStore.AddCar(car);
                }
                for (x=0; x<10; x++)
                {
                    Car car = new Car("CAR2" + x, "Sample Car", "Model " + x, 4, CarParks.CarPark03, "Sample Car");
                    newStore.AddCar(car);
                }

                for (x=0; x<10; x++)
                {
                    Staff staff = new Staff("EMP" + x, "Employee", "Number " + x, "Sample Data", "XXXXXXXXXX", "Sample");
                    newStore.AddStaff(staff);
                }
            }
            return newStore;
        }
    }
    public static void Save()
    {
        try
        {
            OutputStream out = Files.newOutputStream(Paths.get("database.dat"));
            ObjectOutputStream objectWriter = new ObjectOutputStream(out);
            objectWriter.writeObject(Datastore.store);
        }
        catch (Exception x)
        {
            JOptionPane.showMessageDialog(null, "Error saving database.");
            x.printStackTrace();
        }
    }
}
