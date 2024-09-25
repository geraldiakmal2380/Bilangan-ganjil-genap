import java.util.Scanner;

public class PemilihanHari11 {

    public static void main(String[] args) {
            //konfigurasi scanner
            Scanner inputan = new Scanner(System.in);

            String Daytype,Dayname;

            System.out.print("masukan nama hari di Bahasa Inggris : ");
            Dayname = inputan.nextLine();

            switch (Dayname.toLowerCase()) {
                case "monday":
                case "tuesday":
                case "wenesday":
                case "thursday":
                case "friday":

                    Daytype = "weekday";
                    
                    break;
                case "saturday":
                case "sunday" :
                    Daytype = "weekend";
                    break;

                default:
                    Daytype = "Invalid day name";
                    break;
            }

            System.out.println(Dayname+" is a "+Daytype);
    }
    
}
