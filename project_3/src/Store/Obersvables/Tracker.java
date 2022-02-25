package Store.Obersvables;

import Store.Staff.Staff;

public interface Tracker {
    void update_tracker(Staff p, int sold, int purch, int dmg);
    void display();
}
