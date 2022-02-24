package Store.Obersvables;

import Store.Store;

public interface Logger {
    public abstract void update(String info, Store s);
}
