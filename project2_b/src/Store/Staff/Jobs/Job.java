package Store.Staff.Jobs;

import Store.Store;
import Store.Staff.*;

public interface Job {
    public void do_job(Store s, Staff p);
}