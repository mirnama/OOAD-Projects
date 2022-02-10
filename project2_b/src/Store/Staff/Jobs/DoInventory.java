package Store.Staff.Jobs;

import Store.Store;
import Store.Staff.*;

public class DoInventory implements Job {
    public void do_job(Store s, Staff p) {
        System.out.println("Doing inventory...");
        // ArrayList<Item> merchandise = s.getMerchandise();
    }
}
