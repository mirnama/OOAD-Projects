package Store.Staff.Jobs;

import Store.Staff.*;
import Store.Obersvables.*;
import Store.Store;

public interface Job {
    public abstract void do_job(Store s, Staff p);
    public void registerObserver(Logger o); // logger
    public void removeObserver(Logger o); // logger
    public void notifyObservers(String info); // logger
    public void setLogger(Logger o); // logger

    public void registerObserverTracker(Tracker t);
    public void removeObserverTracker(Tracker t);
    public void notifyObserversTracker(Staff p, int sold, int purch, int dmg);
    public void setTracker(Tracker t);
}
