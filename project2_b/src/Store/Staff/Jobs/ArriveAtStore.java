package Store.Staff.Jobs;

import Store.Store;
import Store.Staff.*;

public class ArriveAtStore extends Job  {
    public void do_job(Store s, Staff p) {
        s.getWorkingStaff().add(p);
        System.out.println(p.getEmployeeName() + " arrives at the store on day " + s.getDayCount());
        for (int i=0; i<s.getOrders().size(); i++) {
            if (s.getOrders().get(i).getReceiveDate()==s.getDayCount()) {
                System.out.println(s.getOrders().get(i).getItem().getItemName()+" came into store.");
                s.getMerchandise().add(s.getOrders().get(i).getItem());
                s.getOrders().remove(i);
                i--;
            }
        }
    }
}
