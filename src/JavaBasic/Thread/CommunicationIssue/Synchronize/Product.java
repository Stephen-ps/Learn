package JavaBasic.Thread.CommunicationIssue.Synchronize;

/**
 * @author Stephen
 * @date 2021-05-15 18:02
 **/
public class Product {
    private String name;
    private String brand;
    //ture: 有商品， false：没商品
    private boolean light = false;

    public Product(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isLight() {
        return light;
    }

    public void setLight(boolean light) {
        this.light = light;
    }
}
