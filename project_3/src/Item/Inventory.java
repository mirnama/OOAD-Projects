package Item;

import Store.Staff.Jobs.Order;

import java.util.Random;

import java.util.ArrayList;

public class Inventory { // singleton
    private ArrayList< ItemDecorator > merchandise = new ArrayList< ItemDecorator >();
    private ArrayList< ItemDecorator > soldItemDecorators = new ArrayList< ItemDecorator >();
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

        this.classNames.add("ItemDecorator.Bandanas");
        this.classNames.add("ItemDecorator.Cable");
        this.classNames.add("ItemDecorator.Flute");
        this.classNames.add("ItemDecorator.Guitar");
        this.classNames.add("ItemDecorator.Harmonica");
        this.classNames.add("ItemDecorator.Hat");
        this.classNames.add("ItemDecorator.Mandolin");
        this.classNames.add("ItemDecorator.PracticeAmps");
        this.classNames.add("ItemDecorator.Shirt");
        this.classNames.add("ItemDecorator.Strings");
        this.classNames.add("ItemDecorator.CD");
        this.classNames.add("ItemDecorator.MP3Players");
        this.classNames.add("ItemDecorator.CdPlayers");
        this.classNames.add("ItemDecorator.Vinyl");
        this.classNames.add("ItemDecorator.Bass");
        this.classNames.add("ItemDecorator.RecordPlayer");
        this.classNames.add("ItemDecorator.Saxophone");
        this.classNames.add("ItemDecorator.Cassette");
        this.classNames.add("ItemDecorator.CassettePlayer");
        this.classNames.add("ItemDecorator.GigBag");
    }
    public ArrayList < ItemDecorator > getSoldItems() {return soldItemDecorators;}
    public ArrayList < ItemDecorator > getMerchandise ( ) { // needs to be type ItemDecorator
        return merchandise;
    }
    public ArrayList<Order> getOrders() {
        return orders;//returns order arraylist
    }
    public void removeMerch(ItemDecorator itemDecorator) {
        this.merchandise.remove(itemDecorator);
    }
    public void setMerchandise (ArrayList < ItemDecorator > merchandiseSet) { // I put set in the end to now which one the new var just a style we could change it
        this.merchandise = merchandiseSet; // needs to be type item
    }
    public boolean isStringed(ItemDecorator itemDecorator){
        String itemType = itemDecorator.getClass().getName();
        return(itemType.equals("ItemDecorator.Bass") || itemType.equals("ItemDecorator.Guitar") || itemType.equals("ItemDecorator.Mandolin"));
    }
    public boolean isWind(ItemDecorator itemDecorator){
        String itemType = itemDecorator.getClass().getName();
        return (itemType.equals("ItemDecorator.Flute") || itemType.equals("ItemDecorator.Harmonica") || itemType.equals("ItemDecorator.Saxophone"));
    }
    public boolean  isPlayer(ItemDecorator itemDecorator){
        String itemType = itemDecorator.getClass().getName();
        return (itemType.equals("ItemDecorator.CassettePlayer") || itemType.equals("ItemDecorator.CdPlayers") || itemType.equals("ItemDecorator.MP3Players") || itemType.equals("ItemDecorator.RecordPlayer"));
    }
    public ItemDecorator getItemSubtype(String className) {
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
    public void addMerch(ItemDecorator i) {
        this.merchandise.add(i);
    }
    public void addOrder(Order o) {
        this.orders.add(o);
    }
    public void addSold(ItemDecorator i) {
        this.soldItemDecorators.add(i);
    }
    public ItemDecorator createItem(String subtype) {
        Random rand = new Random();
        int itemCond = rand.nextInt(5);
        ItemDecorator itemDecorator;
        double purchasePrice = (double) (Math.random() * 200) + 1.00;
        switch (subtype){ // would have to implement randomness here, we should be doing it in the constructor call of items
            case "ItemDecorator.Bandanas":
                itemDecorator = new Bandanas("Random Bandana", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.Cable":
                itemDecorator = new Cable(2, "Random cable",itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.Flute":
                itemDecorator = new Flute("standard", "Random flute",itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.Guitar":
                itemDecorator = new Guitar(true, "Random electric guitar",itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.Harmonica":
                itemDecorator = new Harmonica("G", "Random Harmonica", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.Hat":
                itemDecorator = new Hat(1, "Random Hat", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.Mandolin":
                itemDecorator = new Mandolin(false, "Random Mandolin", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.PracticeAmps":
                itemDecorator = new PracticeAmps(100, "Random Practice Amp", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.Shirt":
                itemDecorator = new Shirt(3, "Random Shirt", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.Strings":
                itemDecorator = new Strings("guitar String","Random Guitar String", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.CD":
                itemDecorator = new CD( "Random CD", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.MP3Players":
                itemDecorator = new MP3Players("Random MP3", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.CdPlayers":
                itemDecorator = new CdPlayers("Random CD player", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.Vinyl":
                itemDecorator = new Vinyl("Random Vinyl Record", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.Bass":
                itemDecorator = new Bass(true, "Random Electric Bass", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            case "ItemDecorator.RecordPlayer":
                itemDecorator = new RecordPlayer("Black Record Player", itemCond, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f);
                break;
            default:
                itemDecorator =new Saxophone("SaxophoneType3","Saxophonn3",5,55,110,100);

        }
        return itemDecorator;
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
        for (ItemDecorator i : merchandise) {
            sum += i.getPurchasePrice();
        }
        return sum;
    }

}
