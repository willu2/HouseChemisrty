
public class WindowSet extends ItemEntity implements databBaseImpl {

    private String windowCL = "WindowCleaner-";
    private String windowTP = "Windows";

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
