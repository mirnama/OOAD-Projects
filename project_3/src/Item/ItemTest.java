package Item;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void getItemName ( ) {
        Item item =new CD("CD1", 5,8.0f,10f,10f);
        assertEquals(item.getItemName(), "CD1");
    }

    @Test
    void setItemName ( ) {
        Item item =new CD("CD1", 5,8.0f,10f,10f);
        item.setItemName("CD2");
        assertEquals(item.getItemName(),"CD2");

    }

    @Test
    void getItemCondition ( ) {
        Item item =new Cassette("Cassette", 5,8.0,10,10);
        assertEquals(item.getItemCondition(),5);


    }

    @Test
    void setItemCondition ( ) {
        Item item =new Cassette("Cassette", 5,8.0f,10f,10f);
        item.setItemCondition(4);
        assertEquals(item.getItemCondition(),4);

    }

    @Test
    void getPurchasePrice ( ) {
        Item item =new CD("CD1", 5,8.0f,10f,10f);

        assertEquals(item.getPurchasePrice(),8);
    }

    @Test
    void setPurchasePrice ( ) {


    }

    @Test
    void testSetPurchasePrice ( ) {
    }

    @Test
    void getListPrice ( ) {
    }


    @Test
    void testSetListPrice ( ) {
    }

    @Test
    void getSalePrice ( ) {
    }

    @Test
    void setSalePrice ( ) {
    }

}