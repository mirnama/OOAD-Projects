package Store.Staff.Jobs;

import Store.Staff.Staff;
import Store.Store;
import Item.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.*;



public class OpenTheStore extends Job  {

    public void do_job(Store s, Staff p) {
        System.out.println("Opening the store");
        ArrayList<Item> merch = s.getMerchandise();
        ArrayList<String> subtypes = new ArrayList<String>();
        subtypes.add("Bandanas"); subtypes.add("Bass");

        Random rand = new Random();
        int buyers = rand.nextInt(10 - 4) + 4;
        int sellers = rand.nextInt(4 - 1) + 1;
        System.out.println(merch.get(0).getClass().getName());
//        for (int i=0; i<buyers; i++) {
//            int r = rand.nextInt();
//
//            for (Item item : merch) {
//
//                if (item.getClass()!=null) {
//                    // we have it
//                }
//            }
//
//        }
    }
}
