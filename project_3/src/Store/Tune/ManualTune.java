package Store.Staff.Tune;

import Item.Player;
import Item.Stringed;
import Item.Wind;

public class ManualTune implements Tune {
    public void do_tune(Stringed item) {
        if (Math.random() < .8 && item.isTuned() == false) {
            item.switchTuned();
            System.out.println("Switched tuning of a Wind Instrument");
        }
        else if (Math.random() > .8 && item.isTuned() == true){
            item.switchTuned();
            System.out.println("Switched tuning of a Wind Instrument");
        }
    }

    public void do_tune(Wind item) {
        if (Math.random() < .8 && item.isTuned() == false) {
            item.switchTuned();
            System.out.println("Switched tuning of a Wind Instrument");
        }
        else if (Math.random() > .8 && item.isTuned() == true){
            item.switchTuned();
            System.out.println("Switched tuning of a Wind Instrument");
        }
    }

    public void do_tune(Player item) {
        if (Math.random() < .8 && item.isTuned() == false) {
            item.switchTuned();
            System.out.println("Switched tuning of a Wind Instrument");
        }
        else if (Math.random() > .8 && item.isTuned() == true){
            item.switchTuned();
            System.out.println("Switched tuning of a Wind Instrument");
        }
    }
}
