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

import Store.Obersvables.ConcreteLogger;
import Store.Staff.*;
import Store.Obersvables.Logger;
import java.util.ArrayList;
import java.util.Random;
import Item.Inventory;

public class Store {
    /*
    * theses are the variables for the store class
    * subject to change *
    -cashReg: float
    -merchandise: Store.Item
    -staffMembers: Velma, Shaggy
    -workingStaff: list
    -totalBankWithdrawl: int
    -dayCount: int
    -customerCont: int

     */
    private Inventory inventory = new Inventory();
    protected double cashReg;
    private int dayCount;
    private int customerCount, totalBankWithdrawl;
    protected ArrayList<Staff> workingStaff = new ArrayList<Staff>(); // Velma or Shaggy
    private ArrayList<Staff> staffMembers = new ArrayList<Staff>(); // Velma, Shaggy


    public Store() {
        this.staffMembers.add(new Clerk("Velma", 5));
        this.staffMembers.add(new Clerk("Shaggy", 20));
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
    public void setCustomerCount (int customerCountSet) { // I put set in the end to now which one the new var just a style we could change it
        this.customerCount = customerCountSet;
    }
    public int getTotalBankWithdrawl ( ) {
        return totalBankWithdrawl;
    }
    public void setTotalBankWithdrawl (int totalBankWithdrawlSet) { // I put set in the end to now which one the new var just a style we could change it
        this.totalBankWithdrawl = totalBankWithdrawlSet;
    }

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
        for (Staff s: workingStaff) {
            s.setLogger(o);
        }
    }
    public void run(int days) {
        for (int j=0; j<days; j++) {
            Logger dayLogger = new ConcreteLogger();

            Random r = new Random();
            int working = r.nextInt(1); // maybe more than one eventually
            System.out.println("Day:"+this.dayCount);
            if (this.staffMembers.get(working).getDaysWorkedConsecutivley() >= 2) {
                this.staffMembers.get(working).setDaysWorkedConsecutivley(0);
                if (working==1) {
                    this.workingStaff.add(this.staffMembers.get(0));
                }
                else {
                    this.workingStaff.add(this.staffMembers.get(1));
                }
            }
            else {
                this.workingStaff.add(this.staffMembers.get(working));
            }

            setStaffsLogger(dayLogger);
            for (int z=0; z<this.workingStaff.size(); z++) {
                this.workingStaff.get(z).work(this);
            }

            dayCount+=1;
        }
    }
}
