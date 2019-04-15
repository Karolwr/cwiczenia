package skaner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerFinally {
    public static void main(String[] args)
    {
        int [] liczby = {32, 14, 421, 15, 9};
        int index = 0;
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj index tablicy: ");

        try
        {
            index = odczyt.nextInt();
            System.out.println(liczby[index]);
        } catch(InputMismatchException e)
        {
            System.err.println("Błąd: Wymagana liczba całkowita.");
        } catch(ArrayIndexOutOfBoundsException e)
        {
            System.err.println("Błąd: Indeks poza zakresem");
        } finally
        {
            System.out.println("Zawartość tego bloku wykonuje się zawsze.");
        }

        System.out.println("Dalsza część programu.");
    }
}
