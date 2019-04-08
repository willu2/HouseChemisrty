import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class CleansFabric {

    private List allData ;

    private int room = 15;
    private int bath = 19;
    private int window = 17;

    public CleansFabric() {
        allData = new ArrayList<ItemEntity>();
        createBase();
    }

    private void createBase(){
        DataCreator dataCreator = new DataCreator(room, bath, window);
        allData = dataCreator.getAllData();
    }


    public void showAllData(){

        for (Iterator<ItemEntity> it = allData.iterator(); it.hasNext(); ) {
            ItemEntity itemEntity = it.next();
            printItemList(itemEntity);
        }
    }

    private void printItemList(ItemEntity itemEntity){
        System.out.print("Cleener name:>  " + itemEntity.getName());
        System.out.print(" ||_type: > " + itemEntity.getType());
        System.out.print(" ||_price: > " + itemEntity.getPrice() + " $");
        System.out.println();
    }
}
