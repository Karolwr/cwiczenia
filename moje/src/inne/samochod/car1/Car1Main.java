package inne.samochod.car1;

public class Car1Main {
        public static void main(String[] args)
        {
            Car1 mojPierwszySamochod = new Car1("Ferrari", "250GTO", "czerwony", 300);

            mojPierwszySamochod.wyswietlKolor();

            mojPierwszySamochod.zmienMoc(320);

            String zwroconaMarka = mojPierwszySamochod.zwrocMarke();
            System.out.println(zwroconaMarka);

            mojPierwszySamochod.wyswietlInformacje();
        }
    }