package Store.Staff.Jobs;

import Store.Staff.Staff;
import Store.Store;
import Item.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.*;



public class OpenTheStore extends Job  {
    public String buyItem(Store s, int itemCond, float askPrice) {
        Random rand = new Random();
        ArrayList<Item> merch = s.getMerchandise();
        String type = "null";
        int r = rand.nextInt(8);
        switch (r) {
            case 0:
                merch.add(new Bandanas("Bandana (Bought)", (int)askPrice, askPrice, askPrice, askPrice));
                type = "Item.Bandanas";
                break;
            case 1:
                boolean elec = rand.nextBoolean();
                merch.add(new Bass(elec, "Bass (Bought)", itemCond, askPrice, askPrice, askPrice));
                type = "Item.Bass";
                break;
            case 2:
                int len = rand.nextInt(10);
                merch.add(new Cable(len,"Cable (Bought)", (int)itemCond, askPrice, askPrice, askPrice));
                type = "Item.Cable";
                break;
            case 3:
                merch.add(new CD("CD (Bought)", (int)itemCond, askPrice, askPrice, askPrice));
                type = "Item.CD";
                break;
            case 4:
                merch.add(new CdPlayers("CdPlayer (Bought)", (int)itemCond, askPrice, askPrice, askPrice));
                type = "Item.CdPlayer";
                break;
            case 5:
                merch.add(new Flute("metal","Flute (Bought)", (int)itemCond, askPrice, askPrice, askPrice));
                type = "Item.Flute";
                break;
            case 6:
                boolean elecG = rand.nextBoolean();
                merch.add(new Guitar(elecG, "Guitar (Bought)", (int)itemCond, askPrice, askPrice, askPrice));
                type = "Item.Guitar";
                break;
            case 7:
                merch.add(new Harmonica("G","Harmonica (Bought)", (int)itemCond, askPrice, askPrice, askPrice));
                type = "Item.Harmonica";
                break;
            case 8:
                int hatRand = rand.nextInt(5);
                merch.add(new Hat(hatRand,"Hat (Bought)", (int)itemCond, askPrice, askPrice, askPrice));
                type = "Item.Hat";
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            default:
                break;
        }
        s.setCashReg(s.getCashReg()+askPrice);
        return type;
    }

    public void do_job(Store s, Staff p) {
        System.out.println("Opening the store");
        ArrayList<Item> merch = s.getMerchandise();
        ArrayList<String> subtypes = new ArrayList<String>() {{
            add("Item.Bandanas"); add("Item.Bass"); add("Item.Cable");
            add("Item.CD"); add("Item.CdPlayers"); add("Item.Flute");
            add("Item.Guitar"); add("Item.Harmonica"); add("Item.Hat");
            add("Item.Mandolin"); add("Item.MP3Players"); add("Item.PracticeAmps");
            add("Item.RecordPlayer"); add("Item.Shirt"); add("Item.Vinyl");
        } };

        Random rand = new Random();
        int buyers = rand.nextInt(10 - 4) + 4;
        int sellers = rand.nextInt(4 - 1) + 1;

        for (int i=0; i<buyers; i++) {
            String randSubtype = subtypes.get(rand.nextInt(14));

            boolean stockFlag = false;
            for (int j=0; j<s.getMerchandise().size(); j++) {
                Item item = s.getMerchandise().get(j);
                if (item.getClass().getName()==randSubtype && stockFlag==false) { // finds first item
                    stockFlag = true;
                    double listChance = rand.nextDouble();
                    if (listChance < 0.5) {
                        System.out.println(p.getEmployeeName()+ " sold a "+randSubtype.substring(5)+" for "+item.getListPrice()+"$ to Customer "+i);
                        s.setCashReg(s.getCashReg()+item.getListPrice());
                        s.getSoldItems().add(item);
                        s.removeMerch(item);
                    }
                    else {
                        double discountChance = rand.nextDouble();
                        if (discountChance < 0.25) {
                            float discountPrice = item.getListPrice()*0.9f;
                            System.out.println(p.getEmployeeName()+" sold a "+randSubtype.substring(5)+" for "+discountPrice+"$ after a 10% discount to Customer "+i);
                            s.setCashReg(s.getCashReg()+discountPrice);
                            s.getSoldItems().add(item);
                            s.removeMerch(item);
                        }
                    }
                }
            }

            if (stockFlag==false) {
                System.out.println("Customer "+i+" wanted to buy a "+randSubtype.substring(5)+" but none were in inventory, so they left");
            }
        }

        for (int i=0; i<sellers; i++) {
            int itemCond = rand.nextInt(5);

            int min = 1+itemCond;
            int max = 6+itemCond;
            float askPrice = rand.nextInt(max - min) + min;

            double buyChance = rand.nextDouble();
            if (buyChance < 0.5) {
                String type = buyItem(s, itemCond, askPrice);
                System.out.println(p.getEmployeeName()+" bought a "+type.substring(5)+" for "+askPrice+"$");
            }
            else {

                askPrice *= 1.1;
                buyChance = rand.nextDouble();
                if (buyChance < 0.75) {
                    String type = buyItem(s, itemCond, askPrice);
                    System.out.println(p.getEmployeeName()+" bought a "+type.substring(5)+" for "+askPrice+"$ after a 10% increase.");
                }
                else {
                    System.out.println(p.getEmployeeName()+" bought notihing from customer");
                }
            }
        }
    }
}
