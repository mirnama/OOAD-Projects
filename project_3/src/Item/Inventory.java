package Item;

import Store.Staff.Jobs.Order;
import Item.*;
import java.util.Random;

import java.util.ArrayList;

public class Inventory { // singleton
    private ArrayList<Item> merchandise = new ArrayList<Item>();
    private ArrayList<Item> soldItems = new ArrayList<Item>();
    private ArrayList<Order> orders = new ArrayList<Order>();
    private ArrayList<String> classNames = new ArrayList<String>();


    public Inventory() {
        this.merchandise.add(new CD("CD1", 5,8.0f,10f,10f));
        this.merchandise.add(new CD("CD2", 4,6.0f,10f,9f));
        this.merchandise.add(new CD("CD3", 3,3f,7f,6.5f));
        this.merchandise.add(new Vinyl("Vinyl1", 5,3f,7f,6.5f));
        this.merchandise.add(new Vinyl("Vinyl2", 5,3f,7f,6.5f));
        this.merchandise.add(new Vinyl("Vinyl3", 2,3f,7f,6.5f));
        this.merchandise.add(new Hat(3,"Hat1", 1,25f,35f,35f));
        this.merchandise.add(new Hat(5,"Hat2", 3,23f,27f,26.5f));
        this.merchandise.add(new Hat(4,"Hat3", 3,24f,34f,33.5f));
        this.merchandise.add(new Shirt(4,"T-shirt1", 4,130f,170f,6.5f));
        this.merchandise.add(new Shirt(0,"T-shirt2", 4,3f,7f,6.5f));
        this.merchandise.add(new Shirt(41,"T-shirt3", 4,3f,7f,6.5f));
        this.merchandise.add(new Flute("standard","Montreux",5,500f,580f,566.66f));
        this.merchandise.add(new Flute("Piccolo","The smallest",1,450f,550f,543f));
        this.merchandise.add(new Flute("Plastic","The plastic flute ",5,45f,55f,54f));

        this.classNames.add("Item.Bandanas");
        this.classNames.add("Item.Cable");
        this.classNames.add("Item.Flute");
        this.classNames.add("Item.Guitar");
        this.classNames.add("Item.Harmonica");
        this.classNames.add("Item.Hat");
        this.classNames.add("Item.Mandolin");
        this.classNames.add("Item.PracticeAmps");
        this.classNames.add("Item.Shirt");
        this.classNames.add("Item.Strings");
        this.classNames.add("Item.CD");
        this.classNames.add("Item.MP3Players");
        this.classNames.add("Item.CdPlayers");
        this.classNames.add("Item.Vinyl");
        this.classNames.add("Item.Bass");
        this.classNames.add("Item.RecordPlayer");
    }
    public ArrayList <Item> getSoldItems() {return soldItems;}
    public ArrayList <Item> getMerchandise ( ) { // needs to be type Item
        return merchandise;
    }
    public ArrayList<Order> getOrders() {
        return orders;//returns order arraylist
    }
    public void removeMerch(Item item) {
        this.merchandise.remove(item);
    }
    public void setMerchandise (ArrayList <Item> merchandiseSet) { // I put set in the end to now which one the new var just a style we could change it
        this.merchandise = merchandiseSet; // needs to be type item
    }
    public boolean isStringed(Item item){
        String itemType = item.getClass().getName();
        return(itemType.equals("Item.Bass") || itemType.equals("Item.Guitar") || itemType.equals("Item.Mandolin"));
    }
    public boolean isWind(Item item){
        String itemType = item.getClass().getName();
        return (itemType.equals("Item.Flute") || itemType.equals("Item.Harmonica") || itemType.equals("Item.Saxophone"));
    }
    public boolean  isPlayer(Item item){
        String itemType = item.getClass().getName();
        return (itemType.equals("Item.CassettePlayer") || itemType.equals("Item.CdPlayers") || itemType.equals("Item.MP3Players") || itemType.equals("Item.RecordPlayer"));
    }
    public Item getItemSubtype(String className) {
        for (int j = 0; j < this.merchandise.size(); j++) {
            className = this.merchandise.get(j).getClass().getName();
            if (className.equals(className)) {
                return this.merchandise.get(j);
            }
        }
        return null;
    }
    public ArrayList<String> getClassNames() {
        return classNames;
    }
    public void addMerch(Item i) {
        this.merchandise.add(i);
    }
    public void addOrder(Order o) {
        this.orders.add(o);
    }
    public void addSold(Item i) {
        this.soldItems.add(i);
    }
    public Item createItem(String subtype) {
        Random rand = new Random();
        int itemCond = rand.nextInt(5);
        Item item;
        double purchasePrice = (double) (Math.random() * 200) + 1.00f;
        switch (subtype){ // would have to implement randomness here, we should be doing it in the constructor call of items
            case "Item.Bandanas":
                item = new Bandanas("Random Bandana", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "Item.Cable":
                item = new Cable(2, "Random cable",itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "Item.Flute":
                item = new Flute("standard", "Random flute",itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "Item.Guitar":
                item = new Guitar(true, "Random electric guitar",itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "Item.Harmonica":
                item = new Harmonica("G", "Random Harmonica", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "Item.Hat":
                item = new Hat(1, "Random Hat", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "Item.Mandolin":
                item = new Mandolin(false, "Random Mandolin", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "Item.PracticeAmps":
                item = new PracticeAmps(100, "Random Practice Amp", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "Item.Shirt":
                item = new Shirt(3, "Random Shirt", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "Item.Strings":
                item = new Strings("guitar String","Random Guitar String", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "Item.CD":
                item = new CD( "Random CD", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "Item.MP3Players":
                item = new MP3Players("Random MP3", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "Item.CdPlayers":
                item = new CdPlayers("Random CD player", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "Item.Vinyl":
                item = new Vinyl("Random Vinyl Record", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "Item.Bass":
                item = new Bass(true, "Random Electric Bass", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "Item.RecordPlayer":
                item = new RecordPlayer("Black Record Player", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            default:
                item = null;
        }
        return item;
    }
    public String getStringSubtype() {
        Random rand = new Random();
        String randSubtype = this.classNames.get(rand.nextInt(this.classNames.size()));
        return randSubtype;
    }
    public boolean subtypeExists(String randSubtype) {
        boolean flag = false;
        for (int j = 0; j < this.merchandise.size(); j++) {
            String className = this.merchandise.get(j).getClass().getName();
            if (className.equals(randSubtype)) {
                flag = true;
            }
        }
        return flag;
    }
    public int sumPurchasePrice() {
        int sum = 0;
        for (Item i : merchandise) {
            sum += i.getPurchasePrice();
        }
        return sum;
    }

}
