package BALI;
// package posttest2;
public abstract class cinderamata{
    protected String namacdm; 
    protected int hargacdm;

    public cinderamata(String namacdm, int hargacdm) {
        this.namacdm = namacdm;
        this.hargacdm = hargacdm;
    }

    // Bagian Getter
    public int gethargacdm() {
        return hargacdm; 
    } 
    
    public String getnamacdm() {
        return namacdm;
    }  
    // Bagian Setter
    public void setnamacdm(String namacdm) {
        this.namacdm = namacdm;
    }
    
    public void sethargacdm(int hargacdm) {
        this.hargacdm = hargacdm;
    }

    public void tampil(){
        System.out.println("Nama :" + this.namacdm);
    }        
}