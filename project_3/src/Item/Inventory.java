package Item;

import Item.Decorator.SellGigBag;
import Store.Staff.Jobs.Order;
import Store.Store;

import java.util.Random;

import java.util.ArrayList;

public class Inventory { // singleton
    private ArrayList<Item> merchandise = new ArrayList<Item>();
    private ArrayList<Item> soldItems = new ArrayList<Item>();
    private ArrayList<Order> orders = new ArrayList<Order>();
    private ArrayList<String> classNames = new ArrayList<String>();
    private ArrayList<String> sellingClassNames = new ArrayList<String>();


    public Inventory() {
        this.merchandise.add(new CD("CD1", 5,8.0f,10f,10f));
        this.merchandise.add(new CD("CD2", 4,6.0f,10f,9f));
        this.merchandise.add(new CD("CD3", 3,3f,7f,6.5f));
        this.merchandise.add(new SellGigBag(new Guitar(true, "Electric Guitar1", 5,10.0f, 10.0f, 10.0f)));
        this.merchandise.add(new Guitar(false, "Acoustic Guitar1", 5,8.0f, 8.0f, 8.0f));
        this.merchandise.add(new Guitar(true, "Electric Guitar1", 5,10.0f, 10.0f, 10.0f));
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
        this.merchandise.add(new Saxophone("SaxophoneType1","Saxophonn1",5,55,110,100));
        this.merchandise.add(new Saxophone("SaxophoneType2","Saxophonn2",5,55,110,100));
        this.merchandise.add(new Saxophone("SaxophoneType3","Saxophonn3",5,55,110,100));
        this.merchandise.add(new GigBag("Red bag",5,50,58,56));
        this.merchandise.add(new GigBag("The smallest",1,450f,550f,543f));
        this.merchandise.add(new GigBag("blue",5,50,58,56));
        this.merchandise.add(new Cassette("Red Rocks",5,5,6,5.6));
        this.merchandise.add(new Cassette("The smallest",1,450f,550f,543f));
        this.merchandise.add(new Cassette("blue Cassette",5,50,58,56));
        this.merchandise.add(new CassettePlayer("Sony",5,50,60,56));
        this.merchandise.add(new CassettePlayer("Carplay",1,450,550,543));
        this.merchandise.add(new CassettePlayer("cassette",5,50,58,56));
        //list of all the class types currently in the store
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
        this.classNames.add("Item.Saxophone");
        this.classNames.add("Item.Cassette");
        this.classNames.add("Item.CassettePlayer");
        this.classNames.add("Item.GigBag");
        //list of all the class types we are currently buying
        this.sellingClassNames.add("Item.Bandanas");
        this.sellingClassNames.add("Item.Cable");
        this.sellingClassNames.add("Item.Flute");
        this.sellingClassNames.add("Item.Guitar");
        this.sellingClassNames.add("Item.Harmonica");
        this.sellingClassNames.add("Item.Mandolin");
        this.sellingClassNames.add("Item.PracticeAmps");
        this.sellingClassNames.add("Item.Strings");
        this.sellingClassNames.add("Item.CD");
        this.sellingClassNames.add("Item.MP3Players");
        this.sellingClassNames.add("Item.CdPlayers");
        this.sellingClassNames.add("Item.Vinyl");
        this.sellingClassNames.add("Item.Bass");
        this.sellingClassNames.add("Item.RecordPlayer");
        this.sellingClassNames.add("Item.Saxophone");
        this.sellingClassNames.add("Item.Cassette");
        this.sellingClassNames.add("Item.CassettePlayer");
        this.sellingClassNames.add("Item.GigBag");
    }
    public ArrayList <Item> getSoldItems() {return soldItems;}
    public ArrayList <Item> getMerchandise ( ) { // needs to be type ItemDecorator
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
        return(itemType.equals("ItemDecorator.Bass") || itemType.equals("ItemDecorator.Guitar") || itemType.equals("ItemDecorator.Mandolin"));
    }
    public boolean isWind(Item item){
        String itemType = item.getClass().getName();
        return (itemType.equals("ItemDecorator.Flute") || itemType.equals("ItemDecorator.Harmonica") || itemType.equals("ItemDecorator.Saxophone"));
    }
    public boolean  isPlayer(Item item){
        String itemType = item.getClass().getName();
        return (itemType.equals("ItemDecorator.CassettePlayer") || itemType.equals("ItemDecorator.CdPlayers") || itemType.equals("ItemDecorator.MP3Players") || itemType.equals("ItemDecorator.RecordPlayer"));
    }
    public Item getItemSubtype(String className) {
        for (int j = 0; j < this.merchandise.size(); j++) {
            String className = this.merchandise.get(j).getClass().getName();
            if (className.equals(DesiredclassName)) {
                return this.merchandise.get(j);
            }
        }
        return null;
    }
    public ArrayList<String> getSellingClassNames(){return sellingClassNames;}
    public ArrayList<String> getClassNames() {
        return classNames;
    }
    public void addMerch(Item i) {
        this.merchandise.add(i);
    }
    public void removeItemSubtype(String s){
        for (int i = 0; i < classNames.size(); i++){
            if (classNames.get(i).equals(s)) {
                classNames.remove(i);
                break;
            }
        }
    }
    public ArrayList<Float> addOrder(String subtype, Store s, int num) {
        int arrivalDate = (int)Math.random() * 3 + 1;
        float purchasePrice = (float)(Math.random() * 200) + 1.00f;
        ArrayList<Float> ret = new ArrayList<Float>();
        ret.add(0f); // total price



        for (int i=0; i<num; i++) {
            switch (subtype) {
                case "Item.Bandanas":
                    orders.add(new Order(new Bandanas("green Bandana", 10, purchasePrice, purchasePrice * 1.2f, purchasePrice * 1.2f), arrivalDate, s));
                    s.setCashReg(s.getCashReg() - purchasePrice);
                    break;
                case "Item.Cable":
                    orders.add(new Order(new Cable(2, "green cable", 10, purchasePrice, purchasePrice * 1.2f, purchasePrice * 1.2f), arrivalDate, s));
                    s.setCashReg(s.getCashReg() - purchasePrice);
                    break;
                case "Item.Flute":
                    orders.add(new Order(new Flute("standard", "green flute", 10, purchasePrice, purchasePrice * 1.2f, purchasePrice * 1.2f), arrivalDate, s));
                    s.setCashReg(s.getCashReg() - purchasePrice);
                    break;
                case "Item.Guitar":
                    orders.add(new Order(new Guitar(true, "green electric guitar", 10, purchasePrice, purchasePrice * 1.2f, purchasePrice * 1.2f), arrivalDate, s));
                    s.setCashReg(s.getCashReg() - purchasePrice);
                    break;
                case "Item.Harmonica":
                    orders.add(new Order(new Harmonica("G", "Harmonica for kids", 10, purchasePrice, purchasePrice * 1.2f, purchasePrice * 1.2f), arrivalDate, s));
                    s.setCashReg(s.getCashReg() - purchasePrice);
                    break;
                case "Item.Mandolin":
                    orders.add(new Order(new Mandolin(false, "Mandolin for kids", 10, purchasePrice, purchasePrice * 1.2f, purchasePrice * 1.2f), arrivalDate, s));
                    s.setCashReg(s.getCashReg() - purchasePrice);
                    break;
                case "Item.PracticeAmps":
                    orders.add(new Order(new PracticeAmps(100, "Practice amps super", 10, purchasePrice, purchasePrice * 1.2f, purchasePrice * 1.2f), arrivalDate, s));
                    s.setCashReg(s.getCashReg() - purchasePrice);
                    break;
                case "Item.Strings":
                    orders.add(new Order(new Strings("guitar String", "Guitar G String", 10, purchasePrice, purchasePrice * 1.2f, purchasePrice * 1.2f), arrivalDate, s));
                    s.setCashReg(s.getCashReg() - purchasePrice);
                    break;
                case "Item.CD":
                    orders.add(new Order(new CD("Green day CD", 10, purchasePrice, purchasePrice * 1.2f, purchasePrice * 1.2f), arrivalDate, s));
                    s.setCashReg(s.getCashReg() - purchasePrice);
                    break;
                case "Item.MP3Players":
                    orders.add(new Order(new MP3Players("Ipod nano", 10, purchasePrice, purchasePrice * 1.2f, purchasePrice * 1.2f), arrivalDate, s));
                    s.setCashReg(s.getCashReg() - purchasePrice);
                    break;
                case "Item.CdPlayers":
                    orders.add(new Order(new CdPlayers("Silver CD player", 10, purchasePrice, purchasePrice * 1.2f, purchasePrice * 1.2f), arrivalDate, s));
                    s.setCashReg(s.getCashReg() - purchasePrice);
                    break;
                case "Item.Vinyl":
                    orders.add(new Order(new Vinyl("Vinyl Record", 10, purchasePrice, purchasePrice * 1.2f, purchasePrice * 1.2f), arrivalDate, s));
                    s.setCashReg(s.getCashReg() - purchasePrice);
                    break;
                case "Item.Bass":
                    orders.add(new Order(new Bass(true, "Electric Bass", 10, purchasePrice, purchasePrice * 1.2f, purchasePrice * 1.2f), arrivalDate, s));
                    s.setCashReg(s.getCashReg() - purchasePrice);
                    break;
                case "Item.RecordPlayer":
                    orders.add(new Order(new RecordPlayer("Black Record Player", 10, purchasePrice, purchasePrice * 1.2f, purchasePrice * 1.2f), arrivalDate, s));
                    s.setCashReg(s.getCashReg() - purchasePrice);
                    break;
                case "Item.GigBag":
                    orders.add(new Order(new GigBag("Black Gig Bag", 10, purchasePrice, purchasePrice * 1.2f, purchasePrice * 1.2f), arrivalDate, s));
                    s.setCashReg(s.getCashReg() - purchasePrice);
                    break;
                default:
                    break;

            }
            ret.set(0,ret.get(0)+purchasePrice);
        }
        float f_arrival_date = (float)arrivalDate;
        ret.add(f_arrival_date); // arrival date
        return ret;

    }
    public void addSold(Item i) {
        this.soldItems.add(i);
    }
    public Item createItem(String subtype) {
        Random rand = new Random();
        int itemCond = rand.nextInt(5);
        Item item;
        double purchasePrice = (double) (Math.random() * 200) + 1.00;
        switch (subtype){ // would have to implement randomness here, we should be doing it in the constructor call of items
            case "ItemDecorator.Bandanas":
                item = new Bandanas("Random Bandana", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.Cable":
                item = new Cable(2, "Random cable",itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.Flute":
                item = new Flute("standard", "Random flute",itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.Guitar":
                item = new Guitar(true, "Random electric guitar",itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.Harmonica":
                item = new Harmonica("G", "Random Harmonica", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.Hat":
                item = new Hat(1, "Random Hat", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.Mandolin":
                item = new Mandolin(false, "Random Mandolin", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.PracticeAmps":
                item = new PracticeAmps(100, "Random Practice Amp", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.Shirt":
                item = new Shirt(3, "Random Shirt", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.Strings":
                item = new Strings("guitar String","Random Guitar String", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.CD":
                item = new CD( "Random CD", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.MP3Players":
                item = new MP3Players("Random MP3", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.CdPlayers":
                item = new CdPlayers("Random CD player", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.Vinyl":
                item = new Vinyl("Random Vinyl Record", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.Bass":
                item = new Bass(true, "Random Electric Bass", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.RecordPlayer":
                item = new RecordPlayer("Black Record Player", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            default:
                item =new Saxophone("SaxophoneType3","Saxophonn3",5,55,110,100);

        }
        return item;
    }
    public String getStringSellingSubtype(){
        Random rand = new Random();
        String randSubtype = this.sellingClassNames.get(rand.nextInt(this.getSellingClassNames().size()));
        return randSubtype;
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
