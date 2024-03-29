package Item;

public class Music extends Item {
    private String band;
    private String album;

    public Music (String itemName, int itemCondition, double purchasePrice, double listPrice, double salePrice, String band, String album) {
        super(itemName, itemCondition, purchasePrice, listPrice, salePrice);
        this.band = band;
        this.album = album;
    }
    public Music (String itemName, int itemCondition, double purchasePrice, double listPrice, double salePrice) {
        super(itemName, itemCondition, purchasePrice, listPrice, salePrice);
    }

    public String getBand ( ) {
        return band;
    }
    public void setBand (String band) {
        this.band = band;
    }
    public String getAlbum ( ) {
        return album;
    }
    public void setAlbum (String album) {
        this.album = album;
    }

}
