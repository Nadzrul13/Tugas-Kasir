package TugasKasir.Nadzrul;

public class Menu {
    private int harga[] = {10000, 15000, 12000};

    public void TampilMenu() {
        // harga produk

        //nama produk
        String[] NamaProduk = new String[3]; // total penyimpanan produk
        NamaProduk[0] = "Nasi Goreng ";
        NamaProduk[1] = "Bakmi";
        NamaProduk[2] = "Kwietiau";

        System.out.println("================= MENU ==================");
        System.out.println("=========================================");
        System.out.println("1. "+NamaProduk[0]+" || harga : "+harga[0]); // nilai array di mulai dari 0
        System.out.println("2. "+NamaProduk[1]+" \t\t|| harga : "+harga[1]);
        System.out.println("3. "+NamaProduk[2]+" \t|| harga : "+harga[2]);
        System.out.println(" - - - - - 0 to check out - - - - - - - -");
        System.out.println("=========================================");
    }

    public int[] getHarga() {
        return harga;
    }

}
