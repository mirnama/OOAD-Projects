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


import java.util.ArrayList;

public class Store {
    /*
    * theses are the variables for the store class
    * subject to change *
    -cashReg: float
    -merchandise: Item
    -staffMembers: Velma, Shaggy
    -workingStaff: list
    -totalBankWithdrawl: int
    -dayCount: int
    -customerCont: int

     */


    private float cashReg;
    private int dayCount;
    private int customerCount, totalBankWithdrawl;
    private ArrayList<String> workingStaff; // for now, we have  Velma, Shaggy but that subject to change
    private ArrayList<String> staffMembers;
    ArrayList<Item> merchandise; // arraylist to hold the different items (3 CDs, 3 Shirts, 3 Guitars, etc.)

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

    public ArrayList < String > getWorkingStaff ( ) {
        return workingStaff;
    }

    public void setWorkingStaff (ArrayList < String > workingStaffSet) { // I put set in the end to now which one the new var just a style we could change it
        this.workingStaff = workingStaffSet;
    }

    public ArrayList < String > getStaffMembers ( ) {
        return staffMembers;
    }

    public void setStaffMembers (ArrayList < String > staffMembersSet) { // I put set in the end to now which one the new var just a style we could change it
        this.staffMembers = staffMembersSet;
    }

    public ArrayList < Item > getMerchandise ( ) {
        return merchandise;
    }

    public void setMerchandise (ArrayList < Item > merchandiseSet) { // I put set in the end to now which one the new var just a style we could change it
        this.merchandise = merchandiseSet;
    }
}
