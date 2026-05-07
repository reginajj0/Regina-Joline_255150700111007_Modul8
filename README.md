# README - Praktikum Interface Java

## 📌 Deskripsi Program

Program ini dibuat untuk mensimulasikan sistem koperasi karyawan pada perusahaan NV. Meneer. Karyawan dapat berbelanja di koperasi dan pembayaran dilakukan melalui pemotongan gaji di akhir bulan.

Program menerapkan konsep:

* Interface
* Polimorfisme
* Array Object
* OOP (Object Oriented Programming)

---

# 📂 Struktur Program

## 1. Interface `Payable`

Interface `Payable` digunakan sebagai kontrak untuk class yang memiliki proses pembayaran.

Method:

```java
getPayableAmount()
```

---

## 2. Class `Invoice`

Class `Invoice` digunakan untuk menyimpan data belanja karyawan.

### Attribute:

* `productName`
* `quantity`
* `pricePerItem`

### Fungsi:

Menghitung total harga barang:

```text
quantity × pricePerItem
```

---

## 3. Class `Employee`

Class `Employee` digunakan untuk menyimpan data karyawan.

### Attribute:

* `registrationNumber`
* `name`
* `salaryPerMonth`
* `Invoice[] invoices`

### Fungsi:

* Menghitung total belanja koperasi
* Menghitung gaji akhir setelah dipotong belanja

---

## 4. Class `Main`

Class `Main` digunakan untuk menjalankan program.

Fungsi:

* Membuat object invoice
* Membuat object employee
* Menampilkan data karyawan
* Menampilkan detail belanja

---

# 🧠 Konsep Interface

Program menggunakan interface `Payable` yang diimplementasikan oleh:

* `Invoice`
* `Employee`

Hal ini memungkinkan kedua class diperlakukan dalam satu tipe yang sama menggunakan konsep polimorfisme.

Contoh:

```java
Payable payable = invoice;
```

---

# ▶️ Cara Menjalankan Program

1. Compile semua file:

```bash
javac *.java
```

2. Jalankan class Main:

```bash
java Main
```

---

# 📋 Contoh Output

```text
=== DATA KARYAWAN ===
Nomor Registrasi : 101
Nama             : Jasmine
Gaji per Bulan   : 4500000
Total Belanja    : 234000
Gaji Akhir       : 4266000

=== DETAIL BELANJA ===

Nama Produk  : Minyak 1 Liter
Jumlah       : 3
Harga/item   : 20000
Total Harga  : 60000

Nama Produk  : Beras 5Kg
Jumlah       : 2
Harga/item   : 75000
Total Harga  : 150000

Nama Produk  : Gula 1 kg
Jumlah       : 1
Harga/item   : 24000
Total Harga  : 24000
```
