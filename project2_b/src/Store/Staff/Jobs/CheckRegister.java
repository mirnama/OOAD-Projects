package Store.Staff.Jobs;

import Store.Store;
import Store.Staff.*;

public class CheckRegister extends Job {
    public void do_job(Store s, Staff p) {
        float cash = s.getCashReg();
        System.out.println("Register has $"+cash);
        if (cash<75) {
            GoToBank next = new GoToBank();
            next.do_job(s,p);
        }
    }
}
