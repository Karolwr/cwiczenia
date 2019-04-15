package tablice;

public class PetlaWhile {
    public static void main(String[] args) {
        boolean stan = true;
        int licznik = 0;

        while (stan) {
            licznik = licznik+4;
            System.out.println(licznik);

            if (licznik > 5) {
                stan = false;
            }
        }
    }
}

