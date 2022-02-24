package Store.Staff.Jobs;

import Store.Obersvables.Logger;
import Store.Staff.Staff;
import Store.Store;
import Item.*;

import java.util.Random;


public class OpenTheStore implements Job  {
    private Logger obs = null;
    OpenTheStore(Logger o) {
        registerObserver(o);
    }

    public void do_job(Store s, Staff p) {
        System.out.println("Opening the store");
        Inventory inv = s.getInventory();

        Random rand = new Random();
        int buyers = rand.nextInt(10 - 4) + 4;
        int sellers = rand.nextInt(4 - 1) + 1;

        for (int i=0; i<buyers; i++) {
            String randSubtype = inv.getStringSubtype();
            Item item = inv.getItemSubtype(randSubtype);
            if (item != null) {
                double listChance = rand.nextDouble();
                if (listChance < 0.5) {
                    System.out.println(p.getEmployeeName() + " sold a " + randSubtype.substring(5) + " for " + item.getListPrice() + "$ to Customer " + i);
                    s.setCashReg(s.getCashReg() + item.getListPrice());
                    inv.addSold(item);
                    inv.removeMerch(item);
                } else {
                    double discountChance = rand.nextDouble();
                    if (discountChance < 0.25) {
                        double discountPrice = item.getListPrice() * 0.9f;
                        System.out.println(p.getEmployeeName() + " sold a " + randSubtype.substring(5) + " for " + discountPrice + "$ after a 10% discount to Customer " + i);
                        s.setCashReg(s.getCashReg() + discountPrice);
                        inv.addSold(item);
                        inv.removeMerch(item);
                    }
                }
            } else {
                System.out.println("Customer " + i + " wanted to buy a " + randSubtype.substring(5) + " but none were in inventory, so they left");
            }
        }

        for (int i=0; i<sellers; i++) {

            String randSubtype = inv.getStringSubtype();
            Item item = inv.createItem(randSubtype);

            int min = 1+item.getItemCondition();
            int max = 6+item.getItemCondition();
            int askPrice = rand.nextInt(max - min) + min;
            double buyChance = rand.nextDouble();

            if (buyChance < 0.5) {
                System.out.println(p.getEmployeeName()+" bought a "+randSubtype.substring(5)+" for "+askPrice+"$");
                inv.addMerch(item);
            }
            else {
                askPrice *= 1.1;
                buyChance = rand.nextDouble();
                if (buyChance < 0.75) {
                    System.out.println(p.getEmployeeName()+" bought a "+randSubtype.substring(5)+" for "+askPrice+"$ after a 10% increase.");
                    inv.addMerch(item);
                }
                else {
                    System.out.println(p.getEmployeeName()+" bought notihing from customer");
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

