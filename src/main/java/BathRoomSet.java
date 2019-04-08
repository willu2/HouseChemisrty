import java.util.ArrayList;
import java.util.List;

public class BathRoomSet extends ItemEntity {

    List bathList;

    private String bathCL = "BathCleaner. ";

    public BathRoomSet(String name, String type, Integer price) {
        super(name, type, price);
        bathList = new ArrayList<String>();
    }

    @Override
    public void createChemisrtySet() {
        for(int i = 0; i < 10; i++){
            bathList.add(bathCL + i);
        }
    }
}
