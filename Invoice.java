package PraktikumPemlan.Modul8.SoalPraktikum;

public class Invoice implements Payable {

    private String productName;
    private int quantity;
    private int pricePerItem;

    public Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public int getPayableAmount() {
        return quantity * pricePerItem;
    }

    public void displayInvoice() {
        System.out.println("Nama Produk  : " + productName);
        System.out.println("Jumlah       : " + quantity);
        System.out.println("Harga/item   : " + pricePerItem);
        System.out.println("Total Harga  : " + getPayableAmount());
        System.out.println();
    }
}