package Item.Decorator;
import Item.*;

public class SaleAccessory extends OptionalSaleDecorator{
    public SaleAccessory(Item di) {
        this.decoratedItem = di;
    }
    public void optionalSale() {
        System.out.println("Create accessory chance here");
    }




}
