
public class RoomSet extends ItemEntity implements databBaseImpl{

    private String roomCL = "RoomCleaner-";
    private String roomTP = "Room";

    public RoomSet() {
        super();
    }

    public RoomSet(String name, String type, Integer price) {
        super(name, type, price);
    }

    public String getClType() {
        return roomCL;
    }

    public String getTP() {
        return roomTP;
    }
}
