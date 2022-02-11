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

import Store.Staff.*;
import Item.*;
import java.util.ArrayList;

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

    protected float cashReg;
    private int dayCount;
    private int customerCount, totalBankWithdrawl;
    protected ArrayList<Staff> workingStaff = new ArrayList<Staff>(); // Velma or Shaggy
    private ArrayList<Staff> staffMembers = new ArrayList<Staff>(); // Velma, Shaggy
    ArrayList<Item> merchandise = new ArrayList<Item>();
    // arraylist to hold the different items (3 CDs, 3 Shirts, 3 Guitars, etc.)

    public Store() {
        this.staffMembers.add(new Clerk("Velma", 5));
        this.staffMembers.add(new Clerk("Shaggy", 20));
        this.merchandise.add(new CD("CD1", 10,8.0f,10f,10f));
        this.merchandise.add(new CD("CD2", 9,6.0f,10f,9f));
        this.merchandise.add(new CD("CD3", 7,3f,7f,6.5f));
        this.merchandise.add(new Vinyl("Vinyl1", 7,3f,7f,6.5f));
        this.merchandise.add(new Vinyl("Vinyl2", 7,3f,7f,6.5f));
        this.merchandise.add(new Vinyl("Vinyl3", 7,3f,7f,6.5f));
        this.merchandise.add(new Hat(3,"Hat1", 10,25f,35f,35f));
        this.merchandise.add(new Hat(5,"Hat2", 7,23f,27f,26.5f));
        this.merchandise.add(new Hat(4,"Hat3", 9,24f,34f,33.5f));
        this.merchandise.add(new Shirt(4,"T-shirt1", 8,130f,170f,6.5f));
        this.merchandise.add(new Shirt(0,"T-shirt2", 7,3f,7f,6.5f));
        this.merchandise.add(new Shirt(41,"T-shirt3", 7,3f,7f,6.5f));
        this.merchandise.add(new Flute("standard","Montreux",10,500f,580f,566.66f));
        this.merchandise.add(new Flute("Piccolo","The smallest",8,450f,550f,543f));
        this.merchandise.add(new Flute("Plastic","The plastic flute ",10,45f,55f,54f));

        // merchandise.add(s1);
    }
    // getters and setters for the class objects and vars
    public float getCashReg ( ) {
        return cashReg;
    }

    public void setCashReg (float cashRegSet) {
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

    public ArrayList <Item> getMerchandise ( ) { // needs to be type Item
        return merchandise;
    }

    public void setMerchandise (ArrayList <Item> merchandiseSet) { // I put set in the end to now which one the new var just a style we could change it
        this.merchandise = merchandiseSet; // needs to be type item
    }
}
