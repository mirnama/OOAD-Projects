package Store.Staff.Jobs;
import Store.*;
import Item.*;
import Store.Obersvables.*;
import Store.Staff.Staff;

public class PlaceAnOrder implements Job{
    private Logger obs = null;
    private Tracker tr = null;

    public PlaceAnOrder(Logger o) {
        registerObserver(o);
    }
    public void do_job(Store s, Staff p){
        System.out.println("doing Job");
    }
    public void do_job(Store s, Staff p, String subtype) {
        Inventory inv = s.getInventory();
        int arrivalDate = (int)(Math.random() * 3 + 1);
        float purchasePrice = (float)(Math.random() * 200) + 1.00f;
        String classNames[] = {"Bandanas",  "Cable", "Flute", "Guitar", "Harmonica", "Hat", "Mandolin", "PracticeAmps", "Shirt", "Strings", "CD", "MP3Players", "CdPlayers", "Vinyl", "Bass", "RecordPlayer"};
        //switch on type of merchandise that needs to be ordered
        //adds order to stores order list and removes cash needed for order from cash register
        Job cR = new CheckRegister(obs);
        cR.do_job(s, p);
        switch (subtype){
            case "ItemDecorator.Bandanas":
                inv.addOrder(new Order(new Bandanas("green Bandana", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Bandanas("green Bandana", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Bandanas("green Bandana", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "ItemDecorator.Cable":
                inv.addOrder(new Order(new Cable(2, "green cable",10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Cable(2, "green cable",10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Cable(2, "green cable",10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "ItemDecorator.Flute":
                inv.addOrder(new Order(new Flute("standard", "green flute",10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Flute("standard", "green flute",10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Flute("standard", "green flute",10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "ItemDecorator.Guitar":
                inv.addOrder(new Order(new Guitar(true, "green electric guitar",10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Guitar(true, "green electric guitar",10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Guitar(true, "green electric guitar",10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "ItemDecorator.Harmonica":
                inv.addOrder(new Order(new Harmonica("G", "Harmonica for kids", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Harmonica("G", "Harmonica for kids", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Harmonica("G", "Harmonica for kids", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "ItemDecorator.Hat":
                inv.addOrder(new Order(new Hat(1, "Blue Hat", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Hat(1, "Blue Hat", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Hat(1, "Blue Hat", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "ItemDecorator.Mandolin":
                inv.addOrder(new Order(new Mandolin(false, "Mandolin for kids", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Mandolin(false, "Mandolin for kids", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Mandolin(false, "Mandolin for kids", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "ItemDecorator.PracticeAmps":
                inv.addOrder(new Order(new PracticeAmps(100, "Practice amps super", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new PracticeAmps(100, "Practice amps super", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new PracticeAmps(100, "Practice amps super", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "ItemDecorator.Shirt":
                inv.addOrder(new Order(new Shirt(3, "Metallica Shirt", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Shirt(3, "Metallica Shirt", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Shirt(3, "Metallica Shirt", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "ItemDecorator.Strings":
                inv.addOrder(new Order(new Strings("guitar String","Guitar G String", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Strings("guitar String","Guitar G String", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Strings("guitar String","Guitar G String", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "ItemDecorator.CD":
                inv.addOrder(new Order(new CD( "Green day CD", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new CD( "Green day CD", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new CD( "Green day CD", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "ItemDecorator.MP3Players":
                inv.addOrder(new Order(new MP3Players("Ipod nano", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new MP3Players("Ipod nano", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new MP3Players("Ipod nano", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "ItemDecorator.CdPlayers":
                inv.addOrder(new Order(new CdPlayers("Silver CD player", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new CdPlayers("Silver CD player", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new CdPlayers("Silver CD player", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "ItemDecorator.Vinyl":
                inv.addOrder(new Order(new Vinyl("Vinyl Record", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Vinyl("Vinyl Record", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Vinyl("Vinyl Record", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "ItemDecorator.Bass":
                inv.addOrder(new Order(new Bass(true, "Electric Bass", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Bass(true, "Electric Bass", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Bass(true, "Electric Bass", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "ItemDecorator.RecordPlayer":
                inv.addOrder(new Order(new RecordPlayer("Black Record Player", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new RecordPlayer("Black Record Player", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new RecordPlayer("Black Record Player", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
        }
        //print confirming order
        System.out.println(p.getEmployeeName() + " bought 3 " + subtype.substring(14) + " for: " +  purchasePrice + " and the order will be here in " + arrivalDate + " days.");
        // notifyObservers(); // handled in DoInventory
    }

    public void registerObserver(Logger o) {
        obs = o;
    }
    public void removeObserver(Logger o) {
        obs = null;
    }
    public void notifyObservers(String info) {
        obs.update(info);
    }
    public void setLogger(Logger o) {
        obs = o;
    }

    public void registerObserverTracker(Tracker t) {tr = t;}
    public void removeObserverTracker(Tracker t) {tr = null;} // shouldnt have parameter
    public void notifyObserversTracker(Staff p, int sold, int purch, int dmg) {
        tr.update_tracker(p,sold,purch,dmg);
    }
    public void setTracker(Tracker t) {tr = t;}
}

