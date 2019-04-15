package skaner;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args)
    {
        double liczbaDouble = 0.0;
        boolean stan = false;

        Scanner odczyt = new Scanner(System.in);

        System.out.println("Podaj dowloną liczbę" +
                " zmiennoprzecinkową: ");
        liczbaDouble = odczyt.nextDouble();

        System.out.println("Podaj wartość boolean: ");
        stan = odczyt.nextBoolean();

        System.out.println("Podałeś liczbę zmiennoprzecinkową: "
                + liczbaDouble);
        System.out.println("Podałeś boolean: " + stan);

    }
}
