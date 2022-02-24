package Store.Staff.Jobs;

import Store.Staff.*;
import Store.Obersvables.Logger;
import Store.Store;

public interface Job {
    public abstract void do_job(Store s, Staff p);
    public void registerObserver(Logger o);
    public void removeObserver(Logger o);
    public void notifyObservers(String info, Store s);
    public void setLogger(Logger o);
}
