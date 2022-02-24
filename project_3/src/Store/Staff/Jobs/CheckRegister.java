package Store.Staff.Jobs;

import Store.Obersvables.Logger;
import Store.Store;
import Store.Staff.*;

public class CheckRegister implements Job {
    private Logger obs = null;
    public void do_job(Store s, Staff p) {
        notifyObservers("CheckRegister test", s);
        double cash = s.getCashReg();
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
    public void notifyObservers(String info, Store s) {
        obs.update(info, s);
    }
    public void setLogger(Logger o) {
        obs = o;
    }
}

