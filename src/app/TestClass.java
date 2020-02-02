package app;

import java.util.Locale;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        int[] intTable = new int[5];

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        for(int i = 0; i<5; i++){
            System.out.println("Podaj liczbe calkowita - wszystko po przecinku będzie usunięte:");
            intTable[i] = (int)scanner.nextDouble();
            scanner.nextLine();
        }

        System.out.println("Suma pierwszej, trzeciej i piątej liczby to - ");
        System.out.print(intTable[0] + intTable[2] + intTable[4]);
    }
}
