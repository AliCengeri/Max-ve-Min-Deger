import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] list = {20, 10, 50, 60, 40};
        Scanner input = new Scanner(System.in);
        int min = 0;
        int max = Integer.MAX_VALUE;
        System.out.print("Bir sayı giriniz: ");
        int deger = input.nextInt();
        for (int i : list){
            if (i < deger && i > min){
                min = i;
            }
        }
        for (int i : list){
            if (i > deger && i < max){
                max = i;
            }
        }
        System.out.println("Girilen sayı: " + deger);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);
    }
}