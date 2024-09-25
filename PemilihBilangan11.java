//mengimpor modul scanner
import java.util.Scanner;


class PemilihanBilangan11{
    public static void main(String[] args) {
        //konfigurasi scanner
        Scanner inputan = new Scanner(System.in);

        //mulai eksekusi program
        System.out.print("Masukan Angka : ");
        int angka = inputan.nextInt();

        inputan.close();//mencegah resorce leak dan meningkatkan performa

        if (angka%2 == 0){
            System.out.println("Angka"+angka+"Termasuk Bilangan genap");
        }

        else {
            System.out.print("Angka "+angka+" Termasuk Bilangan Ganjil");
        }
        

    }
}