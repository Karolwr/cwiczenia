package inne.samochod.car2;

public class MainSamochod {
    public static void main(String[] args) {
        Samochod mojPierwszySamochod = new Samochod("Ferrari", "250GTO", "czerwony", 300);
        Samochod mojDrugiSamochod = new Samochod("Ferrari", "ENZO", "czerwony", 650);
        Samochod mojTrzeciSamochod = new Samochod("Ferrari", "250GTO", "czerwony", 800);

        //wywołanie metody statycznej
        Samochod.wyswietlIloscObiektow();

    }
}
