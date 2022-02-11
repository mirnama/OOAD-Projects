package Store.Staff;

import Store.Staff.Jobs.*;

public class Clerk extends Staff {
    public Clerk(String employeeName, float chance) {
        super(employeeName, chance);

        this.jobList.add(new ArriveAtStore());
        this.jobList.add(new CheckRegister());
        // this.jobList.add(new doInventory());
        // this.jobList.add(new placeAnOrder());
        // this.jobList.add(new OpenTheStore());
        this.jobList.add(new CleanTheStore());
        this.jobList.add(new LeaveTheStore());
    }
}
