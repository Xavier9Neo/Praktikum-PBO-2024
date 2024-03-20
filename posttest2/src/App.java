// package posttest2;
// package BALI;
import BALI.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    static ArrayList<cinderamata> cdm  = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        while(true){
            System.out.println("========================");
            System.out.println("1. Tambah Cinderamata");
            System.out.println("2. Lihat Cinderamata");
            System.out.println("3. Ubah Cinderamata");
            System.out.println("4. Hapus Cinderamata");
            System.out.println("5. Keluar");
            System.out.println("========================"); 
            System.out.print("Pilih : ");  
            // int pilih = Integer.parseInt(br.readLine());

            String Menu = br.readLine();
            if (Menu.equals("1")){
                System.out.println("Masukkan Nama : ");
                String namacdm = br.readLine();
                System.out.println("Masukkan Jenis : ");
                String jeniscdm = br.readLine();
                System.out.println("Masukkan Harga : ");
                int hargacdm = Integer.parseInt(br.readLine());

                cinderamata newcdm = new cinderamata(namacdm, jeniscdm, hargacdm);
                cdm.add(newcdm);

                System.out.println("Data sudah berhasil ditambahkan!!");

            }else if (Menu.equals("2")) {
                for (int i = 0; i < cdm.size() ; i++){
                    System.out.println("Cinderamata ke - " + i);
                    cdm.get(i).tampil();
                    System.out.println("------------------");
                }
                
            }else if (Menu.equals("3")){
                for (int i = 0; i < cdm.size() ; i++){
                    cdm.get(i).tampil();
                    System.out.println("------------------");
                }
                System.out.println("Ingin mengubah data nomor berapa? : ");
                int ubah = Integer.parseInt(br.readLine());

                if (ubah <= cdm.size()){
                    System.out.println("Masukkan Nama Baru : ");
                    cdm.get(ubah).setnamacdm(br.readLine()); 
                    System.out.println("Masukkan Jenis Baru : ");
                    cdm.get(ubah).setjeniscdm(br.readLine()); 
                    System.out.println(" Masukkan Harga Baru :");
                    cdm.get(ubah).sethargacdm(Integer.parseInt(br.readLine())); 
                    System.out.println("Data sudah berhasil diubah");
                } else {
                    System.out.println("Data yang anda pilih tidak tersedia!!");
                }
            }else if (Menu.equals("4")){
                for (int i = 0; i < cdm.size() ; i++){
                    cdm.get(i).tampil();
                    System.out.println("------------------");
                }
                System.out.println("Hapus data no berapa? : ");
                int hapus = Integer.parseInt(br.readLine());
                cdm.remove(hapus);
                System.out.println("Data sudah berhasil dihapus!!");
            }else if (Menu.equals("5")){
                break;
            }else {
                System.out.println("Pilihan salah!!!");
            }
        }
    }
}