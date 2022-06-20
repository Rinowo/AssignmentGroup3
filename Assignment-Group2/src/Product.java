public class Product {
    int id;
    String name;
    double price;

    public Product(int id) {
        this.id = id;
    }

    public Product(String name) {
        this.name = name;
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
