package Item.kit;

import Item.Item;

 abstract public class AbstractGuitarKitFactory {
    abstract public double getPrice();
    abstract public Item getGuitarKit(int pickupType, int pickGuardType, int knobsetType, int coverType, int bridgeTyp);
}


