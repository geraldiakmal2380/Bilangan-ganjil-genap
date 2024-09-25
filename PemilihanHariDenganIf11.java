import java.util.Scanner;

public class PemilihanHariDenganIf11 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        
        System.out.print("Masukan Hari dalam angka 1-7 : ");
        int Dayname = inputan.nextInt();
        
        inputan.close();//mencegah resorce leak dan meningkatkan performa

        if (Dayname >=1 &&  Dayname <= 5){
            System.out.print("Weekday");
        }

        else if (Dayname >=6 && Dayname <=7){
            System.err.print("Weekend");
        }
        else {
            System.err.println("invalid number");
        }
        

        
    }
}   
