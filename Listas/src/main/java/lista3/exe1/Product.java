package lista3.exe1;
public class Product {
    private String name;
    private float price;

    public Product() {
    }
    public Product(String name, float price) {
        this.setName(name);
        this.setPrice(price);
    }
    public String getName() {
        return name;
    }
    public final void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return price;
    }
    public final void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + '}';
    }
   
}
