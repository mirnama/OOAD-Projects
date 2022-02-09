package Store.Staff;

import Store.Staff.Jobs.Job;

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

    protected ArrayList<Job> specialty_jobs;

    public Staff (String employeeName, Float chance) {
        this.employeeName = employeeName;
        this.daysWorkedConsecutivley = 0;
        this.damagePercetage = chance;
        this.specialty_jobs = new ArrayList();
    }

    public String getEmployeeName ( ) {
        return employeeName;
    }

    public ArrayList<Job> getSpecialtyJobs () {
        return this.specialty_jobs;
    }

    public void setEmployeeName (String employeeNameSet)  { // I put set in the end to now which one the new var just a style we could change it
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

    public void arriveAtStore() {

    }

    public void leaveTheStore() {

    }

    public void openTheStore() {

    }
}
