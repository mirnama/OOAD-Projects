package Store.Staff.Tune;
import Item.*;
public class HaphazardTune implements Tune {
    public void do_tune(Stringed item){

        if (Math.random() > .5){
            item.switchTuned();
            System.out.println("Switched tuning of a Stringed Instrument");
        }
    }
    public void do_tune(Wind item){
        if (Math.random() > .5){
            item.switchTuned();
            System.out.println("Switched tuning of a Wind Instrument");
        }
    }
    public void do_tune(Player item) {
        if (Math.random() > .5){
            item.switchTuned();
            System.out.println("Switched tuning of a Player");
        }
    }
}
