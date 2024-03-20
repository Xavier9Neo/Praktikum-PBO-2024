package BALI;
// package posttest2;
public class cinderamata{
    private String namacdm; 
    private String jeniscdm;
    private int hargacdm;

    public cinderamata(String namacdm, String jeniscdm, int hargacdm) {
        this.namacdm = namacdm;
        this.jeniscdm = jeniscdm;
        this.hargacdm = hargacdm;
    }

    // Bagian Getter
    public int gethargacdm() {
        return hargacdm;
    }
    public String getjeniscdm() {
        return jeniscdm;
    }
    public String getnamacdm() {
        return namacdm;
    }
    // Bagian Setter
    public void setnamacdm(String namacdm) {
        this.namacdm = namacdm;
    }
    public void setjeniscdm(String jeniscdm) {
        this.jeniscdm = jeniscdm;
    }
    public void sethargacdm(int hargacdm) {
        this.hargacdm = hargacdm;
    }

    public void tampil(){
        System.out.println("Nama :" + this.namacdm);
        System.out.println("Jenis:" + this.jeniscdm);
        System.out.println("Harga :" + this.hargacdm);
    }
}