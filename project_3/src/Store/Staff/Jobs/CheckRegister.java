package Store.Staff.Jobs;

import Store.Obersvables.Logger;
import Store.Obersvables.Tracker;
import Store.Store;
import Store.Staff.*;

public class CheckRegister implements Job {
    private Logger obs = null;
    public CheckRegister(Logger o) {
        registerObserver(o);
    }
    public void do_job(Store s, Staff p) {
        double cash = s.getCashReg();
        notifyObservers("$"+String.format("%.2f", cash)+" in register.");
        System.out.println("Register has $"+cash);
        if (cash<75) {
            GoToBank next = new GoToBank(obs);
            next.do_job(s,p);
        }
    }
    public void registerObserver(Logger o) {
        obs = o;
    }
    public void removeObserver(Logger o) {
        obs = null;
    }
    public void notifyObservers(String info) {
        obs.update(info);
    }
    public void setLogger(Logger o) {
        obs = o;
    }

    public void registerObserverTracker(Tracker t) {}
    public void removeObserverTracker(Tracker t) {}
    public void notifyObserversTracker(Staff p, int sold, int purch, int dmg) {}
    public void setTracker(Tracker t) {}
}
