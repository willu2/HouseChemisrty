import java.util.ArrayList;
import java.util.List;

public class WindowSet extends ItemEntity {

    List windowsList;

    private String windowCL = "WindowCleaner. ";

    public WindowSet(String name, String type, Integer price) {
        super(name, type, price);
        windowsList = new ArrayList<String>();
    }

    @Override
    public void createChemisrtySet() {
        for(int i = 0; i < 10; i++){
            windowsList.add(windowCL + i);
        }
    }
}
