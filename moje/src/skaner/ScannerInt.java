package skaner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerInt {
    public static void main(String[] args)
    {
        int rokUrodzenia = 0;
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj rok urodzenia: ");

        try
        {
            rokUrodzenia = odczyt.nextInt();
            System.out.println("Rok urodzenia: " + rokUrodzenia);
        } catch(InputMismatchException e)
        {
            System.err.println("Niepoprawny format danych");
        }

        System.out.println("Dalsza część programu.");
    }
}
