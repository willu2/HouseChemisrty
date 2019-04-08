import java.util.ArrayList;
import java.util.List;

public class BathRoomSet extends ItemEntity {

    List bathList;

    private String bathCL = "BathCleaner. ";

    public BathRoomSet() {
        super();
        bathList = new ArrayList<String>();
    }

    public BathRoomSet(String name, String type, Integer price) {
        super(name, type, price);
        bathList = new ArrayList<String>();
    }

    @Override
    public void createChemisrtySet(int counts) {
        for(int i = 0; i < counts; i++){
            bathList.add(bathCL + i);
        }
    }

    public List getBathList() {
        return bathList;
    }

    public String getClType() {
        return bathCL;
    }

    public List getLocalList() {
        return bathList;
    }
}
