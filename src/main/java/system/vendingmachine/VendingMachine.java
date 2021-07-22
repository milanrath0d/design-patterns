package system.vendingmachine;

import java.util.List;

/**
 * @author Milan Rathod
 */
public interface VendingMachine {

    long selectItemAndGetPrice(Item item);

    void insertCoin(Coin coin);

    List<Coin> refund();

    Bucket<Item, List<Coin>> collectItemAndChange();

    void reset();

}
