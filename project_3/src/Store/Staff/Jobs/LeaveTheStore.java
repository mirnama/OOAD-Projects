package Store.Staff.Jobs;

import Store.Obersvables.Logger;
import Store.Staff.Staff;
import Store.Store;

import java.util.ArrayList;

public class LeaveTheStore implements Job  {
    private Logger obs = null;
    public LeaveTheStore(Logger o) {
        registerObserver(o);
    }
    public void do_job(Store s, Staff p) {
        notifyObservers(p.getEmployeeName()+" left.");
        System.out.println(p.getEmployeeName() + " locks up and goes home");
        s.getWorkingStaff().remove(p);
        p.setDaysWorkedConsecutivley(p.getDaysWorkedConsecutivley()+1);
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
}