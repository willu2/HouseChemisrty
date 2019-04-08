import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class CleansFabric {

    List allData ;

    RoomSet roomSet ;
    WindowSet windowSet;
    BathRoomSet bathRoomSet;

    private List roomList = new ArrayList<String>();

    public CleansFabric() {
        allData = new ArrayList<ItemEntity>();


        createBase();
    }

    private void createBase(){


      //  bathRoomSet = new BathRoomSet();


      //  windowSet.createChemisrtySet(10);
       // bathRoomSet.createChemisrtySet(19);

        for (int i = 0; i < 15 /*roomSet.getLocalList().size()*/; i++){
            roomSet = new RoomSet();
            //roomSet = new RoomSet((String) roomSet.getLocalList().get(i), roomSet.getClType(), ranDig(40));
            roomSet.setName(roomSet.getClType() + i);
            roomSet.setType(roomSet.getClType());
            roomSet.setPrice(ranDig(40));
            allData.add(roomSet);
        }

        for (int i = 0; i < 20; i++){
            windowSet = new WindowSet();

            windowSet.setName((String) windowSet.getClType() + i);
            windowSet.setType(windowSet.getClType());
            windowSet.setPrice(ranDig(60));
            allData.add(windowSet);
        }

        for (int i = 0; i < 19; i++){
            bathRoomSet.setName(bathRoomSet.getClType() + i);
            bathRoomSet.setType(bathRoomSet.getClType());
            bathRoomSet.setPrice(ranDig(100));
            allData.add(bathRoomSet);
        }

    }
    public void createChemisrtySet(int counts) {
        for(int i = 0; i < counts; i++){
            roomList.add(roomSet.getClType() + i);
        }
    }

    public void showAllData(){

        for (Iterator<ItemEntity> it = allData.iterator(); it.hasNext(); ) {
            ItemEntity itemEntity = it.next();
            printItemList(itemEntity);
        }
    }

    private void printItemList(ItemEntity itemEntity){
        System.out.print("Flower name:  > " + itemEntity.getName());
        System.out.print(" ||_type: > " + itemEntity.getType());
        System.out.print(" ||_price: > " + itemEntity.getPrice() + " $");
        System.out.println();
    }
    public int ranDig(int ran){
        Random random = new Random();
        int digit = random.nextInt(ran) + 12;
        return digit;
    }
}
