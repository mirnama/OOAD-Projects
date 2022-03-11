package Item;
import Store.*;
import Store.Staff.Staff;

import java.util.ArrayList;

public class OptionalSalesDecorater implements OptionalSales {
    private double chanceOfSelling;
    private Item i;

    public OptionalSalesDecorater (double chanceOfSelling) {
        Item
                item = null;
        this.chanceOfSelling = chanceOfSelling;
        this.i=item;
    }

    public Item getI (Store s, Staff p ) {
        Inventory inv = s.getInventory();
        String itemDecorator =i.getClass().getName();


        if (itemDecorator.getClass().getName().equals("Stringed")) {
            if (chanceOfSelling < 0.20) {
                System.out.println(p.getEmployeeName() + " sold a " + "Big Gag" + "to Customer " + i);

            } else if (chanceOfSelling < 0.25 && chanceOfSelling > 0.20) {
                System.out.println(p.getEmployeeName() + " sold a " + "Practice Amp" + "to Customer with" + i);

            } else if (chanceOfSelling < 0.3 && chanceOfSelling > 0.40)
                System.out.println(p.getEmployeeName() + " sold a " + "Strings" + " to Customer with" + i);
            else if (chanceOfSelling < 0.40) {
                System.out.println(p.getEmployeeName() + " sold a " + "Practice Amp" + " to Customer with" + i);

            }
        }
        return i;
    }

    public void setI (Store s, Staff p) {

        this.i = i;
    }

    @Override
    public String getItemName ( ) {
        
        return null;
    }

    @Override
    public double getListPrice ( ) {
        return 0;
    }

    @Override
    public ArrayList < String > getClassNames ( ) {
        return null;
    }

    @Override
    public ArrayList < Item > getSoldItems ( ) {

        return null;
    }
}
