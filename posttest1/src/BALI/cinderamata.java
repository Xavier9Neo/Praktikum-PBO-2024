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
    void tampil(){
        System.out.println("Nama :" + this.namacdm);
        System.out.println("Jenis:" + this.jeniscdm);
        System.out.println("Harga :" + this.hargacdm);
    }
}
