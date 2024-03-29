package Store.Staff.Jobs;

import Store.Obersvables.Logger;
import Store.Obersvables.Tracker;
import Store.Store;
import Store.Staff.*;

import java.util.ArrayList;

public class GoToBank implements Job {
    private Logger obs = null;
    private Tracker tr = null;

    public GoToBank(Logger o) {
        registerObserver(o);
    }
    public void do_job(Store s, Staff p) {
        System.out.println("Withdrawing $1000 from bank...");
        s.setCashReg(s.getCashReg() + 1000);
        System.out.println("Register now has $"+String.format("%.2f", s.getCashReg()));
        notifyObservers("$"+String.format("%.2f", s.getCashReg())+" in register.");
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

    public void registerObserverTracker(Tracker t) {tr = t;}
    public void removeObserverTracker(Tracker t) {tr = null;} // shouldnt have parameter
    public void notifyObserversTracker(Staff p, int sold, int purch, int dmg) {
        tr.update_tracker(p,sold,purch,dmg);
    }
    public void setTracker(Tracker t) {tr = t;}
}
