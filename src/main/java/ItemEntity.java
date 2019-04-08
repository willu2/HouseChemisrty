import java.util.List;
import java.util.Random;

public abstract class ItemEntity {

    public Integer price;
    public String name;
    public String type;

    public abstract void createChemisrtySet(int i);
    public abstract String getClType();
    public abstract List getLocalList();

    public ItemEntity(String name, String type, Integer price) {

        this.name = name;
        this.type = type;
        this.price = price;
    }

    public ItemEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vazone [price=" + price + "]";
    }

    public int compareTo(ItemEntity o) {
        return this.getPrice().compareTo(o.getPrice());
    }

    public int ranDig(int ran){
        Random random = new Random();
        int digit = random.nextInt(ran) + 12;
        return digit;
    }
}
