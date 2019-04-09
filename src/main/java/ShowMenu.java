import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ShowMenu {

    MenuBuillder menu = new MenuBuillder();
    CleansFabric cleansFabric = new CleansFabric();

    boolean exit = false;

    public ShowMenu() {
    }

    public void show() {
        do {
            int item = 0;

            menu.mainManu();

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            switch (menu.menuTotalPriceEnter()) {
                case 1:
                    cleansFabric.showAllData();
                    break;
                case 2:
                    menu.enterWhatMenu();
                    menu.itemsMenu();
                    item = menu.menuTotalPriceEnter();
                    cleansFabric.showLocationData(item);
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Try again...");
            }

        } while (!exit);
    }
}
