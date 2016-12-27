/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands.vehicleManagement;

import commands.interfaces.ICommandBehavior;
import data.Datastore;
import models.Staff;

/**
 *
 * @author FairyMental
 */
public class AddStaff implements ICommandBehavior {
    private Staff staff;
    
    public AddStaff(String _STAFFID, String _fName, String _lName, String _address, String _licenseNumber, String _licenseType)
    {
        staff = new Staff(_STAFFID, _fName, _lName, _address, _licenseNumber, _licenseType);        
    }
    public AddStaff( Staff _staff)
    {
        staff = _staff;
    }
    @Override
    public boolean executeCommand() throws Exception
    {
        for(Staff curStaff : Datastore.GetStaff())
        {
            if(curStaff.getSTAFFID().hashCode() == staff.getSTAFFID().hashCode())
                throw new Exception("STAFF ID exists");
        }
        return Datastore.AddStaff(staff);
    }
    
    @Override
    public boolean undoCommand()
    {
        return Datastore.RemoveStaff(staff);
    }
}
