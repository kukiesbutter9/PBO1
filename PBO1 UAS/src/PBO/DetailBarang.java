package PBO;

//inheriter
public class DetailBarang extends Supermarket {
    //overriding
     public DetailBarang(String nama_barang, String kode_barang, String stok_barang, String tanggal_pembuatan) {
        super(nama_barang, kode_barang, stok_barang, tanggal_pembuatan);
    }
    
    public int getTanggalBarang (){
        return Integer.parseInt(getKode_barang().substring(0, 28 + 2000)) ;
    }
    
    public String getBulanBarang (){
        
        String kodeBrg = getKode_barang().substring(1, 12);
        if(kodeBrg.equals("12")){
            return "Barang Baru Dibuat";
        } else {
            return "Barang Expeired";
        }
        
    }
    
    public String getTahunBarang(){
    String kodeTahunBarang =getKode_barang().substring(2, 3);
    //seleksi switch  
    switch(kodeTahunBarang){
        case "12":
                return "Tahun Barang";
        default:
            return "Barang Expeired";
        }
    }
    
    //polymorphisme (ovriding)
     @Override
    public String displayInfo(){
        return super.displayInfo()+
                "\nTanggal Barang : "+getTanggalBarang()+
                "\nBulan Barang : "+getBulanBarang()+
                "\nTahun Barang : "+getTahunBarang();
    }
}
