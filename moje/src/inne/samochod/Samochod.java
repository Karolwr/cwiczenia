package inne.samochod;

public class Samochod {
    String marka;
    String model;
    String kolor;
    int moc;

    public Samochod(String marka, String model, String kolor, int moc)
    {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
        this.moc = moc;
    }

    public Samochod(String marka, String model, String kolor)
    {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
        this.moc = 0;
    }

    public Samochod(String marka, String model)
    {
        this.marka = marka;
        this.model = model;
        this.kolor = null;
        this.moc = 0;
    }

    public Samochod(String marka)
    {
        this.marka = marka;
        this.model = null;
        this.kolor = null;
        this.moc = 0;

    }
}
