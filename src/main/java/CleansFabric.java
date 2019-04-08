import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CleansFabric {

    List allData ;

    RoomSet roomSet ;
    WindowSet windowSet;
    BathRoomSet bathRoomSet;

    public CleansFabric() {
        allData = new ArrayList<ItemEntity>();

        roomSet = new RoomSet();
        windowSet = new WindowSet();
        bathRoomSet = new BathRoomSet();

        roomSet.createChemisrtySet(15);
        windowSet.createChemisrtySet(10);
        bathRoomSet.createChemisrtySet(19);

        createBase();
    }

    private void createBase(){

        for (int i = 0; i < roomSet.getLocalList().size(); i++){
            roomSet.setName((String) roomSet.getLocalList().get(i));
            roomSet.setType(roomSet.getClType());
            roomSet.setPrice(roomSet.ranDig(40));
            allData.add(roomSet);
        }

        for (int i = 0; i < windowSet.getWindowsList().size(); i++){
            windowSet.setName((String) windowSet.getLocalList().get(i));
            windowSet.setType(windowSet.getClType());
            windowSet.setPrice(windowSet.ranDig(60));
            allData.add(windowSet);
        }

        for (int i = 0; i < bathRoomSet.getBathList().size(); i++){
            bathRoomSet.setName((String) bathRoomSet.getLocalList().get(i));
            bathRoomSet.setType(bathRoomSet.getClType());
            bathRoomSet.setPrice(bathRoomSet.ranDig(100));
            allData.add(bathRoomSet);
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

}
