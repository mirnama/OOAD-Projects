package Item;
import Store.*;

import java.util.ArrayList;

public class OptionalSalesDecorater implements OptionalSales {
    private double chanceOfSelling;
    private ItemDecorator i;

    public OptionalSalesDecorater (double chanceOfSelling) {
        ItemDecorator item = null;
        this.chanceOfSelling = chanceOfSelling;
        this.i=item;
    }

    public ItemDecorator getI ( ) {
        return i;
    }

    public void setI (ItemDecorator i) {

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
    public ArrayList < ItemDecorator > getSoldItems ( ) {
        return null;
    }
}
