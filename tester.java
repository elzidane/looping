import java.util.Scanner;

public class tester{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //buat looping untung mengulang membuat objek cd atau dvd
        System.out.println("Berapa objek yang akan dibuat? ");
        int jumlah = in.nextInt();
        System.out.println("CD Atau DVD? ");
        String pilihan = in.next();
        
        //kondisi
       

        for (int i = 1; i <= jumlah; i++) {
            System.out.println(i);

            if(pilihan.equals("CD")){
                cd c1 = new cd();
                c1.print();
            }else if(pilihan.equals("DVD")){
                dvd d1 = new dvd();
            d1.print();
            }else{
                System.out.println("Input salah");
            }
        }
        in.close();
    }
} 