package Store.CommandLine;
import Store.Store;
import Store.Staff.*;

import java.time.LocalDateTime;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.time.LocalTime;

public class CommandClerkTime implements Command {
    private String def = "Ask the clerk the time.";
    public void execute(Store s, CommandLine c) {
        LocalTime time = LocalTime.now(); // Create a date object
        System.out.println(time); // Display the current date
    }
    public String getDef() {
        return this.def;
    }
}
