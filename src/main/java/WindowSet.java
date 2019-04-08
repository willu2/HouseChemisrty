import java.util.ArrayList;
import java.util.List;

public class WindowSet extends ItemEntity implements databBaseImpl {

    private List windowsList;

    private String windowCL = "WindowCleaner. ";

    public WindowSet() {
        super();
        windowsList = new ArrayList<String>();
    }

    public WindowSet(String name, String type, Integer price) {
        super(name, type, price);
        windowsList = new ArrayList<String>();
    }

   // @Override
    public void createChemisrtySet(int counts) {
        for(int i = 0; i < counts; i++){
            windowsList.add(windowCL + i);
        }
    }

    public List getWindowsList() {
        return windowsList;
    }

    public String getClType() {
        return windowCL;
    }

    public List getLocalList() {
        return windowsList;
    }
}
