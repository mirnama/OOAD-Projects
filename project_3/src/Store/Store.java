package Store;

/*
 * This is the store class
 *The store keeps all money for buying merchandise and accepting money from Customers in a Cash Register.
 * The store Should have a starting inventory of merchandise items.
 * Items should be initialized before the simulation starts.
 * There are three of each
 *  1 day of each 7 the store will not open
 * On each day the simulation runs when the store is open, Functionality are:
 * ArriveAtStore:  Announcements should be text output to the console for the day summary
 * CheckRegister: Announce the amount of money found in the register. if amount = 0 then go to bank action
 * GoToBank: if money amount > 75$l; withdraw $1000 from bank; put the money in the store register; Announce
 * PlaceAnOrder:
 * OpenTheStore:
 * CleanTheStore:
 * LeaveTheStore:
 *
 */

import Item.kit.GuitarKitFactory;
import Store.Obersvables.ConcreteLogger;
import Store.Staff.*;
import Store.Obersvables.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import Item.Inventory;

public class Store implements StoreInterface {
    /*
    * theses are the variables for the store class
    * subject to change *
    -cashReg: float
    -merchandise: Store.ItemDecorator
    -staffMembers: Velma, Shaggy
    -workingStaff: list
    -totalBankWithdrawl: int
    -dayCount: int
    -customerCont: int
     */
    private String name;
    private Inventory inventory = new Inventory();
    protected double cashReg;
    private int dayCount;
    private GuitarKitFactory factory = null;
    private int customerCount, totalBankWithdrawl;
    protected ArrayList<Staff> workingStaff = new ArrayList<Staff>(); // Velma or Shaggy
    private ArrayList<Staff> staffMembers = new ArrayList<Staff>(); // Velma, Shaggy


    public Store(String name) {
        this.staffMembers.add(new Clerk("Velma", 5));
        this.staffMembers.add(new Clerk("Shaggy", 20));
        this.staffMembers.add(new Clerk("Daphne", 10));
        this.name = name;
        if (name.equals("Northside")){
            factory = new GuitarKitFactory();
        }
        // merchandise.add(s1);
    }
    public double getCashReg ( ) {
        return cashReg;
    }
    public void setCashReg (double cashRegSet) {
        this.cashReg = cashRegSet;
    }
    public int getDayCount ( ) {
        return dayCount;
    }
    public void setDayCount (int dayCountSet) {
        this.dayCount = dayCountSet;
    }
    public int getCustomerCount ( ) {
        return customerCount;
    }

    public GuitarKitFactory getGuitarKitFactory() {
        return factory;
    }
    public void setCustomerCount (int customerCountSet) { // I put set in the end to now which one the new var just a style we could change it
        this.customerCount = customerCountSet;
    }
    public int getTotalBankWithdrawl ( ) {
        return totalBankWithdrawl;
    }
    public void setTotalBankWithdrawl (int totalBankWithdrawlSet) { // I put set in the end to now which one the new var just a style we could change it
        this.totalBankWithdrawl = totalBankWithdrawlSet;
    }
    public String getName() {return this.name;}

    public ArrayList < Staff > getWorkingStaff ( ) {
        return workingStaff;
    }
    public void setWorkingStaff (ArrayList < Staff > workingStaffSet) { // I put set in the end to now which one the new var just a style we could change it
        this.workingStaff = workingStaffSet;
    }
    public ArrayList<Staff> getStaffMembers ( ) {
        return staffMembers;
    }
    public void setStaffMembers (ArrayList<Staff> staffMembersSet) { // I put set in the end to now which one the new var just a style we could change it
        this.staffMembers = staffMembersSet;
    }
    public Inventory getInventory() {return inventory;}
    public void setStaffsLogger(Logger o) {
        for (Staff s: staffMembers) {
            s.setLogger(o);
        }
    }
    public void run(int days) {
        Tracker tracker = new ConcreteTracker(this);
        for (Staff s : this.staffMembers) {
            s.setTracker(tracker);
        }


        for (int j=0; j<days; j++) {
            Logger dayLogger = new ConcreteLogger(this);
            System.out.println("Day:"+this.dayCount);


            ArrayList<Staff> findStaff = staffMembers;
            Random r = new Random();
            boolean workFlag = false;
            while (workFlag == false) {
                if (findStaff.size()==0) {
                    System.out.println("Everyone is either sick or overworked. Store is closed.");
                    workFlag = true;
                }
                else {
                    int working = r.nextInt(findStaff.size()); // maybe more than one eventually
                    if (findStaff.get(working).getDaysWorkedConsecutivley() >= 2) {
                        Staff overWorked = findStaff.get(working);
                        overWorked.setDaysWorkedConsecutivley(0);
                        findStaff.remove(overWorked);
                    } else {
                        double sickChance = r.nextDouble();
                        if (sickChance < 0.1) {
                            Staff sickStaff = findStaff.get(working);
                            System.out.println(sickStaff.getEmployeeName() + " is sick");
                            sickStaff.setDaysWorkedConsecutivley(0);
                            findStaff.remove(sickStaff);
                        } else {
                            workingStaff.add(findStaff.get(working));
                            workFlag = true;
                        }

                    }
                }
            }


            setStaffsLogger(dayLogger);
            for (int z=0; z<this.workingStaff.size(); z++) {
                this.workingStaff.get(z).work(this);
            }

            dayCount+=1;
        }
        tracker.display();
    }
}
