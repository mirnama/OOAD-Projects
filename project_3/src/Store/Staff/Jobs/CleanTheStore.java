package Store.Staff.Jobs;

import Store.Obersvables.Logger;
import Store.Staff.Staff;
import Store.Store;
import Item.*;

import java.util.Random;

public class CleanTheStore implements Job  {
    private Logger obs = null;

    CleanTheStore(Logger o) {
        registerObserver(o);
    }

    public void do_job(Store s, Staff p) {
        Inventory inventory = s.getInventory();
        Random rand = new Random();
        double breakChance = rand.nextDouble();

        int sizeInv = inventory.getMerchandise().size();
        if (sizeInv>0){
            if (breakChance < p.getDamagePercetage()) {
                int r = rand.nextInt(inventory.getMerchandise().size());
                Item item = inventory.getMerchandise().get(r);

                int itemCond = item.getItemCondition();
                if (itemCond==1) {
                    System.out.println("Oops, " + p.getEmployeeName() + " broke a " + item.getItemName());
                    inventory.getMerchandise().remove(item);
                }
                else {
                    item.setItemCondition(itemCond--);
                    System.out.println("Oops, " + p.getEmployeeName() + " hurt a " + item.getItemName());
                    System.out.println(item.getItemName()+" is now condition " + itemCond--);
                }
            }
            else {
                System.out.println("Nothing was broken!!");
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
