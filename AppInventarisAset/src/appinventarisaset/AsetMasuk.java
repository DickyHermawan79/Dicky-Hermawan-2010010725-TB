package appinventarisaset;


public class AsetMasuk {
    int kode;
    String nama;
    int jumlah;
    String tanggal;
    String kategori;
    
    public AsetMasuk(){
        
    }

    public AsetMasuk(int kode, String nama, int jumlah, String tanggal, String kategori) {
        this.kode = kode;
        this.nama = nama;
        this.jumlah = jumlah;
        this.tanggal = tanggal;
        this.kategori = kategori;
    }

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
    
    
}
