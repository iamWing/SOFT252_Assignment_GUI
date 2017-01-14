package GUIs;


import java.util.Comparator;
import models.Car;

/**
 *
 * @author Admin
 */
public class CustomComparator implements Comparator<Object>{
    public int compare(Object object1, Object object2) {
        return object1.toString().compareTo(object2.toString());
    }
}