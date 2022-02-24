package Store;

import Item.Inventory;
import Store.Staff.Staff;

import java.util.ArrayList;

public interface StoreInterface {
    public double getCashReg ( );

    public void setCashReg (double cashRegSet);

    public int getDayCount ( );

    public void setDayCount (int dayCountSet);

    public int getCustomerCount ( );

    public void setCustomerCount (int customerCountSet);

    public int getTotalBankWithdrawl ( );

    public void setTotalBankWithdrawl (int totalBankWithdrawlSet);

    public ArrayList < Staff > getWorkingStaff ( );

    public void setWorkingStaff (ArrayList < Staff > workingStaffSet);

    public ArrayList < Staff > getStaffMembers ( );

    public void setStaffMembers (ArrayList < Staff > staffMembersSet);

    public Inventory getInventory ( );

}
