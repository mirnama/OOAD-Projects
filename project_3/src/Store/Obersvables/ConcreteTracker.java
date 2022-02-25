package Store.Obersvables;

import Store.Store;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import Store.Staff.*;

public class ConcreteTracker implements Tracker {
    ArrayList<ArrayList> tracker = new ArrayList<ArrayList>();
    ArrayList<Staff> tracker_order = new ArrayList<Staff>();
    Store store;
    int dayNum = 0;

    public ConcreteTracker(Store s) {
        store = s;
        for (Staff p : s.getStaffMembers()) {
            ArrayList<Integer> p_vars = new ArrayList<Integer>();

            p_vars.add(0); // sold
            p_vars.add(0); // purchased
            p_vars.add(0); // damaged
            tracker.add(p_vars);
            tracker_order.add(p);
        }
    }

    public void update_tracker(Staff p, int sold, int purch, int dmg) {
        dayNum = store.getDayCount();
        for (int i=0; i<tracker_order.size(); i++) {
            if (tracker_order.get(i)==p) {
                ArrayList<Integer> temp = tracker.get(i);
                temp.set(0, temp.get(0)+sold);
                temp.set(1, temp.get(1)+purch);
                temp.set(2, temp.get(2)+dmg);
            }
        }
    }

    public void display() {
        System.out.println("Days:"+dayNum);
        System.out.println("Name   Sold    Purchased    Damaged");
        for (int i=0; i<tracker_order.size(); i++) {
            System.out.print(String.format("%-7s", tracker_order.get(i).getEmployeeName()));
            System.out.print(String.format("%-8d", tracker.get(i).get(0))); // left-justifying within specified width
            System.out.print(String.format("%-13d", tracker.get(i).get(1)));
            System.out.print(String.format("%-7d", tracker.get(i).get(2))+"\n");
        }
    }
}
