package Store.Staff.Jobs;
import Store.*;
import Item.*;
import Store.Obersvables.*;
import Store.Staff.Staff;
import java.util.ArrayList;

public class PlaceAnOrder implements Job{
    private Logger obs = null;
    private Tracker tr = null;

    public PlaceAnOrder(Logger o) {
        registerObserver(o);
    }
    public void do_job(Store s, Staff p){
        System.out.println("doing Job");
    }
    public void do_job(Store s, Staff p, String subtype) {
        Inventory inv = s.getInventory();

        Job cR = new CheckRegister(obs);
        cR.do_job(s, p);
        ArrayList<Float> ret = inv.addOrder(subtype, s, 3);
        float purchasePrice = ret.get(0);
        float arrivalDate = ret.get(1);

        System.out.println(p.getEmployeeName() + " bought 3 " + subtype + " for: " +  String.format("%.2f", purchasePrice) + " and the order will be here in " + arrivalDate + " days.");
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

