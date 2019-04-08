import java.util.ArrayList;
import java.util.List;

public class RoomSet extends ItemEntity implements databBaseImpl{

    private List roomList = new ArrayList<String>();;

    private String roomCL = "RoomCleaner. ";

    public RoomSet() {
        super();
        //roomList = new ArrayList<String>();
    }

    public RoomSet(String name, String type, Integer price) {
        super(name, type, price);
        //roomList = new ArrayList<String>();
    }

    //@Override
    /*public void createChemisrtySet(int counts) {
        for(int i = 0; i < counts; i++){
            roomList.add(roomCL + i);
        }
    }*/

    public List getLocalList() {
        return roomList;
    }

    public String getClType() {
        return roomCL;
    }
}
