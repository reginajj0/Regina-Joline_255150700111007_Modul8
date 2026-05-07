package PraktikumPemlan.Modul8.SoalPraktikum;

public class Main {

    public static void main(String[] args) {

        // Membuat invoice belanja
        Invoice invoice1 = new Invoice("Minyak 1 Liter", 3, 20000);
        Invoice invoice2 = new Invoice("Beras 5kg ", 2, 75000 );
        Invoice invoice3 = new Invoice("Gula 1 kg", 1, 24000);

        // Array invoice
        Invoice[] invoices = {invoice1, invoice2, invoice3};

        // Membuat employee
        Employee employee = new Employee(
                101,
                "Jasmine",
                4500000,
                invoices
        );

        // Menampilkan data karyawan
        employee.displayEmployee();

        // Menampilkan detail invoice
        employee.displayInvoices();
    }
}