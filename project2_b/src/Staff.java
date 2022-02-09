
/*
* Staff members Class
* randomly report for work each day the store is open during the simulation
* no-one will work more than three days in a row
*
 */

public class Staff {
    private String employeeName;
    private Float damagePercetage;
    private int daysWorkedConsecutivley;

    public Staff (String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName ( ) {
        return employeeName;
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
}
