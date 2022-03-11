package Store.CommandLine;

import Store.Store;

public class CommandEndInteractions implements Command {
    private String def = "End Interactions.";
    public void execute(Store s, CommandLine c) {}
    public String getDef() {
        return this.def;
    }
}
