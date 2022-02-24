package Store.Staff.Jobs;
import Item.*;
import Store.*;
import Store.Obersvables.Logger;

public class Order {
    private ItemDecorator itemDecorator;
    private int receiveDate;
    //constructor for an order that takes in an itemDecorator and a recieve date
    public Order(ItemDecorator itemDecorator, int receiveDate, Store s){
        this.itemDecorator = itemDecorator;
        this.receiveDate = s.getDayCount() + receiveDate;
    }
    //returns receive date
    public int getReceiveDate() {
        return receiveDate;
    }
    //lowers receivedate by one
    public ItemDecorator getItem() {
        return itemDecorator;
    }
    public void progressDate(){
        receiveDate -= 1;
    }

    public void registerObserver(Logger o) {}
    public void removeObserver(Logger o) {}
    public void notifyObservers(Logger o) {}
}
