import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Fibonacci Serisinin E,leman sayısını Giriniz: ");
        int n = input.nextInt();


        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int toplam = a+b;
            a=b;
            b= toplam;

        }
    }
}