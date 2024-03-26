// package posttest2;
// package BALI;
import BALI.*;
import java.util.*;
import java.io.*;

public class App {
    static Scanner enter = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        ArrayList<Pakaian> pkn  = new ArrayList<>();
        ArrayList<Alat> alt  = new ArrayList<>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        while(true){
            System.out.println("========================");
            System.out.println("=========PAKAIAN========");
            System.out.println("========================");
            System.out.println("1. Lihat Pakaian");
            System.out.println("2. Tambah Pakaian");
            System.out.println("3. Ubah Pakaian");
            System.out.println("4. Hapus Pakaian");
            System.out.println("========================");
            System.out.println("==========Alat==========");
            System.out.println("========================");
            System.out.println("5. Lihat Alat");
            System.out.println("6. Tambah Alat");
            System.out.println("7. Ubah Alat");
            System.out.println("8. Hapus Alat");
            System.out.println("========================"); 
            System.out.println("9. Keluar");
            System.out.println("========================"); 
            System.out.print("Pilih : ");  
            String Menu = br.readLine();
            if (Menu.equals("1")){
                System.out.println("==========              =========="); 
                System.out.println("========== Data Pakaian ==========");
                System.out.println("==========              =========="); 
                    for (int i = 0; i < pkn.size(); i++) {
                        Pakaian kain = pkn.get(i);
                        System.out.println("Id : " +  kain.getIdPakaian());
                        System.out.println("Nama Pakaian : " + kain.getnamacdm());
                        System.out.println("Jenis Pakaian : " + kain.getJenisPakaian());
                        System.out.println("Harga : Rp. " + kain.gethargacdm());
                        System.out.println("=========================================");
                    }
                enter.nextLine();
            }else if (Menu.equals("2")) {
                String IdPakaian = "No 0" + pkn.size() + 1;
                System.out.println("Masukkan Nama Pakaian : ");
                String namacdm = br.readLine();
                System.out.println("Masukkan Jenis Pakaian : ");
                String JenisPakaian = br.readLine();
                System.out.println("Harga : ");
                int hargacdm = Integer.parseInt(br.readLine());
                Pakaian kain = new Pakaian(namacdm, hargacdm, IdPakaian, JenisPakaian);
                pkn.add(kain);
                System.out.println("Data Berhasil Ditambahkan");
                enter.nextLine();
            }else if (Menu.equals("3")){
                for (int i = 0; i < pkn.size() ; i++){
                    pkn.get(i).tampil();
                    System.out.println("------------------");
                }
                System.out.println("Ingin mengubah data nomor berapa? : ");
                int ubah = Integer.parseInt(br.readLine());
                if (ubah <= pkn.size()){
                    System.out.println("Masukkan Nama Baru : ");
                    pkn.get(ubah).setnamacdm(br.readLine()); 
                    System.out.println("Masukkan Jenis Baru : ");
                    pkn.get(ubah).setJenisPakaian(br.readLine()); 
                    System.out.println(" Masukkan Harga Baru :");
                    pkn.get(ubah).sethargacdm(Integer.parseInt(br.readLine())); 
                    System.out.println("Data sudah berhasil diubah");
                    enter.nextLine();
                } else {
                    System.out.println("Data yang anda pilih tidak tersedia!!");
                    enter.nextLine();
                }
            }else if (Menu.equals("4")){
                for (int i = 0; i < pkn.size() ; i++){
                    pkn.get(i).tampil();
                    System.out.println("------------------");
                }
                System.out.println("Hapus data no berapa? : ");
                int hapus = Integer.parseInt(br.readLine());
                pkn.remove(hapus);
                System.out.println("Data sudah berhasil dihapus!!");
                enter.nextLine();
            }else if (Menu.equals("5")){
                System.out.println("==========           =========="); 
                System.out.println("========== Data Alat ==========");
                System.out.println("==========           =========="); 
                    for (int i = 0; i < alt.size(); i++) {
                        Alat bnd = alt.get(i);
                        System.out.println("Id : " +  bnd.getIdAlat());
                        System.out.println("Nama Alat : " + bnd.getnamacdm());
                        System.out.println("Jenis Alat : " + bnd.getJenisAlat());
                        System.out.println("Harga : Rp. " + bnd.gethargacdm());
                        System.out.println("=========================================");
                    }
                enter.nextLine();
            }else if (Menu.equals("6")) {
                String IdAlat = "No 0" + alt.size() + 1;
                System.out.println("Masukkan Nama Alat : ");
                String namacdm = br.readLine();
                System.out.println("Harga : ");
                int hargacdm = Integer.parseInt(br.readLine());
                System.out.println("Masukkan Jenis Pakaian : ");
                String JenisAlat = br.readLine();
                Alat la = new Alat(namacdm, hargacdm, IdAlat, JenisAlat);
                alt.add(la);
                System.out.println("Data Berhasil Ditambahkan");
                enter.nextLine();
            }else if (Menu.equals("7")){
                for (int i = 0; i < alt.size() ; i++){
                    alt.get(i).tampil();
                    System.out.println("------------------");
                }
                System.out.println("Ingin mengubah data nomor berapa? : ");
                int ubah1 = Integer.parseInt(br.readLine());
                if (ubah1 <= alt.size()){
                    System.out.println("Masukkan Nama Baru : ");
                    alt.get(ubah1).setnamacdm(br.readLine()); 
                    System.out.println("Masukkan Jenis Baru : ");
                    alt.get(ubah1).setJenisAlat(br.readLine()); 
                    System.out.println(" Masukkan Harga Baru :");
                    alt.get(ubah1).sethargacdm(Integer.parseInt(br.readLine())); 
                    System.out.println("Data sudah berhasil diubah");
                    enter.nextLine();
                } else {
                    System.out.println("Data yang anda pilih tidak tersedia!!");
                    enter.nextLine();
                }
            }else if (Menu.equals("8")){
                for (int i = 0; i < alt.size() ; i++){
                    alt.get(i).tampil();
                    System.out.println("------------------");
                }
                System.out.println("Hapus data no berapa? : ");
                int hapus1 = Integer.parseInt(br.readLine());
                alt.remove(hapus1);
                System.out.println("Data sudah berhasil dihapus!!");
                enter.nextLine();
            }else if (Menu.equals("9")){
                break;
            }else {
                System.out.println("Pilihan salah!!!");
                enter.nextLine();
            }
        }
    }
}