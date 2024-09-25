import java.util.Scanner;


public class a {
    public static void main(String[] args) {
        Scanner mlebu = new Scanner(System.in);
 
        System.out.print("MAsukan Angka : ");
        int a = mlebu.nextInt();
        mlebu.close();
        switch (a) {
            case 1:
                System.out.println("ini angka 1");
                break;

            case 2:
                System.out.println("ini angka 2");
                break;
        
            default:
                break;
        }
      }
    }



