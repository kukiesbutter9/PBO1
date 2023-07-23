package PBO;

//Class
public class Supermarket {
    //Atibut dan Encapsulation
    private String nama_barang;
    private String kode_barang;
    private String stok_barang;
    private String tanggal_pembuatan;

   //Construktor 
    public Supermarket(String nama_barang, String kode_barang, String stok_barang, String tanggal_pembuatan) {
        this.nama_barang = nama_barang;
        this.kode_barang = kode_barang;
        this.stok_barang = stok_barang;
        this.tanggal_pembuatan = tanggal_pembuatan;
    }

    //Mutator (Setter)
    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public void setKode_barang(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    public void setStok_barang(String stok_barang) {
        this.stok_barang = stok_barang;
    }

    public void setTanggal_pembuatan(String tanggal_pembuatan) {
        this.tanggal_pembuatan = tanggal_pembuatan;
    }

    //Accessoor (Getter)
    public String getNama_barang() {
        return nama_barang;
    }

    public String getKode_barang() {
        return kode_barang;
    }

    public String getStok_barang() {
        return stok_barang;
    }

    public String getTanggal_pembuatan() {
        return tanggal_pembuatan;
    }
    
    public String displayInfo(){
        return "Nama : "+getNama_barang() +"\nKode Barang : "+getKode_barang() +"\nStok Barang : "+getStok_barang() +"\nTanggal Pembuatan : "+getTanggal_pembuatan();
    }
    
    //Polymorphisme (overloading)
    public String displayInfo(String barang){
        return displayInfo() + "\nBarang : "+barang;
    }
}
