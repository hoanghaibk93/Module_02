package ss16_IO_Bbinary_serialization.bai_tap.managementproduct.model;

import java.io.Serializable;

public class Product implements Serializable {
    int id;
    String name;
    String manufacture;
    double price;

    public Product() {
    }

    public Product(int id, String name, String manufacture, double price) {
        this.id = id;
        this.name = name;
        this.manufacture = manufacture;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", price=" + price +
                '}';
    }
}
