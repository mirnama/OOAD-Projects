package Store.Staff.Jobs;

import Store.Staff.Staff;
import Store.Store;

public class LeaveTheStore extends Job  {
    public void do_job(Store s, Staff p) {
        System.out.println(p.getEmployeeName() + " locks up and goes home");
        s.getWorkingStaff().remove(p);
        p.setDaysWorkedConsecutivley(p.getDaysWorkedConsecutivley()+1);
    }
}