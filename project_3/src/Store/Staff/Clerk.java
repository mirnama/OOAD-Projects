package Store.Staff;

import Store.Staff.Jobs.*;

public class Clerk extends Staff {
    public Clerk(String employeeName, float chance) {
        super(employeeName, chance);

        this.jobList.add(new ArriveAtStore(this.o));
        // this.jobList.add(new CheckRegister());
        //this.jobList.add(new DoInventory());
        //this.jobList.add(new OpenTheStore());
        //this.jobList.add(new CleanTheStore());
        this.jobList.add(new LeaveTheStore(this.o));
    }
}
