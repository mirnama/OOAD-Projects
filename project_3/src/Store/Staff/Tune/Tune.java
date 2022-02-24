package Store.Staff.Tune;
import Item.*;
public interface Tune {
    public abstract void do_tune(Stringed item);
    public abstract void do_tune(Wind item);
    public abstract void do_tune(Player item);

}
