package Store.CommandLine;

import java.util.ArrayList;
import Store.Store;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandLine {
    private ArrayList<Store> stores;
    private Store currentStore;
    private ArrayList<Command> actions;
    public CommandLine (ArrayList<Store> ss) {
        actions = new ArrayList<Command>();
        actions.add(new CommandSelectStore());
        actions.add(new CommandClerkName());
        actions.add(new CommandClerkTime());
        actions.add(new CommandSellItem());
        actions.add(new CommandBuyItem());
        actions.add(new CommandBuyCustomKit());
        actions.add(new CommandEndInteractions());
        stores = ss;
        currentStore = ss.get(0);
    }

    public void display(){
        boolean flag = true;
        while (flag) {
            for (int i=0; i< actions.size(); i++) {
                System.out.println("("+i+") "+actions.get(i).getDef());
            }
            int action = readInput();
            if (action==6) {
                flag=false;
            }
            else {
                actions.get(action).execute(this.currentStore, this);
            }
        }

    }
    public int readInput(){
        // https://www.geeksforgeeks.org/ways-to-read-input-from-console-in-java/#:~:text=1%20Using%20Buffered%20Reader%20Class%20This%20is%20the,command%20line.%20...%204%20Using%20Command%20line%20argument
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int i = Integer.parseInt(br.readLine()); // for Integer Input
            return i;
        } catch(IOException ioe) {
            return -1;
        }

    }
    public void setStore(Store s) {
        this.currentStore = s;
    }
    public ArrayList<Store> getStores() {
        return stores;
    }

}
