import Store.Store;
import Store.Staff.*;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        Store store = new Store();

        ArrayList<Staff> hired = store.getStaffMembers();
        Staff shaggy =  hired.get(1);
        shaggy.work(store);
    }
}
