
public class BathRoomSet extends ItemEntity implements databBaseImpl{

    private String bathCL = "BathCleaner-";
    private String bathTP = "Bath";

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
