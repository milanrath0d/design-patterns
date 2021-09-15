package system.vendingmachine;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@linkplain VendingMachine}
 *
 * @author Milan Rathod
 */
class VendingMachineTest {

    private VendingMachine vendingMachine;

    @BeforeEach
    public void setUp() {
        vendingMachine = VendingMachineFactory.createVendingMachine();
    }

    @AfterEach
    public void tearDown() {
        vendingMachine = null;
    }

    @Test
    public void testBuyItemWithExactPrice() {

        long price = vendingMachine.selectItemAndGetPrice(Item.COKE);

        assertEquals(Item.COKE.getPrice(), price);

        vendingMachine.insertCoin(Coin.QUARTER);

        Bucket<Item, List<Coin>> bucket = vendingMachine.collectItemAndChange();

        Item item = bucket.getFirst();

        List<Coin> change = bucket.getSecond();

        assertEquals(Item.COKE, item);

        assertTrue(change.isEmpty());
    }

    @Test
    public void testBuyItemWithMorePrice() {

        long price = vendingMachine.selectItemAndGetPrice(Item.SODA);

        assertEquals(Item.SODA.getPrice(), price);

        vendingMachine.insertCoin(Coin.QUARTER);
        vendingMachine.insertCoin(Coin.QUARTER);

        Bucket<Item, List<Coin>> bucket = vendingMachine.collectItemAndChange();

        Item item = bucket.getFirst();

        List<Coin> change = bucket.getSecond();

        assertEquals(Item.SODA, item);
        assertFalse(change.isEmpty());
        assertEquals(50 - Item.SODA.getPrice(), getTotal(change));
    }

    @Test
    public void testRefund() {
        long price = vendingMachine.selectItemAndGetPrice(Item.PEPSI);

        assertEquals(Item.PEPSI.getPrice(), price);

        vendingMachine.insertCoin(Coin.DIME);
        vendingMachine.insertCoin(Coin.NICKEL);
        vendingMachine.insertCoin(Coin.PENNY);
        vendingMachine.insertCoin(Coin.QUARTER);

        assertEquals(41, getTotal(vendingMachine.refund()));
    }

    @Test
    public void testSoldOut() {
        assertThrows(SoldOutException.class, () -> {
            for (int i = 0; i <= 5; i++) {
                vendingMachine.selectItemAndGetPrice(Item.COKE);
                vendingMachine.insertCoin(Coin.QUARTER);
                vendingMachine.collectItemAndChange();
            }
        });
    }

    @Test
    public void testNotSufficientChangeException() {
        assertThrows(NotSufficientChangeException.class, () -> {
            for (int i = 0; i < 5; i++) {
                vendingMachine.selectItemAndGetPrice(Item.SODA);
                vendingMachine.insertCoin(Coin.QUARTER);
                vendingMachine.insertCoin(Coin.QUARTER);
                vendingMachine.collectItemAndChange();
                vendingMachine.selectItemAndGetPrice(Item.PEPSI);
                vendingMachine.insertCoin(Coin.QUARTER);
                vendingMachine.insertCoin(Coin.QUARTER);
                vendingMachine.collectItemAndChange();
            }
        });
    }

    @Test
    public void testReset() {
        VendingMachine vendingMachine = VendingMachineFactory.createVendingMachine();
        vendingMachine.reset();
        assertThrows(SoldOutException.class, () -> vendingMachine.selectItemAndGetPrice(Item.COKE));
    }

    private long getTotal(List<Coin> change) {
        long total = 0;
        for (Coin c : change) {
            total = total + c.getDenomination();
        }
        return total;
    }

}