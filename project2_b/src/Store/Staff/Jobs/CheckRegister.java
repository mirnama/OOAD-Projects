package Store.Staff.Jobs;

import Store.Store;

public class CheckRegister implements Job {
    public void do_job(Store s) {
        System.out.println(s.getCashReg());
        // if statement here to go to the bank
    }
}
