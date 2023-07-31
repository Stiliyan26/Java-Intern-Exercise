package dev.lpa;

public class InventoryItem {
    private Product product;
    private double price;
    private int qntTotal;
    private int qtyReserved;
    private int qtyReorder;
    private int qtyLow;

    public InventoryItem(Product product, double price, int qntTotal, int qtyLow) {
        this.product = product;
        this.price = price;
        this.qntTotal = qntTotal;
        this.qtyLow = qtyLow;
        this.qtyReorder = qntTotal;
    }

    public Product getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public boolean reservedItem(int qty){
        if ((qntTotal - qtyReserved) >= qty) {
            qtyReserved += qty;
            return true;
        }
        return false;
    }

    public void releaseItem(int qty) {
        qtyReserved -= qty;
    }

    public boolean sellItem(int qty) {
        if (qntTotal >= qty){
            qntTotal -= qty;
            qtyReserved -= qty;
            if (qntTotal <= qtyLow){
                placeInventoryOrder();
            }

            return  true;
        }
        return false;
    }

    private void placeInventoryOrder(){
        System.out.printf("Ordering qty %d : %s%n", qtyReorder, product);
    }

    @Override
    public String toString() {
        return "%s $%.2f : [%04d,% 2d]".formatted(product, price, qntTotal, qtyReserved);
    }
}
