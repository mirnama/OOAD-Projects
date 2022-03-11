package Store.CommandLine;
import Item.Item;
import Store.Store;
import Item.Inventory;
import java.util.Random;
import Store.Staff.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CommandSellItem implements Command {
    private String def = "Sell an item.";
    public void execute(Store s, CommandLine c) {
        Random rand = new Random();
        Inventory inv = s.getInventory();
        String randSubtype = inv.getStringSubtype();
        Item item = inv.createItem(randSubtype);

        int min = 1+ item.getItemCondition();
        int max = 6+ item.getItemCondition();
        int askPrice = rand.nextInt(max - min) + min;
        double buyChance = rand.nextDouble();

        System.out.println("The clerk offers $"+askPrice+" for your "+randSubtype.substring(5)+". Do you accept (y/n)? ");
        String choice = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = br.readLine();
            choice.replace("/[\r\n]+/gm", "");
        } catch(IOException ioe) {}

        if (choice.equals("y") || choice.equals("Y")) {
            System.out.println("You successfully sold your "+randSubtype.substring(5));
            inv.addMerch(item);
        }
        else {
            askPrice *= 1.1;
            System.out.println("The clerk offers $"+askPrice+" for your "+randSubtype.substring(5)+". Do you accept (y/n)? ");
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                choice = br.readLine();
                choice.replace("/[\r\n]+/gm", "");
            } catch(IOException ioe) {}

            if (choice.equals("y") || choice.equals("Y")) {
                System.out.println("You successfully sold your "+randSubtype.substring(5));
                inv.addMerch(item);
            }
            else {
                System.out.println("You did not sell your "+randSubtype.substring(5));
            }
        }
    }
    public String getDef() {
        return this.def;
    }
}
