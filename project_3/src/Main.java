import Store.CommandLine.CommandLine;
import Store.Staff.*;
import Store.*;

import java.io.IOException;
import java.util.ArrayList;
import Store.CommandLine.*;

public class Main {
    public static void main (String[] args) throws IOException {
        ArrayList<Store> stores = new ArrayList<Store>();
        stores.add( new Store("Northside") );
        stores.add( new Store("Southside") );

        for (Store store : stores) {
            store.run(1);
        }
        CommandLine CL = new CommandLine(stores);
        CL.display();
    }
}
