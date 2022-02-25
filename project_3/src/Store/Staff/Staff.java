package Store.Staff;

import Store.Store;
import Store.Staff.Jobs.*;
import Store.Obersvables.*;
import java.util.ArrayList;
/*
 * Store.Staff.Store.Staff members Class
 * randomly report for work each day the store is open during the simulation
 * no-one will work more than three days in a row
 *
 */
public class Staff {
    protected String employeeName;
    protected Float damagePercetage;
    protected int daysWorkedConsecutivley;
    protected Logger o;
    protected Tracker t;

    protected ArrayList<Job> jobList = new ArrayList();

    public Staff (String employeeName, Float chance) {
        this.employeeName = employeeName;
        this.daysWorkedConsecutivley = 0;
        this.damagePercetage = chance;
        this.o = null;
        this.t = null;
    }

    public String getEmployeeName ( ) {
        return employeeName;
    }
    public void setEmployeeName (String employeeNameSet) { // I put set in the end to now which one the new var just a style we could change it
        this.employeeName = employeeNameSet;
    }
    public Float getDamagePercetage ( ) {
        return damagePercetage;
    }
    public void setDamagePercetage (Float damagePercetageSet) { // I put set in the end to now which one the new var just a style we could change it
        this.damagePercetage = damagePercetageSet;
    }
    public int getDaysWorkedConsecutivley ( ) {
        return daysWorkedConsecutivley;
    }
    public void setDaysWorkedConsecutivley (int daysWorkedConsecutivleySet) {
        this.daysWorkedConsecutivley = daysWorkedConsecutivleySet;
    }
    public void setLogger(Logger o) {
        this.o = o;
        for (Job j : jobList) {
            j.setLogger(this.o);
        }
    }
    public void setTracker(Tracker t) {
        this.t = t;
        for (Job j : jobList) {
            j.setTracker(this.t);
        }
    }
    public void work(Store s) {
        for (int i=0; i<jobList.size(); i++) { // could be better priotity algorithm here
            jobList.get(i).do_job(s, this);
        }

    }
}
