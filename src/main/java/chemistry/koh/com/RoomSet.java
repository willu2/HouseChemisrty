package chemistry.koh.com;

public class RoomSet extends ItemEntity implements databBaseImpl{

    private String roomCL = "RoomCleaner-";  //cleaner name
    private String roomTP = "Room";  // location name

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
