package PBO;

import java.util.Scanner;

public class SupermarketJualan {
     public static void main(String[] args){
        //Objek
        //Supermarket nama = new Supermarket("Oreo","01200723","10","12 Juli 2023");
        
        //System.out.println(nama.displayInfo());
        //System.out.println(nama.displayInfo("Oreo"));
        
        //io sederhana
        Scanner scanner = new Scanner(System.in);
        
        //array
        DetailBarang[] brg = new DetailBarang[2];
        
        System.out.println("Masukkan Nama Barang : ");
        String nama = scanner.nextLine();
        System.out.println("Masukkan Kode Barang : ");
        String kodeBrg = scanner.nextLine();
        System.out.println("Masukkan Stok Barang : ");
        String stokBrg = scanner.nextLine();
        System.out.println("Masukkan Tanggal Pembuatan : ");
        String tglPembuatan = scanner.nextLine();
        
        //objek
        brg[0] = new DetailBarang(nama, kodeBrg, stokBrg, tglPembuatan);
        
        System.out.println(brg[0].displayInfo());
        
        
     }
    
}
