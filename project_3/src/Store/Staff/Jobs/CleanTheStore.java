package Store.Staff.Jobs;

import Store.Staff.Staff;
import Store.Store;
import Item.*;

import java.util.Random;

public class CleanTheStore extends Job  {
    public void do_job(Store s, Staff p) {
        Inventory inventory = s.getInventory();
        Random rand = new Random();
        double breakChance = rand.nextDouble();

        int sizeInv = inventory.getMerchandise().size();
        if (sizeInv>0){
            if (breakChance < p.getDamagePercetage()) {
                System.out.println("inti R ");
                System.out.println("Size  "+inventory.getMerchandise().size());


                int r = rand.nextInt(inventory.getMerchandise().size());
                System.out.println("r is: "+r);
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
}
