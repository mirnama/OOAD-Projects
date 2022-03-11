package Store.CommandLine;
import Store.Store;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CommandSelectStore implements Command {
    private String def = "Select a store to buy from.";
    public void execute(Store s, CommandLine c) {
        System.out.println("Name the store (Northside/Southside) ");

        String store = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            store = br.readLine();
            store.replace("/[\r\n]+/gm", "");
        } catch(IOException ioe) {

        }

        boolean flag = false;
        for (int i=0; i<c.getStores().size(); i++) {
            // System.out.println(c.getStores().get(i).getName());
            if (c.getStores().get(i).getName().equals(store)) {
                c.setStore(c.getStores().get(i));
                System.out.println("Your current store is now "+store);
                flag = true;
            }
        }
        if (flag==false) {System.out.println("Store not found.");}

    }
    public String getDef() {
        return this.def;
    }
}
