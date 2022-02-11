package Store.Staff.Jobs;

import Store.Staff.*;
import Store.Store;

public abstract class Job {
    public abstract void do_job(Store s, Staff p);
}