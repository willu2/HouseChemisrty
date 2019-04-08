import java.util.Random;

public class ItemEntity {

    /*enum VazonName {
        Vazon_1,
        Vazon_2,
        Vazon_3,
        Vazon_4,
        Vazon_5,
        Vazon_6;
        public static VazonItem.VazonName getRandomType() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }
    public VazonName getVazonName() {
        return vazonName;
    }
    private VazonItem.VazonName vazonName;*/

    public Integer price;
    public String name;
    public String type;


    public ItemEntity( Integer price) {

        this.price = price;
    }

    public ItemEntity() {
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
}
