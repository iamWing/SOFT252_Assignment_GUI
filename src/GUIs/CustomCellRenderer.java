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
import java.util.Date;
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
    Date when;
    
    public Component getListCellRendererComponent( JList list, Object value, int index, boolean isSelected, boolean cellHasFocus ) {
        if (this.when == null)
            this.when = new Date();
        Component c = super.getListCellRendererComponent( list, value, index, isSelected, cellHasFocus );
        
        if(value instanceof Car)
        {
            Car nextCar = (Car) value;
            c.setForeground(new Color(0,100,0)); // Dark green
            if(nextCar.isAllocated(this.when))
                c.setForeground(Color.ORANGE);
            if(nextCar.isInService(this.when))
                c.setForeground(Color.GRAY);
            if(nextCar.isDamaged())
                c.setForeground(Color.RED);
        }
        
        if(value instanceof Staff)
        {
            // if staff allocated a car
            Staff nextStaff = (Staff) value;
            c.setForeground(new Color(0,100,0)); // Dark green
            if(nextStaff.hasCarAllocated(this.when))
                c.setForeground(Color.ORANGE);
        }
        
        return c;
    }
    public CustomCellRenderer(Date date)
    {
        super();
        this.when = date;
    }
}
