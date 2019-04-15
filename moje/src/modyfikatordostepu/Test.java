package modyfikatordostepu;

class Test {
    public String tekst;
    private int liczba;

    public void setLiczba(int liczba) {
        this.liczba = liczba;
    }
    private void prywatnaMetoda() {
        System.out.println("To jest prywatna metoda.");
    }
    public void wywolajPrywatnaMetode() {
        prywatnaMetoda();
    }
}