package skaner;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args)
    {
        int liczba = 0;
        Scanner odczyt = new Scanner(System.in);

        System.out.println("Podaj dowloną liczbę: ");
        liczba = odczyt.nextInt();
        System.out.println("Podałeś liczbę: " + liczba);
    }
}
