import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CleansFabric {

    private List allData ;
    DataCreator dataCreator;

    private int room = 15;
    private int bath = 19;
    private int window = 17;

    public CleansFabric() {
        allData = new ArrayList<ItemEntity>();
        createBase();
    }

    private void createBase(){
        dataCreator = new DataCreator(room, bath, window);
        allData = dataCreator.getAllData();
    }


    public void showAllData(){

        for (Iterator<ItemEntity> it = allData.iterator(); it.hasNext(); ) {
            ItemEntity itemEntity = it.next();
            printItemList(itemEntity);
        }
    }

    public void showLocationData(int i){
        String loc = dataCreator.localChooser(i);
        Collections.sort(allData);
        for (Iterator<ItemEntity> it = allData.iterator(); it.hasNext(); ) {
            ItemEntity itemEntity = it.next();
            String jolo = itemEntity.getType();
            if(jolo.equals(loc.toString())){
                printItemList(itemEntity);}
        }
    }

    private void printItemList(ItemEntity itemEntity){
        System.out.print("Cleener name:>  " + itemEntity.getName());
        System.out.print(" ||_type: > " + itemEntity.getType());
        System.out.print(" ||_price: > " + itemEntity.getPrice() + " $");
        System.out.println();
    }
}
