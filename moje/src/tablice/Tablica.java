package tablice;

public class Tablica {

    public static void main(String[] args) {
        String[] imiona = new String[3];
        imiona[0] = "Nico";
        imiona[1] = "Lewis";
        imiona[2] = "Kimi";

        System.out.println(imiona[0]);
        System.out.println(imiona[1]);
        System.out.println(imiona[2]);
        System.out.println();
        imiona[1] = "Robert";
        System.out.println(imiona[1]);
    }
}

