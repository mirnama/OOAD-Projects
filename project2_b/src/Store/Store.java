package Store;


import Store.Staff.Clerk;
import Store.Staff.Staff;
import Item.*;

import java.util.ArrayList;

public class Store {

    protected float cashReg;
    private int dayCount;
    private int customerCount, totalBankWithdrawl;
    protected ArrayList<Staff> workingStaff = new ArrayList<Staff>(); // Velma or Shaggy
    private ArrayList<Staff> staffMembers = new ArrayList<Staff>(); // Velma, Shaggy
    ArrayList<Item> merchandise = new ArrayList<Item>();
    // arraylist to hold the different items (3 CDs, 3 Shirts, 3 Guitars, etc.)

    public Store() {
        this.staffMembers.add(new Clerk("Velma", 0.05f));
        this.staffMembers.add(new Clerk("Shaggy", 0.2f));
        Item s1 = new Shirt(0,"t-shirt", 3, 10.0f, 11.0f, 9.0f);
        merchandise.add(s1);
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
