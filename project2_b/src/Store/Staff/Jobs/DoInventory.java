package Store.Staff.Jobs;

import Store.Store;
import Store.Staff.*;

public class DoInventory extends Job {
    public void do_job(Store s, Staff p) {
        System.out.println("Doing inventory...");
        boolean found = false;
        boolean ordered = false;
        String className = "";
        String classNames[] = {"Item.Bandanas",  "Item.Cable", "Item.Flute", "Item.Guitar", "Item.Harmonica", "Item.Hat", "Item.Mandolin", "Item.PracticeAmps", "Item.Shirt", "Item.Strings", "Item.CD", "Item.MP3Players", "Item.CdPlayers", "Item.Vinyl", "Item.Bass", "Item.RecordPlayer"};
        //nested for loop that checks if merchandise array has all types of merchandise
        for(int i = 0; i < 16; i++) {
            found = false;
            ordered = false;
            for (int j = 0; j < s.getMerchandise().size(); j++) {
                className = s.getMerchandise().get(j).getClass().getName();
                //checks if class name is equal to class name of item in arrayList
                if (className.equals(classNames[i])) {
                    found = true;
                }
            }
            //if class name is not found we place an order for an item of that class
            if (!found){
                for (int j = 0; j < s.getOrders().size(); j++){
                    className = s.getMerchandise().get(j).getClass().getName();
                    if(className.equals(classNames[i])){
                        ordered = true;
                    }
                }
                //creates and runs PlaceAnOrder Job
                if(!ordered) {
                    new PlaceAnOrder().do_job(s, p, i);
                }
            }
        }
    }
}
