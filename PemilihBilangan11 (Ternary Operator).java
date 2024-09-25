//mengimpor modul scanner
import java.util.Scanner;


class PemilihanBilangan11{
    public static void main(String[] args) {
        //konfigurasi scanner
        Scanner inputan = new Scanner(System.in);

        //mulai eksekusi program
        System.out.print("Masukan Angka : ");
        int angka = inputan.nextInt();

        //Java Short Hand If...Else (Ternary Operator)
        String hasilbilangan = (angka%2 == 0 ) ? "Merupakan Bilangan genap" : "Merupakan Bilangan ganjil";
        System.out.print("angka "+angka+" "+hasilbilangan);
    }
}