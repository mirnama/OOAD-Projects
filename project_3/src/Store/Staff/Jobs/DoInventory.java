package Store.Staff.Jobs;
import Item.*;
import Item.Inventory;
import Store.Obersvables.Logger;
import Store.Store;
import Store.Staff.*;

public class DoInventory implements Job {
    private Logger obs = null;

    DoInventory(Logger o) {
        registerObserver(o);
    }
    public void do_job(Store s, Staff p) {
        Inventory inventory = s.getInventory();
        boolean found = false;
        boolean ordered = false;
        String className = "";
        //for loop that tunes all items in the merchandise
        for (int i = 0; i < merch.size(); i++){
            if (inventory.isStringed(merch.get(i)))
                ((Clerk)p).getTune().do_tune((Stringed)(merch.get(i)));
            else if (inventory.isWind(merch.get(i)))
                ((Clerk)p).getTune().do_tune((Wind)(merch.get(i)));
            else if (inventory.isPlayer(merch.get(i)) )
                ((Clerk)p).getTune().do_tune((Player)(merch.get(i)));
        }
        for(String subtype : inventory.getClassNames()) {
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
                    new PlaceAnOrder(obs).do_job(s, p, subtype);
                }
            }
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