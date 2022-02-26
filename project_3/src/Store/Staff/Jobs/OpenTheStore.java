package Store.Staff.Jobs;

import Store.Obersvables.*;
import Store.Staff.Staff;
import Store.Store;
import Item.*;

import java.util.Random;


public class OpenTheStore implements Job  {
    private Logger obs = null;
    private Tracker tr = null;

    public OpenTheStore(Logger o, Tracker t) {
        registerObserver(o);
        registerObserverTracker(t);
    }

    public void do_job(Store s, Staff p) {
        System.out.println("Opening the store");
        Inventory inv = s.getInventory();

        Random rand = new Random();
        int countItemsSold = 0;
        int countItemsBought = 0;
        int buyers = rand.nextInt(10 - 2) + 2;
        int sellers = rand.nextInt(4 - 1) + 1;

        for (int i=0; i<buyers; i++) {
            String randSubtype = inv.getStringSubtype();
            ItemDecorator itemDecorator = inv.getItemSubtype(randSubtype);
            if (itemDecorator != null) {
                double listChance = rand.nextDouble();
                if (listChance < 0.5) {
                    System.out.println(p.getEmployeeName() + " sold a " + randSubtype.substring(14) + " for " + String.format("%.2f", itemDecorator.getListPrice()) + "$ to Customer " + i);
                    s.setCashReg(s.getCashReg() + itemDecorator.getListPrice());
                    inv.addSold(itemDecorator);
                    inv.removeMerch(itemDecorator);
                    countItemsSold += 1;
                } else {
                    double discountChance = rand.nextDouble();
                    if (discountChance < 0.25) {
                        double discountPrice = itemDecorator.getListPrice() * 0.9f;
                        System.out.println(p.getEmployeeName() + " sold a " + randSubtype.substring(14) + " for " + String.format("%.2f", discountPrice) + "$ after a 10% discount to Customer " + i);
                        s.setCashReg(s.getCashReg() + discountPrice);
                        inv.addSold(itemDecorator);
                        inv.removeMerch(itemDecorator);
                        countItemsSold += 1;
                    }
                }
            } else {
                System.out.println("Customer " + i + " wanted to buy a " + randSubtype.substring(14) + " but none were in inventory, so they left");
            }
        }
        notifyObservers(countItemsSold+" items sold.");

        for (int i=0; i<sellers; i++) {
            String randSubtype = inv.getStringSubtype();
            ItemDecorator itemDecorator = inv.createItem(randSubtype);

            int min = 1+ itemDecorator.getItemCondition();
            int max = 6+ itemDecorator.getItemCondition();
            int askPrice = rand.nextInt(max - min) + min;
            double buyChance = rand.nextDouble();

            if (buyChance < 0.5) {
                System.out.println(p.getEmployeeName()+" bought a "+randSubtype.substring(14)+" for "+askPrice+"$");
                inv.addMerch(itemDecorator);
                countItemsBought += 1;
            }
            else {
                askPrice *= 1.1;
                buyChance = rand.nextDouble();
                if (buyChance < 0.75) {
                    System.out.println(p.getEmployeeName()+" bought a "+randSubtype.substring(14)+" for "+askPrice+"$ after a 10% increase.");
                    inv.addMerch(itemDecorator);
                    countItemsBought += 1;
                }
                else {
                    System.out.println(p.getEmployeeName()+" bought notihing from customer");
                }
            }
        }
        notifyObservers(countItemsBought+" items bought.");
        notifyObserversTracker(p, countItemsSold, countItemsBought, 0);
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

    public void registerObserverTracker(Tracker t) {
        this.tr = t;
    }
    public void removeObserverTracker(Tracker t) {tr = null;} // shouldnt have parameter
    public void notifyObserversTracker(Staff p, int sold, int purch, int dmg) {
        tr.update_tracker(p,sold,purch,dmg);
    }
    public void setTracker(Tracker t) {tr = t;}
}