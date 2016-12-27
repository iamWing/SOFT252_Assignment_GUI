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
public class RemoveStaff implements ICommandBehavior{
    private Staff staff;
    
    public RemoveStaff(String _STAFFID, String _fName, String _lName, String _address, String _licenseNumber, String _licenseType)
    {
        staff = new Staff(_STAFFID, _fName, _lName, _address, _licenseNumber, _licenseType);        
    }
    public RemoveStaff( Staff _staff)
    {
        staff = _staff;
    }
    
    @Override
    public boolean executeCommand()
    {
        return Datastore.RemoveStaff(staff);
    }
    @Override
    public boolean undoCommand() throws Exception
    {
        for( Staff curStaff : Datastore.GetStaff())
        {
            if(curStaff.getSTAFFID().hashCode() == staff.getSTAFFID().hashCode())
                throw new Exception ("Staff ID exists");
        }
        return Datastore.AddStaff(staff);
    }
}
