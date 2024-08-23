package pertemuanbuaul;

public class percobaan {
    public static void main(String[] args) {
        //stok
        int apel= 20;
        int jeruk= 30;
        int pisang=15;
        double harga_apel, harga_jeruk, harga_pisang;
        harga_apel = 5000;
        harga_jeruk = 3000;
        harga_pisang = 2000;
        double total, bayar;


        /*operator penugasan (pembelian yang mengurangi stok) */
        apel+=0;
        jeruk+=0;
        pisang+=0;
        /*operator Aritmatika (total barang tersedia) */
        total=apel+jeruk+pisang;

        /*operator Aritmatika (total harga) */
        bayar = (apel*harga_apel)+(jeruk*harga_jeruk)+(pisang*harga_pisang);

        System.out.println("jumlah barang yang tersedia =" +apel+ "+" +jeruk+ "+" +pisang+ "=" +total);
        System.out.println("Harga Total =" +bayar);















    

     
    
    }
    
}
