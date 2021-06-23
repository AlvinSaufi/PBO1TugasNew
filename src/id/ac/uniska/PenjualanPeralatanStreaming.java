package id.ac.uniska;

public class PenjualanPeralatanStreaming {
    private int id;
    private String namaPembeli;
    private String email;
    private String noTelp;
    private String alamat;
    private String namaBarang;
    private int jumlahBarangDibeli;
    private int harga;

    public void menjualBarang() {
        System.out.println("Penjual menjual Barang");
    }

    public void melayaniPembeli(){

    }
    public void menawarkanBarang(){

    }
    public void memberiDiskon(){

    }

    public PenjualanPeralatanStreaming() {
    }

    public PenjualanPeralatanStreaming(int id, String namaPembeli, String email, String noTelp, String alamat, String namaBarang, int jumlahBarangDibeli, int harga) {
        this.id = id;
        this.namaPembeli = namaPembeli;
        this.email = email;
        this.noTelp = noTelp;
        this.alamat = alamat;
        this.namaBarang = namaBarang;
        this.jumlahBarangDibeli = jumlahBarangDibeli;
        this.harga = harga;
    }

    public PenjualanPeralatanStreaming(int id, String namaPembeli, String email) {
        this.id = id;
        this.namaPembeli = namaPembeli;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getJumlahBarangDibeli() {
        return jumlahBarangDibeli;
    }

    public void setJumlahBarangDibeli(int jumlahBarangDibeli) {
        this.jumlahBarangDibeli = jumlahBarangDibeli;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}