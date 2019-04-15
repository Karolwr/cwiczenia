package inne.samochod;

class Car {

    //pole statyczne
    static int iloscObiektow;
    String marka;
    String model;
    String kolor;
    int moc;

    // KONSTRUKTOR
    public Car(String marka, String model, String kolor, int moc) {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
        this.moc = moc;

        iloscObiektow++;
    }

    // METODA STATYCZNA
    public static void wyswietlIloscObiektow() {
        System.out.println(iloscObiektow);
    }

    // METODY
    public void wyswietlKolor() {
        System.out.println(this.kolor);
    }

    public void zmienMoc(int nowaMoc) {
        this.moc = nowaMoc;
        System.out.println("Nowa moc wynosi:" + this.moc);
    }

    public String zwrocMarke() {
        return this.marka;
    }

    public void wyswietlInformacje() {
        System.out.println("Marka:" + this.marka);
        System.out.println("Model:" + this.model);
        System.out.println("Kolor:" + this.kolor);
        System.out.println("Moc:" + this.moc);
    }
    public static void main(String[] args) {
        Car mojPierwszySamochod = new Car("Ferrari", "250GTO", "czerwony", 300);
        Car mojDrugiSamochod = new Car("Ferrari", "ENZO", "czerwony", 650);
        Car mojTrzeciSamochod = new Car("Ferrari", "250GTO", "czerwony", 800);

        //wywołanie metody statycznej
        Car.wyswietlIloscObiektow();
    }
}

