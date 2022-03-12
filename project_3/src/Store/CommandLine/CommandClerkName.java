package Store.CommandLine;
import Store.Store;
import Store.Staff.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CommandClerkName implements Command {
    private String def = "Ask the clerk their name.";
    public void execute(Store s, CommandLine c) {
        for (Staff st : s.getWorkingStaff()) {
            System.out.println(st.getEmployeeName());
        }
    }
    public String getDef() {
        return this.def;
    }
}
