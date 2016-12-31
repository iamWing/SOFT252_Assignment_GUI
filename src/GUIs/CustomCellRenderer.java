/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import data.Datastore;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import models.Car;
import models.Staff;

/**
 *
 * @author FairyMental
 */
public class CustomCellRenderer  extends DefaultListCellRenderer {
    
    ArrayList<Car> carList = Datastore.GetCars();
    
    public Component getListCellRendererComponent( JList list, Object value, int index, boolean isSelected, boolean cellHasFocus ) {
        
        Component c = super.getListCellRendererComponent( list, value, index, isSelected, cellHasFocus );
        
        if(value instanceof Car)
        {
            Car nextCar = (Car) value;
            c.setForeground(Color.BLUE);
            if(nextCar.isAllocated())
                c.setForeground(Color.YELLOW);
            if(nextCar.isDamaged())
                c.setForeground(Color.RED);
        }
        
        if(value instanceof Staff)
        {
            // if staff allocated a car
        }
        
        return c;
    }
    
}