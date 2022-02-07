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

    public void setEmployeeName (String employeeNameSet) {
        this.employeeName = employeeNameSet;
    }

    public Float getDamagePercetage ( ) {
        return damagePercetage;
    }

    public void setDamagePercetage (Float damagePercetageSet) {
        this.damagePercetage = damagePercetageSet;
    }

    public int getDaysWorkedConsecutivley ( ) {
        return daysWorkedConsecutivley;
    }

    public void setDaysWorkedConsecutivley (int daysWorkedConsecutivleySet) {
        this.daysWorkedConsecutivley = daysWorkedConsecutivleySet;
    }
}
