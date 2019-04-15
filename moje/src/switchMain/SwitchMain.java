package switchMain;

public class SwitchMain {
    public static void main(String[] args) {
        int liczba = 1;

        switch (liczba) {
            case 1: {
                System.out.println("Jeden");
                break;
            }
            case 2: {
                System.out.println("Dwa");
                break;
            }
            default: {
                System.out.println("Inna liczba");
                break;
            }
        }
    }
}

