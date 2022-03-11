package Store.CommandLine;
import Item.Item;
import Store.Store;
import Item.Inventory;
import java.util.Random;
import Store.Staff.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CommandBuyItem implements Command {
    private String def = "Buy an item.";
    public void execute(Store s, CommandLine c) {
        Inventory inv = s.getInventory();
        System.out.println("Types of items: ");
        for (String t : inv.getClassNames()) {
            System.out.print(t.substring(5)+" ");
        }
        System.out.println("");
        System.out.println("Choose an item type.");
        String type = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            type = "Item."+br.readLine();
            type.replace("/[\r\n]+/gm", "");
        } catch(IOException ioe) {System.out.println("ERROR: STRING ITEM");}
        Item item = inv.getItemSubtype(type);

        if (item != null) {
            System.out.println("Buy "+item.getItemName()+" for "+item.getListPrice()+"$ (y/n)?");
            String choice = "";
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                choice = br.readLine();
                choice.replace("/[\r\n]+/gm", "");
            } catch(IOException ioe) {System.out.println("ERROR: STRING ITEM");}

            if (choice.equals("y") || choice.equals("Y")) {
                System.out.println("You buy the " + item.getItemName());
                s.setCashReg(s.getCashReg() + item.getListPrice());
                inv.addSold(item);
                inv.removeMerch(item);
            }
            else {
                Random rand = new Random();
                double discountChance = rand.nextDouble();
                if (discountChance < 0.25) {
                    double discountPrice = item.getListPrice() * 0.9f;
                    System.out.println("The clerk offers you a %10 discount on the " + item.getItemName() + " for " + String.format("%.2f", discountPrice) + "$.");
                    choice = "";
                    try {
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        choice = br.readLine();
                        choice.replace("/[\r\n]+/gm", "");
                    } catch (IOException ioe) {
                        System.out.println("ERROR: STRING ITEM");
                    }

                    if (choice.equals("y") || choice.equals("Y")) {
                        System.out.println("You buy the " + item.getItemName());
                        s.setCashReg(s.getCashReg() + discountPrice);
                        inv.addSold(item);
                        inv.removeMerch(item);
                    }
                    else {
                        System.out.println("You did not buy the "+item.getItemName()+".");
                    }
                }
                else {
                    System.out.println("You did not buy the "+item.getItemName()+".");
                }
            }
        }
        else {
            System.out.println("Not in stock.");
        }

    }
    public String getDef() {
        return this.def;
    }
}
