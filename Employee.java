package PraktikumPemlan.Modul8.SoalPraktikum;

public class Employee implements Payable {

    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {

        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    // Menghitung total hutang belanja
    public int getTotalInvoice() {
        int total = 0;

        for (Invoice invoice : invoices) {
            total += invoice.getPayableAmount();
        }

        return total;
    }

    // Gaji setelah dipotong hutang koperasi
    @Override
    public int getPayableAmount() {
        return salaryPerMonth - getTotalInvoice();
    }

    public void displayEmployee() {
        System.out.println("=== DATA KARYAWAN ===");
        System.out.println("Nomor Registrasi : " + registrationNumber);
        System.out.println("Nama             : " + name);
        System.out.println("Gaji per Bulan   : " + salaryPerMonth);
        System.out.println("Total Belanja    : " + getTotalInvoice());
        System.out.println("Gaji Akhir       : " + getPayableAmount());
        System.out.println();
    }

    public void displayInvoices() {
        System.out.println("=== DETAIL BELANJA ===");

        for (Invoice invoice : invoices) {

            // Polimorfisme
            Payable payable = invoice;
            
            invoice.displayInvoice();
        }
    }
}
