import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double boy,kilo,sonuc;

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Boyunuzu Metre cinsinden Giriniz");
       boy=input.nextDouble();
        System.out.println("Lutfen Kilonuzu Giriniz");
        kilo=input.nextInt();


        sonuc=kilo/(boy*boy);
        System.out.println("Vucut Kitle Indeksiniz:"+sonuc);


    }
}