package Store.Staff.Jobs;

import Store.Store;
import Store.Staff.*;

public class ArriveAtStore extends Job  {
    public void do_job(Store s, Staff p) {
        s.getWorkingStaff().add(p);
    }
}
