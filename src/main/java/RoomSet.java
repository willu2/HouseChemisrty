import java.util.ArrayList;
import java.util.List;

public class RoomSet extends ItemEntity {

    List roomList;

    private String roomCL = "RoomCleaner. ";

    public RoomSet(String name, String type, Integer price) {
        super(name, type, price);
        roomList = new ArrayList<String>();
    }

    @Override
    public void createChemisrtySet() {
        for(int i = 0; i < 15; i++){
            roomList.add(roomCL + i);
        }
    }
}
