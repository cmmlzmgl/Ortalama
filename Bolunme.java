import java.util.Scanner;

public class Bolunme {
    public static void main(String[] args){

        int sum = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz: ");
        int sayi = input.nextInt();

        for (int i = 0; i<=sayi; i++)
        {
            if( i%3 == 0 && i%4 == 0)
            {
                sum +=i;
                count++;
            }
        }
        System.out.print("Ortalama: "+ (sum / count));
    }
}
