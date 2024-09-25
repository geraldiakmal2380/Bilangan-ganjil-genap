import java.util.Scanner;

public class Kafe11 {
    public static void main(String[] args) {
        Scanner mlebu = new Scanner(System.in);

        String menu;
        char ukurancup;
        int jumlah;
        boolean keanggotaan;


        System.out.print("Masukan menu : ");
        menu = mlebu.nextLine();

        System.out.print("Masukan ukuran cup(S/M/L) : ");
        ukurancup = mlebu.nextLine().charAt(0);

        System.out.print("Masukan Jumlah : ");
        jumlah = mlebu.nextInt();

        System.out.print("Masukan Keanggotaan (True/False) : ");
        keanggotaan = mlebu.nextBoolean();

        mlebu.close();//mencegah resorce leak dan meningkatkan performa

        double hargamenu = 0;

        switch (menu.toLowerCase()) {
            case "kopi":
                hargamenu = 12000;
                break;
            case "teh":
                hargamenu = 7000;
                break;
            case "coklat":
                hargamenu = 20000;
                break;
           
        }

        double totalharga = hargamenu * jumlah;


        switch (ukurancup) {
            case 'S','s':
                break;
            case 'M','m':
                totalharga += totalharga*0.25;
                break;
            case 'L','l':
                totalharga += totalharga*0.4;
                break;
            default :
                System.out.println("Maaf tidak ukuran yang dipilih tidak tersedia");
                break;
        }

        double diskon = keanggotaan ? 0:0.1;
        double nominalbayar = totalharga - (diskon*totalharga);

        System.out.println("Item Pembelian : "+jumlah+" "+menu+" dengan ukuran cup "+ukurancup);
        System.out.println("Nominal bayar : "+nominalbayar);
    }

}
