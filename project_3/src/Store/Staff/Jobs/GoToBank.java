package Store.Staff.Jobs;

import Store.Obersvables.Logger;
import Store.Store;
import Store.Staff.*;

import java.util.ArrayList;

public class GoToBank implements Job {
    private Logger obs = null;
    GoToBank(Logger o) {
        registerObserver(o);
    }
    public void do_job(Store s, Staff p) {
        notifyObservers("GotoBank test", s);
        System.out.println("Withdrawing $1000 from bank...");
        s.setCashReg(s.getCashReg() + 1000);
        System.out.println("Register now has $"+s.getCashReg());
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
