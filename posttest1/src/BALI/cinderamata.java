// package BALI;
// package posttest1;
public class cinderamata{
    String namacdm, jeniscdm;
    int hargacdm;

    public cinderamata(String jeniscdm,String namacdm,int hargacdm){
        this.namacdm = namacdm;
        this.jeniscdm = jeniscdm;
        this.hargacdm = hargacdm;
    }
    // public String getjeniscdm() {
    //     return jeniscdm;
    // }
    // public int gethargacdm() {
    //     return hargacdm;
    // }
    // public String getnamacdm() {
    //     return namacdm;
    // }
    // public void setjeniscdm(String jeniscdm) {
    //     jeniscdm = Jeniscdm;
    // }
    // public void setnamacdm(String namacdm) {
    //     namacdm = namacdm;
    // }
    // public void sethargacdm(int hargacdm) {
    //     hargacdm = hargacdm;
    // }
    void tampil(){
        System.out.println("Nama :" + this.namacdm);
        System.out.println("Jenis:" + this.jeniscdm);
        System.out.println("Harga :" + this.hargacdm);
    }
}