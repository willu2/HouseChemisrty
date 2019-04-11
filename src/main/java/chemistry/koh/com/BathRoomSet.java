package chemistry.koh.com;

public class BathRoomSet extends ItemEntity implements databBaseImpl{

    private String bathCL = "BathCleaner-"; // cleaner name
    private String bathTP = "Bath";   // type

    public BathRoomSet() {
        super();
    }

    public BathRoomSet(String name, String type, Integer price) {
        super(name, type, price);
    }

    public String getClType() {
        return bathCL;
    }

    public String getTP() {
        return bathTP;
    }
}
