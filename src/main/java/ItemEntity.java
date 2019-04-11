
public abstract class ItemEntity implements Comparable<ItemEntity>{

    public Integer price;
    public String name;
    public String type;

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
        return "Cleener [price=" + price + "]";
    }

    public int compareTo(ItemEntity o) {
        return this.getPrice().compareTo(o.getPrice());
    }
}
