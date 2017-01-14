package GUIs;


import java.util.Comparator;
import models.Car;

/**
 * Custom comparator for sorting objects in lists.
 *
 * @author Admin
 */
public class CustomComparator implements Comparator<Object>{
    /**
     * Compares objects and returns correct order.
     * 
     * @param object1 First object.
     * @param object2 Second object.
     * @return comparison
     */
    public int compare(Object object1, Object object2) {
        return object1.toString().compareTo(object2.toString());
    }
}