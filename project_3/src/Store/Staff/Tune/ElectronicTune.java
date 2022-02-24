package Store.Staff.Tune;

import Item.Player;
import Item.Stringed;
import Item.Wind;
//always sets
public class ElectronicTune implements Tune {
    public void do_tune(Stringed item){
        item.setTuned(true);
        System.out.println("set tuning of a Stringed Instrument to true");
    }
    public void do_tune(Wind item){
        item.setTuned(true);
        System.out.println("set tuning of a Wind Instrument to true");
    }
    public void do_tune(Player item) {
        item.setTuned(true);
        System.out.println("set tuning of a Player to true");
    }
}
