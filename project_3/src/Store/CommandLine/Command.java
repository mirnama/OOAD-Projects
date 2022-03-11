package Store.CommandLine;
import Store.Store;

public interface Command {
    public void execute(Store s, CommandLine c);
    public String getDef();
}
