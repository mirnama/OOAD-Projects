package Store;

import java.util.Random;

public class Customers {
    private int customersCount;

    public Customers () {
        this.customersCount = new Random().nextInt(10);
    }
}
