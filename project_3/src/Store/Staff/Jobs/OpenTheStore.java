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
    private int getRandomBuyersPoisson(int mean, int size){
        //creates probabilities for each bin
        double[] distribution = new double[size];
        for (int i = 0; i < distribution.length; i++) {
            distribution[i] = (Math.pow(mean, i+1) * Math.exp(-mean)) / fact(i+1);
        }
        //establishes bins for probability distribution
        double bound = 0;
        double[] distributionBounds = new double[8];
        for (int i = 0; i < distribution.length; i++){
            distributionBounds[i] = bound + distribution[i];
            bound += distribution[i];
        }
        //rolls number between 0 and .96
        double random = Math.random() * .9603209266232816;
        //puts random roll into bin and returns bin index
        for (int i = 0; i < distributionBounds.length; i++){
            if(i == distributionBounds.length - 1) return size;
            else{
                if(random < distributionBounds[i+1] && random > distributionBounds[i+1]) return i + 1;
                else if (random < distributionBounds[i]) return i;
            }
        }
        return 0;
    }
    //returns i!
    private int fact(int i){
        if (i == 1) return 1;
        else return fact(i-1) * i;

    }
    public void do_job(Store s, Staff p) {
        System.out.println("Opening the store");
        Inventory inv = s.getInventory();

        Random rand = new Random();
        int countItemsSold = 0;
        int countItemsBought = 0;
        //generates random number of buyers according to poisson distribution
        int buyers = getRandomBuyersPoisson(4, 8) + 2;
        int sellers = rand.nextInt(4 - 1) + 1;
        //removes hat and shirt from class list if out of stock so customers no longer look for it.

        System.out.println("number of buyers in store " + buyers);
        for (int i=0; i<buyers; i++) {
            String randSubtype = inv.getStringSubtype();
            Item item = inv.getItemSubtype(randSubtype);
            if (item != null) {
                double listChance = rand.nextDouble();
                if (listChance < 0.5) {
                    System.out.println(p.getEmployeeName() + " sold a " + randSubtype + " for " + String.format("%.2f", item.getListPrice()) + "$ to Customer " + i);
                    s.setCashReg(s.getCashReg() + item.getListPrice());
                    inv.addSold(item);
                    inv.removeMerch(item);
                    countItemsSold += 1;
                } else {
                    double discountChance = rand.nextDouble();
                    if (discountChance < 0.25) {
                        double discountPrice = item.getListPrice() * 0.9f;
                        System.out.println(p.getEmployeeName() + " sold a " + randSubtype + " for " + String.format("%.2f", discountPrice) + "$ after a 10% discount to Customer " + i);
                        s.setCashReg(s.getCashReg() + discountPrice);
                        inv.addSold(item);
                        inv.removeMerch(item);
                        countItemsSold += 1;
                    }
                }
            } else {
                System.out.println("Customer " + i + " wanted to buy a " + randSubtype + " but none were in inventory, so they left");
            }
            double chanceOfSelling = rand.nextDouble();

        }
        notifyObservers(countItemsSold+" items sold.");
        for (int i=0; i<sellers; i++) {
            String randSubtype = inv.getStringSubtype();
            Item item = inv.createItem(randSubtype);

            int min = 1+ item.getItemCondition();
            int max = 6+ item.getItemCondition();
            int askPrice = rand.nextInt(max - min) + min;
            double buyChance = rand.nextDouble();

            if (buyChance < 0.5) {
                System.out.println(p.getEmployeeName()+" bought a "+randSubtype+" for "+askPrice+"$");
                inv.addMerch(item);
                countItemsBought += 1;
            }
            else {
                askPrice *= 1.1;
                buyChance = rand.nextDouble();
                if (buyChance < 0.75) {
                    System.out.println(p.getEmployeeName()+" bought a "+randSubtype+" for "+askPrice+"$ after a 10% increase.");
                    inv.addMerch(item);
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