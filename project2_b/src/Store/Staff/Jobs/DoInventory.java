package Store.Staff.Jobs;

import Store.Store;
import Store.Staff.*;

public class DoInventory extends Job {
    public void do_job(Store s, Staff p) {
        System.out.println("Doing inventory...");
        boolean found = false;
        String className = "";
        String classNames[] = {"Bandanas",  "Cable", "Flute", "Guitar", "Harmonica", "Hat", "Mandolin", "PracticeAmps", "Shirt", "Strings", "CD", "MP3Players", "CdPlayers", "Vinyl", "Bass", "RecordPlayer"};
        //nested for loop that checks if merchandise array has all types of merchandise
        for(int i = 0; i < 16; i++) {
            found = false;
            for (int j = 0; j < s.getMerchandise().size(); j++) {
                className = s.getMerchandise().get(j).getClass().getName();
                //checks if class name is equal to class name of item in arrayList
                if (className.equals(classNames[i])) {
                    found = true;
                }
            }
            //if class name is not found we place an order for an item of that class
            if (!found){
                //creates and runs PlaceAnOrder Job
                new PlaceAnOrder().do_job(s, p, i);
            }
        }
    }
}
