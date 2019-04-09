import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataCreator {

    List allData;

    RoomSet roomSet;
    WindowSet windowSet;
    BathRoomSet bathRoomSet;

    public DataCreator(int r, int b, int w ) {
        allData = new ArrayList<ItemEntity>();

        createRoomSet(r);
        createBathRoomSet(b);
        createwindowSet(w);
    }

    public void createRoomSet(int r){
        for (int i = 0; i < r; i++){
            roomSet = new RoomSet();

            roomSet.setName(roomSet.getClType() + i);
            roomSet.setType(roomSet.getTP());
            roomSet.setPrice(ranDig(100));
            allData.add(roomSet);
        }
    }

    public void createBathRoomSet(int b){
        for (int i = 0; i < b; i++){
            bathRoomSet = new BathRoomSet();

            bathRoomSet.setName(bathRoomSet.getClType() + i);
            bathRoomSet.setType(bathRoomSet.getTP());
            bathRoomSet.setPrice(ranDig(100));
            allData.add(bathRoomSet);
        }
    }

    public void createwindowSet(int w){
        for (int i = 0; i < w; i++){
            windowSet = new WindowSet();

            windowSet.setName(windowSet.getClType() + i);
            windowSet.setType(windowSet.getTP());
            windowSet.setPrice(ranDig(60));
            allData.add(windowSet);
        }
    }

    public int ranDig(int ran){
        Random random = new Random();
        int digit = random.nextInt(ran) + 12;
        return digit;
    }

    public String localChooser(int i){
        String location = "";
        switch (i){
            case 1:
                location = "Room";
                break;
            case 2:
                location = "Bath";
                break;
            case 3:
                location = "Windows";
                break;
            default:
                System.out.println("Try again...");
        }
        return location;
    }

    public List getAllData() {
        return allData;
    }
}
