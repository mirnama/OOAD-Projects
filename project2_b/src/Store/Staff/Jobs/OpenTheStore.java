package Store.Staff.Jobs;

import Store.Staff.Staff;
import Store.Store;
import Item.*;

import java.util.ArrayList;
import java.util.Random;



public class OpenTheStore extends Job  {
    public static Item findSubClass(Store s, int r) {
        ArrayList<Item> merch = s.getMerchandise();

        switch (r) {
            case 0:
                for (int j = 0; j < merch.size(); j++) {
                    if (merch.get(j) instanceof Bandanas) {
                        return merch.get(j);
                    }
                }
                break;
            case 1:
                for (int j = 0; j < merch.size(); j++) {
                    if (merch.get(j) instanceof Bass) {
                        return merch.get(j);
                    }
                }
                break;
            case 2:
                for (int j = 0; j < merch.size(); j++) {
                    if (merch.get(j) instanceof Cable) {
                        return merch.get(j);
                    }
                }
                break;
            case 3:
                for (int j = 0; j < merch.size(); j++) {
                    if (merch.get(j) instanceof Guitar) {
                        return merch.get(j);
                    }
                }
                break;
            case 4:
                for (int j = 0; j < merch.size(); j++) {
                    if (merch.get(j) instanceof Harmonica) {
                        return merch.get(j);
                    }
                }
                break;
            case 5:
                for (int j = 0; j < merch.size(); j++) {
                    if (merch.get(j) instanceof Hat) {
                        return merch.get(j);
                    }
                }
                break;
            case 6:
                for (int j = 0; j < merch.size(); j++) {
                    if (merch.get(j) instanceof Mandolin) {
                        return merch.get(j);
                    }
                }
                break;
            default:
                break;
        }
        return null;
    }

    public void do_job(Store s, Staff p) {
        Random rand = new Random();
        int buyers = rand.nextInt(10 - 4) + 4;
        int sellers = rand.nextInt(4 - 1) + 1;

        for (int i=0; i<buyers; i++) {
            int r = rand.nextInt();

        }
        System.out.println(p.getEmployeeName() + " locks up and goes home");
        s.getWorkingStaff().remove(p);
    }
}