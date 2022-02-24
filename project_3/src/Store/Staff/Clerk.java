package Store.Staff;

import Store.Staff.Jobs.*;
import Store.Staff.Tune.*;

public class Clerk extends Staff {
    private Tune tune;
    public Clerk(String employeeName, float chance) {
        super(employeeName, chance);

        double tuneType =Math.random();
        if(tuneType < 1/3){
            tune = new HaphazardTune();
        }
        else if (tuneType >= 1/3 && tuneType < 2/3){
            tune = new ManualTune();
        }
        else {
            tune = new ElectronicTune();
        }
        this.jobList.add(new ArriveAtStore(this.o));
        // this.jobList.add(new CheckRegister());
        //this.jobList.add(new DoInventory());
        //this.jobList.add(new OpenTheStore());
        //this.jobList.add(new CleanTheStore());
        this.jobList.add(new LeaveTheStore(this.o));
    }

    public Tune getTune() {
        return tune;
    }
}
