package inne.samochod.car1;

class Car1
{
    String marka;
    String model;
    String kolor;
    int moc;

    // KONSTRUKTOR
    public Car1(String marka, String model, String kolor, int moc)
    {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
        this.moc = moc;
    }

    // METODY
    public void wyswietlKolor()
    {
        System.out.println(this.kolor);
    }

    public void zmienMoc(int nowaMoc)
    {
        this.moc = nowaMoc;
        System.out.println("Nowa moc wynosi:" + this.moc);
    }

    public String zwrocMarke()
    {
        return this.marka;
    }

    public void wyswietlInformacje()
    {
        System.out.println("Marka:" + this.marka);
        System.out.println("Model:" + this.model);
        System.out.println("Kolor:" + this.kolor);
        System.out.println("Moc:" + this.moc);
    }
}
