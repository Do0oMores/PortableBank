package top.mores.portableBank.Cash;

import org.bukkit.inventory.ItemStack;

public class CashItem {
    private String Name;
    private int Price;
    private ItemStack Item;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public ItemStack getItem() {
        return Item;
    }

    public void setItem(ItemStack item) {
        Item = item;
    }
}
