package Store.Staff.Jobs;
import Item.*;
public class Order {
    private Item item;
    private int receiveDate;
    //constructor for an order that takes in an item and a recieve date
    public Order(Item item, int receiveDate){
        this.item = item;
        this.receiveDate = receiveDate;
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
}
