# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Supermarket`, `SupermarketJualan`, dan `DetailBarang` adalah contoh dari class.

```bash
public class Supermarket {
    ...
}

public class SupermarketJualan {
    ...
}

public class MahasiswaDetail extends Mahasiswa {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `brg[i] = new DetailBarang(namaBrg, kodeBrg, stokBrg, tglPembuatan);` adalah contoh pembuatan object.

```bash
brg[i] = new DetailBarang(namaBrg, kodeBrg, stokBrg, tglPembuatan);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama_barang` , `kode_barang` , 'stok_barang' , 'tanggal_pembuatan' adalah contoh atribut.

```bash
String nama_barang;
String kode_barang;
String stok_barang;
String tanggal pembuatan;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Supermarket` dan `SupermarketJualan`.

```bash
public Mahasiswa(String nama_barang, String kode_barang, String stok_barang, String tanggal_pembuatan) {
    this.nama_barang = nama;
    this.kode_barang = kode;
    this.stok_barang = stok;
    this.tanggalpembuatan = tanggalPembuatan;
}

public Supermarket(String nama_barang, String kode_barang, String stok_barang, String tanggal_pembuatan) {
    super(nama, kode, stok, tanggalPembuatan;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNpm` adalah contoh method mutator.

```bash
public void setNama(String nama_barang) {
    this.nama = nama;
}

public void setkodeBrg(String kode_barang) {
    this.kodeBrg = kodeBrg;
}

public void setstokBrg(String stok_barang) {
    this.stokBrg = stokBrg;
}

public void settglPembuatan(String tanggal_pembuatan) {
    this.tglPembuatan = tglPembuatan;
}

```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `gettglBrg`, `getblnBrg`, `getthnBrg` adalah contoh method accessor.

```bash
public String gettglBrg() {
    return tanggal;
}

public String getblnBrg() {
    return bulan;
}

public String getthnBrg() {
    return tahun;
}

```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namaBrg` dan `kodeBrg` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String namaBrg;
private String kodeBrg;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `SupermarketJualan` mewarisi `Supermarket` dengan sintaks `extends`.

```bash
public class SupermarketJualan extends Supermarket {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mahasiswa` merupakan overloading method `displayInfo` dan `displayInfo` di `SupermarketJualan` merupakan override dari method `displayInfo` di `Supermarket`.

```bash
public String displayInfo(String kodeBrg) {
    return displayInfo() + "\nKode Barang: " + kodeBrg;
}

@Override
public String displayInfo() {
    ...
}
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `SuermaketJulan[] brg = new SupermarketJualan[2];` adalah contoh penggunaan array.

```bash
SuermaketJulan[] brg = new SupermarketJualan[2];
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    0    |
| 11  | Perulangan     |    0    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |    0    |
|     | **TOTAL**      | **75**  |

## Pembuat

Nama: Muhammad Ridho
NPM: 211001000464
