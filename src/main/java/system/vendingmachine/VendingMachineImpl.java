package system.vendingmachine;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Milan Rathod
 */
public class VendingMachineImpl implements VendingMachine {

    private final Inventory<Coin> cashInventory;

    private final Inventory<Item> itemInventory;

    private long currentBalance;

    private Item currentItem;

    private long totalSales;

    public VendingMachineImpl() {
        cashInventory = new Inventory<>();
        itemInventory = new Inventory<>();
        initialize();
    }

    @Override
    public long selectItemAndGetPrice(Item item) {
        if (itemInventory.hasItem(item)) {
            currentItem = item;
            return item.getPrice();
        }
        throw new SoldOutException("Item " + item.getName() + " is Sold out!");
    }

    @Override
    public void insertCoin(Coin coin) {
        currentBalance += coin.getDenomination();
        cashInventory.add(coin);
    }

    @Override
    public List<Coin> refund() {
        List<Coin> refund = getChange(currentBalance);
        updateCashInventory(refund);
        currentBalance = 0;
        currentItem = null;
        return refund;
    }

    @Override
    public Bucket<Item, List<Coin>> collectItemAndChange() {
        Item item = collectItem();
        totalSales += currentItem.getPrice();

        List<Coin> changes = collectChange();

        return new Bucket<>(item, changes);
    }

    @Override
    public void reset() {
        cashInventory.clear();
        itemInventory.clear();
        totalSales = 0;
        currentItem = null;
        currentBalance = 0;
    }

    public long getTotalSales() {
        return totalSales;
    }

    private void initialize() {
        for (Coin coin : Coin.values()) {
            cashInventory.put(coin, 5);
        }

        for (Item item : Item.values()) {
            itemInventory.put(item, 5);
        }
    }

    private Item collectItem() {
        if (isFullAmountPaid()) {
            if (hasSufficientChange()) {
                itemInventory.deduct(currentItem);
                return currentItem;
            } else {
                throw new NotSufficientChangeException("Not sufficient change in inventory!!");
            }
        } else {
            long remainingBalance = currentItem.getPrice() - currentBalance;
            throw new NotFullPaidException("Price is not fully paid, remaining: ", remainingBalance);
        }
    }

    private boolean isFullAmountPaid() {
        return currentBalance >= currentItem.getPrice();
    }

    private boolean hasSufficientChange() {
        long amount = currentBalance - currentItem.getPrice();
        try {
            getChange(amount);
        } catch (NotSufficientChangeException ex) {
            return false;
        }
        return true;
    }

    private List<Coin> getChange(long amount) throws NotSufficientChangeException {
        List<Coin> changes = new ArrayList<>();

        while (amount > 0) {
            if (amount >= Coin.QUARTER.getDenomination() && cashInventory.hasItem(Coin.QUARTER)) {
                changes.add(Coin.QUARTER);
                amount -= Coin.QUARTER.getDenomination();
            } else if (amount >= Coin.DIME.getDenomination() && cashInventory.hasItem(Coin.DIME)) {
                changes.add(Coin.DIME);
                amount -= Coin.DIME.getDenomination();
            } else if (amount >= Coin.NICKEL.getDenomination() && cashInventory.hasItem(Coin.NICKEL)) {
                changes.add(Coin.NICKEL);
                amount -= Coin.NICKEL.getDenomination();
            } else if (amount >= Coin.PENNY.getDenomination() && cashInventory.hasItem(Coin.PENNY)) {
                changes.add(Coin.PENNY);
                amount -= Coin.PENNY.getDenomination();
            } else {
                throw new NotSufficientChangeException("Not sufficient change available!. Please try other product!!");
            }
        }
        return changes;
    }

    private List<Coin> collectChange() {
        long changeAmount = currentBalance - currentItem.getPrice();
        List<Coin> changes = getChange(changeAmount);
        updateCashInventory(changes);
        currentBalance = 0;
        currentItem = null;
        return changes;
    }

    private void updateCashInventory(List<Coin> coins) {
        coins.forEach(cashInventory::deduct);
    }
}
