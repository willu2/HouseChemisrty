package chemistry.koh.com;

public class WindowSet extends ItemEntity implements databBaseImpl {

    private String windowCL = "WindowCleaner-"; //cleaner name
    private String windowTP = "Windows";  //location type

    public WindowSet() {
        super();
    }

    public WindowSet(String name, String type, Integer price) {
        super(name, type, price);
    }

    public String getClType() {
        return windowCL;
    }

    public String getTP() {
        return windowTP;
    }
}
