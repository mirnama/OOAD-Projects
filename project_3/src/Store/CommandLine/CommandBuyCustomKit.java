package Store.CommandLine;

import Store.Staff.Staff;
import Store.Store;

public class CommandBuyCustomKit implements Command {
    private String def = "Buy a Custom Guitar Kit.";
    public void execute(Store s, CommandLine c) {
        // implement
        System.out.println("Need to implement");
    }
    public String getDef() {
        return this.def;
    }
}
