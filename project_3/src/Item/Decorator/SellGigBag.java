package Item.Decorator;
import Item.*;

public class SellGigBag extends OptionalSaleDecorator{
    public SellGigBag(Item di) {
        this.decoratedItem = di;
    }
    public void optionalSale() {
        // create rand
        // check if gig bag
        //
        System.out.println("Try selling gig baghere");
    }




}
