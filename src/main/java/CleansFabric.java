import java.util.List;

public class CleansFabric {

    RoomSet roomSet ;
    WindowSet windowSet;
    BathRoomSet bathRoomSet;

    public CleansFabric() {
        roomSet = new RoomSet();
        windowSet = new WindowSet();
        bathRoomSet = new BathRoomSet();

        roomSet.createChemisrtySet(15);
        windowSet.createChemisrtySet(10);
        bathRoomSet.createChemisrtySet(19);

        createBase();
    }

    public void createBase(){

        for (int i = 0; i < roomSet.getLocalList().size(); i++){
            roomSet.setName((String) roomSet.getLocalList().get(i));
            roomSet.setType(roomSet.getClType());
            roomSet.setPrice(roomSet.ranDig(40));

        }

        for (int i = 0; i < windowSet.getWindowsList().size(); i++){
            windowSet.setName((String) windowSet.getLocalList().get(i));
            windowSet.setType(windowSet.getClType());
            windowSet.setPrice(windowSet.ranDig(60));
        }

        for (int i = 0; i < bathRoomSet.getBathList().size(); i++){
            bathRoomSet.setName((String) bathRoomSet.getLocalList().get(i));
            bathRoomSet.setType(bathRoomSet.getClType());
            bathRoomSet.setPrice(bathRoomSet.ranDig(100));
        }

    }
}
