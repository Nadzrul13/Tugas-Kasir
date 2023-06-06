package TugasKasir.Nadzrul;
import java.util.Scanner;

public class KasirWarungAmal {
    public static void main(String[] args) {

        //part object
        Menu menu = new Menu();
        Kasir kasir = new Kasir();
        Pelanggan pelanggan = new Pelanggan(null,null); // set ass default - to skip = enter


        //scanner
        Scanner input = new Scanner(System.in);

        //part variabel
        int PilihMenu;
        String[] NamaProduk = new String[3]; // total nyimpan nama produk
        NamaProduk[0] = "Nasi Goreng ";
        NamaProduk[1] = "Bakmi";
        NamaProduk[2] = "Cwie Mie";

        System.out.print("masukan nama depan : ");
        String NamaDepan = input.nextLine();
        pelanggan.setNamaDepan(NamaDepan); //to skip = enter

        System.out.print("masukan nama belakang : ");
        String NamaBelakang = input.nextLine();
        pelanggan.setNamaBelakang(NamaBelakang); //to skip = enter

        menu.TampilMenu(); // menampilkan bagian menu

        do {
            System.out.print("Pilih menu : ");
            PilihMenu = input.nextInt();
            switch (PilihMenu) {
                case 1:{
                    PilihMenu--;
                    System.out.println(NamaProduk[PilihMenu]+" || harga : "+menu.getHarga()[PilihMenu]);
                    System.out.print("masukan Jumlah : ");
                    int jumlah = input.nextInt();
                    kasir.setTotalHarga(jumlah * menu.getHarga()[PilihMenu]);
                    int Pesan = jumlah * menu.getHarga()[PilihMenu];
                    System.out.println("Harga : "+Pesan);
                    PilihMenu++;
                    break;
                }
                case 2:{
                    PilihMenu--;
                    System.out.println(NamaProduk[PilihMenu]+" || harga : "+menu.getHarga()[PilihMenu]);
                    System.out.print("masukan Jumlah : ");
                    int jumlah = input.nextInt();
                    kasir.setTotalHarga(jumlah * menu.getHarga()[PilihMenu]);
                    int Pesan = jumlah * menu.getHarga()[PilihMenu];
                    System.out.println("Harga : "+Pesan);
                    PilihMenu++;
                    break;
                }
                case 3:{
                    PilihMenu--;
                    System.out.println(NamaProduk[PilihMenu]+" || harga : "+menu.getHarga()[PilihMenu]);
                    System.out.print("masukan Jumlah : ");
                    int jumlah = input.nextInt();
                    kasir.setTotalHarga(jumlah * menu.getHarga()[PilihMenu]);
                    int Pesan = jumlah * menu.getHarga()[PilihMenu];
                    System.out.println("Harga : "+Pesan);
                    PilihMenu++;
                    break;
                }
                case 0:{
                    break;
                }
                default:{
                    System.out.println("menu tidak tersedia");
                    break;
                }
            }
        } while (PilihMenu != 0); // while PilihMenu != (tidak sama dengan) 0 program akan terus berulang


        System.out.println("total harga : "+kasir.getTotalHarga()); // total harga dari pesanan

        System.out.println("=========================================");

        System.out.print("masukan pembayaran : ");
        int Pembayaran = input.nextInt();

        System.out.println("=========================================");

        if (Pembayaran < kasir.getTotalHarga()) {
            System.out.println("uang anda kurang kak "+pelanggan.getNamaLengkap()+ "\tterimakasih, pesanan anda gagal :) jgn protes ");
        } else {
            int kembalian;
            kembalian = Pembayaran - kasir.getTotalHarga();
            System.out.println("terimakasih sudah memesan di kedai kami kak "+pelanggan.getNamaLengkap()+" ini kembalian mu : "+kembalian);
   }


    }

}