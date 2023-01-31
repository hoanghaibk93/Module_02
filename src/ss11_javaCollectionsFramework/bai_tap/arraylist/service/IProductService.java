package ss11_javaCollectionsFramework.bai_tap.arraylist.service;

import ss11_javaCollectionsFramework.bai_tap.arraylist.model.Product;

import java.util.List;

public interface IProductService {
    void addProduct(Product product);

    void setProduct(int id, Product product);

    boolean removeProduct(int id);

    List<Product> displayProduct();

    void findProduct(String name);

    void sortIncreaseProduct();

    void sortDecreaseProduct();

}
