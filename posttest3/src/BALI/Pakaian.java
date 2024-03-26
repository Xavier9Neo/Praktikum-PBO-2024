package BALI;

public class Pakaian extends cinderamata{
    private String IdPakaian;
    private String JenisPakaian;
    public Pakaian(String namacdm, int hargacdm ,String IdPakaian, String JenisPakaian){
        super(namacdm, hargacdm);
        this.IdPakaian = IdPakaian;
        this.JenisPakaian = JenisPakaian;
    }
    public String getIdPakaian() {
        return IdPakaian;
    }
        public String getJenisPakaian() {
        return JenisPakaian;
    }
    public void setIdPakaian(String idPakaian) {
        IdPakaian = idPakaian;
    }
    public void setJenisPakaian(String jenisPakaian) {
        JenisPakaian = jenisPakaian;
    }
    public void tampil(){
        System.out.println("Nama :" + this.namacdm);
        System.out.println("Harga :" + this.hargacdm);
    }
}
