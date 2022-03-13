package Item.kit;
import Item.*;
public class GuitarKitFactory extends AbstractGuitarKitFactory  {
    private GuitarBridge bridge;
    private GuitarKnobSet knobSet;
    private GuitarCover cover;
    private GuitarPickGuard guard;
    private GuitarPickup pickUp;
    //returns price of guitar kit
    public double getPrice() {
        return bridge.getPrice() + knobSet.getPrice() + cover.getPrice() + guard.getPrice() + pickUp.getPrice();
    }
    public GuitarKitFactory(){
    }
    //creates all components and makes guitar kit into an item
    //1 for basic, 2 for standard, 3 for legendary on types
    @Override
    public Item getGuitarKit(int pickupType, int pickGuardType, int knobsetType, int coverType, int bridgeType) {
        bridge = createBridge(bridgeType);
        knobSet = createKnobSet(knobsetType);
        cover = createGuitarCover(coverType);
        guard = createGuitarPickGuard(pickGuardType);
        pickUp = createGuitarPickup(pickupType);
        System.out.println(pickUp.getPrice());

        return new GuitarKit(this.getPrice());
    }

    private GuitarPickup createGuitarPickup(int Type) {
        if (Type == 1)
            return new basicGuitarPickup();
        else if (Type == 2){
            return new standardGuitarPickup();
        }
        else {
            return new legendaryGuitarPickup();
        }
    }

    private GuitarPickGuard createGuitarPickGuard(int Type) {
        if (Type == 1)
            return new basicGuitarPickGuard();
        else if (Type == 2){
            return new standardGuitarPickGuard();
        }
        else {
            return new legendaryGuitarPickGuard();
        }
    }

    private GuitarCover createGuitarCover(int Type) {
        if (Type == 1)
            return new basicGuitarCover();
        else if (Type == 2){
            return new standardGuitarCover();
        }
        else {
            return new legendaryGuitarCover();
        }
    }

    private GuitarBridge createBridge(int Type) {
        if (Type == 1)
            return new basicGuitarBridge();
        else if (Type == 2){
            return new standardGuitarBridge();
        }
        else {
            return new legendaryGuitarBridge();
        }
    }
    private GuitarKnobSet createKnobSet(int knobSetType) {
        if (knobSetType == 1)
            return new basicGuitarKnobSet();
        else if (knobSetType == 2){
             return new standardGuitarKnobSet();
        }
        else {
             return new legendaryGuitarKnobSet();
         }
    }
}
