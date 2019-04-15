package inne;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        boolean stan = true;
        int wybranaOperacja = 0;
        Scanner odczyt = new Scanner(System.in);

        while (stan) {

            System.out.println("Wybierz:");
            System.out.println("0: Dodawanie");
            System.out.println("1: Odejmowanie");
            System.out.println("2: Mnożenie");
            System.out.println("3: Dzielenie");
            System.out.println("4: Reszta z dzielenia");
            System.out.println("5: Zakończ");

            try {
                wybranaOperacja = odczyt.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Błąd danych - Zakończono "
                        + "działanie.");
                stan = false;
            }

            if (wybranaOperacja > 5 || wybranaOperacja < 0) {
                System.err.println("Podana wartość nie odpowiada "
                        + "żadnej operacji.");
            }

            switch (wybranaOperacja) {

                case 0: {
                    System.out.println("DODAWANIE:");

                    try {
                        System.out.println("Podaj pierwszą liczbę:");
                        double x = odczyt.nextDouble();
                        System.out.println("Podaj drugą liczbę:");
                        double y = odczyt.nextDouble();

                        System.out.println(x + " + " + y + " = "
                                + (x + y));
                    } catch (InputMismatchException e) {
                        System.err.println("Błąd danych - Zakończono "
                                + "działanie.");
                        stan = false;
                    }

                    break;
                }

                case 1: {
                    System.out.println("ODEJMOWANIE:");

                    try {
                        System.out.println("Podaj pierwszą liczbę:");
                        double x = odczyt.nextDouble();
                        System.out.println("Podaj drugą liczbę:");
                        double y = odczyt.nextDouble();

                        System.out.println(x + " - " + y + " = "
                                + (x - y));
                    } catch (InputMismatchException e) {
                        System.err.println("Błąd danych - Zakończono "
                                + "działanie.");
                        stan = false;
                    }

                    break;
                }

                case 2: {
                    System.out.println("MNOZENIE:");

                    try {
                        System.out.println("Podaj pierwszą liczbę:");
                        double x = odczyt.nextDouble();
                        System.out.println("Podaj drugą liczbę:");
                        double y = odczyt.nextDouble();

                        System.out.println(x + " * " + y + " = "
                                + (x * y));
                    } catch (InputMismatchException e) {
                        System.err.println("Błąd danych - Zakończono "
                                + "działanie.");
                        stan = false;
                    }

                    break;
                }

                case 3: {
                    System.out.println("DZIELENIE:");

                    try {
                        System.out.println("Podaj pierwszą liczbę:");
                        double x = odczyt.nextDouble();
                        System.out.println("Podaj drugą liczbę:");
                        double y = odczyt.nextDouble();

                        System.out.println(x + " / " + y + " = "
                                + (x / y));
                    } catch (InputMismatchException e) {
                        System.err.println("Błąd danych - Zakończono "
                                + "działanie.");
                        stan = false;
                    }

                    break;
                }

                case 4: {
                    System.out.println("RESZTA Z DZIELENIA:");

                    try {
                        System.out.println("Podaj pierwszą liczbę:");
                        double x = odczyt.nextDouble();
                        System.out.println("Podaj drugą liczbę:");
                        double y = odczyt.nextDouble();
                        System.out.println(x + " % " + y + " = "
                                + (x % y));
                    } catch (InputMismatchException e) {
                        System.err.println("Błąd danych - Zakończono "
                                + "działanie.");
                        stan = false;
                    }

                    break;
                }

                case 5: {
                    System.out.println("KONIEC");

                    stan = false;
                    break;
                }
            }
        }
    }
}
