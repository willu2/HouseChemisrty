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
            int price = 0;

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
                    price = menu.menuTotalPriceEnter();
                    break;
                case 3:
                    menu.enterWhatMenu();
                    menu.itemsMenu();
                    item = menu.menuTotalPriceEnter();
                    price = menu.menuTotalPriceEnter();
                   // dataCreator.flowersShowBouqet(item, price);

                    break;
                case 4:
                    menu.priceEnter();
                    item = menu.menuTotalPriceEnter();
                    //menu.distEnter();
                    price = menu.menuTotalPriceEnter();
                    //dataCreator.findByPriceAndDistToSchool(price, dist);
                    break;
                /*case 5:
                    menu.priceEnter();
                    menu.menuTotalPriceEnter();
                    menu.distEnter();
                    dist = menu.menuTotalPriceEnter();
                    dataCreator.findByPriceAndDistToKinderGargen(price, dist);
                    break;
                case 6:
                    menu.priceEnter();
                    menu.menuTotalPriceEnter();
                    menu.distEnter();
                    dist = menu.menuTotalPriceEnter();
                    dataCreator.findByPriceAndDistToHospital(price, dist);
                    break;
                case 7:
                    dataCreator.sortItemList();
                    break;
                case 8:
                    exit = true;
                    break;*/
                default:
                    System.out.println("Try again...");
            }

        } while (!exit);
    }
}
