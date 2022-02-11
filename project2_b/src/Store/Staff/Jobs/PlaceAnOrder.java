package Store.Staff.Jobs;
import Store.*;
import Item.*;
import Store.Staff.Staff;

public class PlaceAnOrder extends Job{
    public void do_job(Store s, Staff p){
        System.out.println("doing Job");
    }
    public void do_job(Store s, Staff p, int itemId) {
        System.out.println("placing an order...");
        //generates random arival date between 1 - 3 days from now
        int arrivalDate = (int)(Math.random() * 3 + 1);
        //generates random purchase price
        float purchasePrice = (float)(Math.random() * 200) + 1.00f;
        String classNames[] = {"Bandanas",  "Cable", "Flute", "Guitar", "Harmonica", "Hat", "Mandolin", "PracticeAmps", "Shirt", "Strings", "CD", "MP3Players", "CdPlayers", "Vinyl", "Bass", "RecordPlayer"};
        //switch on type of merchandise that needs to be ordered
        //adds order to stores order list and removes cash needed for order from cash register
        switch (itemId){
            case 0:
                s.getOrders().add(new Order(new Bandanas("green Bandana", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new Bandanas("green Bandana", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new Bandanas("green Bandana", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case 1:
                s.getOrders().add(new Order(new Cable(2, "green cable",10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new Cable(2, "green cable",10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new Cable(2, "green cable",10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case 2:
                s.getOrders().add(new Order(new Flute("standard", "green flute",10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new Flute("standard", "green flute",10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new Flute("standard", "green flute",10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case 3:
                s.getOrders().add(new Order(new Guitar(true, "green electric guitar",10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new Guitar(true, "green electric guitar",10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new Guitar(true, "green electric guitar",10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case 4:
                s.getOrders().add(new Order(new Harmonica("G", "Harminica for kids", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new Harmonica("G", "Harminica for kids", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new Harmonica("G", "Harminica for kids", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case 5:
                s.getOrders().add(new Order(new Hat(1, "Blue Hat", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new Hat(1, "Blue Hat", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new Hat(1, "Blue Hat", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case 6:
                s.getOrders().add(new Order(new Mandolin(false, "Harminica for kids", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new Mandolin(false, "Harminica for kids", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new Mandolin(false, "Harminica for kids", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case 7:
                s.getOrders().add(new Order(new PracticeAmps(100, "Harminica for kids", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new PracticeAmps(100, "Harminica for kids", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new PracticeAmps(100, "Harminica for kids", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case 8:
                s.getOrders().add(new Order(new Shirt(3, "Metallica Shirt", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new Shirt(3, "Metallica Shirt", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new Shirt(3, "Metallica Shirt", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case 9:
                s.getOrders().add(new Order(new Strings("guitar String","Harminica for kids", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new Strings("guitar String","Harminica for kids", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new Strings("guitar String","Harminica for kids", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case 10:
                s.getOrders().add(new Order(new CD( "Green day CD", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new CD( "Green day CD", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new CD( "Green day CD", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case 11:
                s.getOrders().add(new Order(new MP3Players("Ipod nano", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new MP3Players("Ipod nano", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new MP3Players("Ipod nano", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case 12:
                s.getOrders().add(new Order(new CdPlayers("Silver CD player", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new CdPlayers("Silver CD player", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new CdPlayers("Silver CD player", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case 13:
                s.getOrders().add(new Order(new Vinyl("Vinyl Record", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new Vinyl("Vinyl Record", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new Vinyl("Vinyl Record", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case 14:
                s.getOrders().add(new Order(new Bass(true, "Electric Bass", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new Bass(true, "Electric Bass", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new Bass(true, "Electric Bass", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
            case 15:
                s.getOrders().add(new Order(new RecordPlayer("Black Record Player", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new RecordPlayer("Black Record Player", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.getOrders().add(new Order(new RecordPlayer("Black Record Player", 10, purchasePrice, purchasePrice*1.2f, purchasePrice*1.2f), arrivalDate));
                s.setCashReg(s.getCashReg() - 3 * purchasePrice);
                break;
        }
        //print confirming order
        System.out.println(p.getEmployeeName() + "bought 3" + classNames[itemId] + "for: " +  purchasePrice + " and the order will be here in " + arrivalDate + " days.");

    }
}

