package Item;

public class Music extends Item{
    private String band;
    private String album;

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

    public Music (String itemName, int itemCondition, Float purchasePrice, Float listPrice, Float salePrice, String band, String album) {
        super(itemName, itemCondition, purchasePrice, listPrice, salePrice);
        this.band = band;
        this.album = album;
    }

    public Music (String itemName, int itemCondition, Float purchasePrice, Float listPrice, Float salePrice) {
        super(itemName, itemCondition, purchasePrice, listPrice, salePrice);
    }
}
