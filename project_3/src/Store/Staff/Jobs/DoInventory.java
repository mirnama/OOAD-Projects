package Store.Staff.Jobs;
import Item.*;
import Item.Inventory;
import Store.Obersvables.*;
import Store.Store;
import Store.Staff.*;
import java.util.ArrayList;

public class DoInventory implements Job {
    private Logger obs = null;
    private Tracker tr = null;

    public DoInventory(Logger o) {
        registerObserver(o);
    }
    public void do_job(Store s, Staff p) {
        Inventory inventory = s.getInventory();
        boolean found = false;
        boolean ordered = false;
        String className = "";
        int countOrders = 0;
        ArrayList<ItemDecorator> merch = inventory.getMerchandise();
        //for loop that tunes all items in the merchandise
        for (int i = 0; i < merch.size(); i++){
            if (inventory.isStringed(merch.get(i)))
                ((Clerk)p).getTune().do_tune((Stringed)(merch.get(i)));
            else if (inventory.isWind(merch.get(i)))
                ((Clerk)p).getTune().do_tune((Wind)(merch.get(i)));
            else if (inventory.isPlayer(merch.get(i)) )
                ((Clerk)p).getTune().do_tune((Player)(merch.get(i)));
        }
        //removes shirt and hat if we no longer have either
        if(!s.getInventory().subtypeExists("Item.Hat")){
            s.getInventory().removeItemSubtype("Item.Hat");
        }
        if(!s.getInventory().subtypeExists("Item.Shirt")){
            s.getInventory().removeItemSubtype("Item.Shirt");
        }

        //}
        for(String subtype : inventory.getSellingClassNames()) {
            found = inventory.subtypeExists(subtype);
            ordered = false;
            //if class name is not found we place an order for an item of that class
            if (!found){
                for (int j = 0; j < inventory.getOrders().size(); j++){
                    className = inventory.getOrders().get(j).getClass().getName();
                    if(className.equals(subtype)){
                        ordered = true;
                    }
                }
                //creates and runs PlaceAnOrder Job
                if(!ordered) {
                    new PlaceAnOrder(obs).do_job(s, p, subtype); // +3 of that type
                    countOrders += 3;
                }
            }
        }
        notifyObservers(inventory.getMerchandise().size()+" items in inventory.");
        notifyObservers("$"+inventory.sumPurchasePrice()+" sum purchase price in inventory.");
        notifyObservers(countOrders+" orders placed.");
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