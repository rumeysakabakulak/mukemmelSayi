import java.util.Scanner;
public class mukemmelSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        int sayi = inp.nextInt();
        int toplam = 0;

        for (int i = 1; i < sayi; i++ ) {
            if (sayi % i == 0)
                toplam += i;
        }
        if ( toplam == sayi){
            System.out.print( sayi + " Mükemmel Sayıdır");
        }else{
            System.out.print(sayi + " Mükemmel Sayı Değildir");
        }

    }
}
