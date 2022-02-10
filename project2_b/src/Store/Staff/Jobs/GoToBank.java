package Store.Staff.Jobs;

import Store.Store;
import Store.Staff.*;

public class GoToBank implements Job {
    public void do_job(Store s, Staff p) {
        System.out.println("Withdrawing $1000 from bank...");
        s.setCashReg(s.getCashReg() + 1000);
        System.out.println("Register now has $"+s.getCashReg());
    }
}
