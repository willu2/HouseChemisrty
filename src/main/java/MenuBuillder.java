import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuBuillder {

    public void mainManu(){
        System.out.println("Menu :> ");
        System.out.println(" 1 :> Show all stuffs ");
        System.out.println(" 2 :> Show all bouquets  >>> ");
        System.out.println(" 3 :> Createte bouquet  >>> ");
        //System.out.println(" 4 :> Show by price >>> ");
        System.out.println(" 8 :> Exit ");

        System.out.println("Enter position :> ");
    }


    public void enterNumberMenu(){
        System.out.println("Enter number of flower: ");
    }

    public void priceEnter(){
        System.out.println("Enter your money count:");
    }


    public int menuTotalPriceEnter(){
        int visitorPrice = 0;

        try {
            while (visitorPrice <= 0 ){
                try {
                    BufferedReader inPrice = new BufferedReader(new InputStreamReader(System.in));
                    visitorPrice = Integer.parseInt(inPrice.readLine());
                }catch (NumberFormatException c){}
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return visitorPrice;
    }
}
