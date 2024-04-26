package BALI;

public final class Pakaian extends cinderamata{
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

    @Override
    public void tampil() {
    System.out.println("Idpakaian: " + this.getIdPakaian());
    super.tampil();
    System.out.println("Jenis: " + this.getJenisPakaian());
    System.out.println("Harga: " + this.gethargacdm()); // Panggil gethargacdm() dari kelas induk
    }
}
