package dev.lpa;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    enum CartType { PHYSICAL, VIRAL };
    private static int lastId = 1;
    private int id;
    private LocalDate cartDate;
    private CartType type;
    private Map<String, Integer> prodcuts;

    public Cart(CartType type, int days) {
        this.type = type;
        id = lastId++;
        cartDate = LocalDate.now().minusDays(days);
        prodcuts = new HashMap<>();
    }

    public Cart(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public LocalDate getCartDate() {
        return cartDate;
    }

    public void addItem(InventoryItem item, int qty){
        prodcuts.merge(item.getProduct().sku(), qty, Integer::sum);

        if (!item.reservedItem(qty)){
            System.out.println("Oouch, something went wrong, could not add item");
        }
    }

    public void removeItem(InventoryItem item, int qty){
        int current = prodcuts.get(item.getProduct().sku());

        if (current <= qty) {
            qty = current;
            prodcuts.remove(item.getProduct().sku());
            System.out.printf("Item [%s] removed from basket%n",
                    item.getProduct().name());
        } else {
            prodcuts.merge(item.getProduct().sku(), qty,
                    (oldVal, newVal) -> oldVal - newVal);
            System.out.printf("%d [%s]s removed%n", qty, item.getProduct().name());
        }
        item.releaseItem(qty);
    }

    public void printSalesSlip(Map<String, InventoryItem> inventory) {
        double total = 0;
        System.out.println("--------------");
        System.out.println("Thank you for sale: ");
        for (var cartItems : prodcuts.entrySet()) {
            var item = inventory.get(cartItems.getKey());
            int qty = cartItems.getValue();
            double itemizedPrice = (item.getPrice() * qty);
            total += itemizedPrice;
            System.out.printf("\t%s %-10s (%d)@ $%.2f = $%.2f%n",
                    cartItems.getKey(), item.getProduct().name(), qty,
                    item.getPrice(), itemizedPrice);
        }
        System.out.printf("Total Sale: $%.2f%n", total);
        System.out.println("------------------");
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", cartDate=" + cartDate +
                ", prodcuts=" + prodcuts +
                '}';
    }
}
