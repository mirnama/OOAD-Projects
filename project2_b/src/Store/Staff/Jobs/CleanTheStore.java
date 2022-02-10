package Store.Staff.Jobs;

import Store.Staff.Staff;
import Store.Store;
import Item.*;

import java.util.Random;

public class CleanTheStore implements Job  {
    public void do_job(Store s, Staff p) {
        System.out.println("Cleaning");
        for (int i=0; i<s.getMerchandise().size(); i++) {
            Random rand = new Random();
            double breakChance = rand.nextDouble();
            if (breakChance < p.getDamagePercetage()) {
                Item item = s.getMerchandise().get(rand.nextInt(s.getMerchandise().size()));
                int itemCond = item.getItemCondition();
                if (itemCond==0) {
                    System.out.println("Oops, " + p.getEmployeeName() + " broke a " + item.getItemName());
                    s.getMerchandise().remove(item);
                }
                else {
                    item.setItemCondition(itemCond--);
                    System.out.println("Oops, " + p.getEmployeeName() + " hurt a " + item.getItemName());
                    System.out.println("I is now condition " + itemCond--);
                }
            }
            else {
                System.out.println("Nothing was broken!!");
            }
        }
    }
}
