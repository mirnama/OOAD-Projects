package Store.Staff;

import Store.Store;
import Store.Staff.Jobs.*;

import java.util.ArrayList;

public class Staff {
    protected String employeeName;
    protected float damagePercetage;
    protected int daysWorkedConsecutivley;

    protected ArrayList<Job> jobList = new ArrayList();

    public Staff (String employeeName, Float chance) {
        this.employeeName = employeeName;
        this.daysWorkedConsecutivley = 0;
        this.damagePercetage = chance;
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
    public ArrayList<Job> getJobList() {
        return jobList;
    }
    public void work(Store s) {
        for (int i=0; i<jobList.size(); i++) { // could be better priotity algorithm here
            jobList.get(i).do_job(s, this);
        }

    }
}
