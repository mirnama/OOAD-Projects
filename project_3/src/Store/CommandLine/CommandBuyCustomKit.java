package Store.CommandLine;

import Item.GuitarKit;
import Store.Staff.Staff;
import Store.Store;

import java.util.Scanner;

public class CommandBuyCustomKit implements Command {
    private String def = "Buy a Custom Guitar Kit.";
    public void execute(Store s, CommandLine c) {
        // implement
        if(s.getGuitarKitFactory() != null) {
            System.out.println("All kit components have 3 tiers:\n 1.Basic\n 2. Standard \n 3. Legendary  \n Please select a pickup (1-3):");
            Scanner scanner = new Scanner(System.in);
            int pickupType = scanner.nextInt();
            System.out.println("Please select a pick guard (1-3):");
            int pickGuardType = scanner.nextInt();
            System.out.println("Please select a knob set (1-3):");
            int knobSetType = scanner.nextInt();
            System.out.println("Please select a Cover (1-3):");
            int coverType = scanner.nextInt();
            System.out.println("Please select a Bridge type (1-3):");
            int bridgeType = scanner.nextInt();
            GuitarKit kit = (GuitarKit) s.getGuitarKitFactory().getGuitarKit(pickupType, pickGuardType, knobSetType, coverType, bridgeType);
            System.out.println("you just bought a guitar kit for: $" + kit.getSalePrice());
            //need to add this sale to logs
        }
        else
            System.out.println("This store does not sell Guitar Kits");
    }
    public String getDef() {
        return this.def;
    }
}
