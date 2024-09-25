import java.util.Scanner;

public class siakad11 {
   
    public static void main(String[] args){

        //konfigurasi scanner
        Scanner inputan = new Scanner(System.in);

        //defining tipe data
        String nama,nim;//string data type untuk storing text
        char kelas;//char untuk storing satu karakter huruf/ASCII
        byte absen;//byte menyimpan angka dari -128 sd 127
        Double nilai_kuis, nilai_tugas, nilai_ujian,nilai_akhir;//double untuk menyimpan bilangan pecahan,dpt menyimpang hingga 1.7976931348623157E+308

        System.out.print("masukan nama : ");
        nama = inputan.nextLine();//nextLine utk ngambil string input

        System.out.print("Masukan NIM : ");
        nim = inputan.nextLine();

        System.out.print("masukan kelas : ");
        kelas = inputan.nextLine().charAt(0);

        System.out.print("Masukan Nomor Absen : ");
        absen = inputan.nextByte() ;//nextByte utk mengambil Byte input

        System.out.print("Masukan Nilai Quis : ");
        nilai_kuis = inputan.nextDouble();//nextDouble utk input dalam bentuk double

        System.out.print("masukan nilai tugas : ");
        nilai_tugas = inputan.nextDouble();

        System.out.print("masukan nilai ujian : ");
        nilai_ujian = inputan.nextDouble();

        inputan.close();

        nilai_akhir = (nilai_kuis + nilai_tugas + nilai_ujian)/3;

        System.out.print("Mahasiswa dengan nama "+nama +" "+"(NIM : "+nim+")");
        System.out.println(" "+"Kelas : " +kelas +" "+"Nomor Absen"+" " +absen);
        System.out.println("Nilai Akhir : " +nilai_akhir);

        if (nilai_akhir<=100 && nilai_akhir>80){
            System.out.println("Nilai Akhir Huruf :A");
            System.out.println("Kualifikasi : Sangat Baik");
        }

        else if (nilai_akhir<=80 && nilai_akhir>73){
            System.out.println("Nilai Akhir Huruf :B+");
            System.out.println("Kualifikasi : Lebih dari Baik");
        }

        else if (nilai_akhir<=73 && nilai_akhir>65){
            System.out.println("Nilai Akhir Huruf :B");
            System.out.println("Kualifikasi : Baik");
        }

        else if (nilai_akhir<=65 && nilai_akhir>60){
            System.out.println("Nilai Akhir Huruf :C+");
            System.out.println("Kualifikasi : Lebih dari cukup");
        }

        else if (nilai_akhir<=60 && nilai_akhir> 50){
            System.out.println("Nilai Akhir Huruf :C");
            System.out.println("Kualifikasi : Cukup");
        }

        else if (nilai_akhir<=50 && nilai_akhir>39){
            System.out.println("Nilai Akhir Huruf :D");
            System.out.println("Kualifikasi : Kurang");
        }

        else if (nilai_akhir<=39){
            System.out.println("Nilai Akhir Huruf :E");
            System.out.println("Kualifikasi : Gagal");
        }

        else{
            
        }


        
        

    










    }
}

