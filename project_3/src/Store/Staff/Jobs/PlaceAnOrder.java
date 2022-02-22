package Store.Staff.Jobs;
import Store.*;
import Item.*;
import Store.Staff.Staff;

public class PlaceAnOrder extends Job{
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
        Job cR = new CheckRegister();
        cR.do_job(s, p);
        switch (subtype){
            case "Item.Bandanas":
                inv.addOrder(new Order(new Bandanas("green Bandana", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Bandanas("green Bandana", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Bandanas("green Bandana", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "Item.Cable":
                inv.addOrder(new Order(new Cable(2, "green cable",10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Cable(2, "green cable",10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Cable(2, "green cable",10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "Item.Flute":
                inv.addOrder(new Order(new Flute("standard", "green flute",10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Flute("standard", "green flute",10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Flute("standard", "green flute",10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "Item.Guitar":
                inv.addOrder(new Order(new Guitar(true, "green electric guitar",10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Guitar(true, "green electric guitar",10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Guitar(true, "green electric guitar",10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "Item.Harmonica":
                inv.addOrder(new Order(new Harmonica("G", "Harmonica for kids", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Harmonica("G", "Harmonica for kids", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Harmonica("G", "Harmonica for kids", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "Item.Hat":
                inv.addOrder(new Order(new Hat(1, "Blue Hat", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Hat(1, "Blue Hat", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Hat(1, "Blue Hat", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "Item.Mandolin":
                inv.addOrder(new Order(new Mandolin(false, "Mandolin for kids", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Mandolin(false, "Mandolin for kids", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Mandolin(false, "Mandolin for kids", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "Item.PracticeAmps":
                inv.addOrder(new Order(new PracticeAmps(100, "Practice amps super", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new PracticeAmps(100, "Practice amps super", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new PracticeAmps(100, "Practice amps super", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "Item.Shirt":
                inv.addOrder(new Order(new Shirt(3, "Metallica Shirt", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Shirt(3, "Metallica Shirt", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Shirt(3, "Metallica Shirt", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "Item.Strings":
                inv.addOrder(new Order(new Strings("guitar String","Guitar G String", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Strings("guitar String","Guitar G String", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Strings("guitar String","Guitar G String", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "Item.CD":
                inv.addOrder(new Order(new CD( "Green day CD", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new CD( "Green day CD", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new CD( "Green day CD", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "Item.MP3Players":
                inv.addOrder(new Order(new MP3Players("Ipod nano", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new MP3Players("Ipod nano", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new MP3Players("Ipod nano", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "Item.CdPlayers":
                inv.addOrder(new Order(new CdPlayers("Silver CD player", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new CdPlayers("Silver CD player", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new CdPlayers("Silver CD player", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "Item.Vinyl":
                inv.addOrder(new Order(new Vinyl("Vinyl Record", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Vinyl("Vinyl Record", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Vinyl("Vinyl Record", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "Item.Bass":
                inv.addOrder(new Order(new Bass(true, "Electric Bass", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Bass(true, "Electric Bass", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new Bass(true, "Electric Bass", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case "Item.RecordPlayer":
                inv.addOrder(new Order(new RecordPlayer("Black Record Player", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new RecordPlayer("Black Record Player", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                inv.addOrder(new Order(new RecordPlayer("Black Record Player", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate,s));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
        }
        //print confirming order
        System.out.println(p.getEmployeeName() + " bought 3 " + subtype + " for: " +  purchasePrice + " and the order will be here in " + arrivalDate + " days.");

    }
}

