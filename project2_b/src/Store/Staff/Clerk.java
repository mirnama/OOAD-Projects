package Store.Staff;

import Store.Staff.Jobs.CheckRegister;

public class Clerk extends Staff {
    public Clerk(String employeeName, float chance) {
        super(employeeName, chance);
        this.specialty_jobs.add(new CheckRegister());
    }
}
