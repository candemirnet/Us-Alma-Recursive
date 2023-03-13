import java.util.Scanner;
public class Main {
    static int power(int a, int b){
        if (a ==1){
            return 1;
        } else if (b == 1) {
            return a;
        } else{
            return (a*power(a, (b-1)));
        }
    }
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        System.out.print("Taban Değerini Giriniz: ");
        int taban = imp.nextInt();
        System.out.print("Üs Değerini Giriniz: ");
        int kuvvet = imp.nextInt();
        int sonuc = power(taban,kuvvet);
        System.out.print("Sonuç: " + sonuc);
    }
}