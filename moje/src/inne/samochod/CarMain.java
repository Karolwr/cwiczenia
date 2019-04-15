package inne.samochod;

public class CarMain {
    public static void main(String[] args) {
        Car mojPierwszySamochod = new Car("Ferrari", "250GTO", "czerwony", 300);
        Car mojDrugiSamochod = new Car("Ferrari", "ENZO", "czerwony", 650);
        Car mojTrzeciSamochod = new Car("Ferrari", "250GTO", "czerwony", 800);

        //wywołanie metody statycznej
        Car.wyswietlIloscObiektow();
    }
}
