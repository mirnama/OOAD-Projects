package Item;

import java.util.ArrayList;

public interface OptionalSales {
    public String getItemName ( );
    public double getListPrice ( );
    public ArrayList <String> getClassNames();
    public ArrayList < ItemDecorator > getSoldItems();


}
