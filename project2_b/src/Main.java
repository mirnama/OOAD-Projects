import Store.Staff.Staff;
import Store.Store;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        Store store = new Store();

        ArrayList<Staff> hired = store.getStaffMembers();
        System.out.println(hired.get(1).getEmployeeName());
        Staff shaggy =  hired.get(1);
        shaggy.work(store);
    }
}
