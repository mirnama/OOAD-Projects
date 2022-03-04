package Store.Staff.Jobs;
import Item.*;
import Store.*;
import Store.Obersvables.Logger;

public class Order {
    private Item item;
    private int receiveDate;
    //constructor for an order that takes in an itemDecorator and a recieve date
    public Order(Item item, int receiveDate, Store s){
        this.item = item;
        this.receiveDate = s.getDayCount() + receiveDate;
    }
    //returns receive date
    public int getReceiveDate() {
        return receiveDate;
    }
    //lowers receivedate by one
    public Item getItem() {
        return item;
    }
    public void progressDate(){
        receiveDate -= 1;
    }

    public void registerObserver(Logger o) {}
    public void removeObserver(Logger o) {}
    public void notifyObservers(Logger o) {}
}
