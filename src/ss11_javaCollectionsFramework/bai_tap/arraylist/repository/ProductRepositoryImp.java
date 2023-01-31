package ss11_javaCollectionsFramework.bai_tap.arraylist.repository;

import MVC.model.Student;
import ss11_javaCollectionsFramework.bai_tap.arraylist.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRepositoryImp implements IProductRepository {
    private static List<Product> arrayListProduct;

    static {
        arrayListProduct = new ArrayList<>();
        arrayListProduct.add(new Product(1, "book", 30000));
        arrayListProduct.add(new Product(4, "pencil", 60000));
        arrayListProduct.add(new Product(2, "apple", 50000));
        arrayListProduct.add(new Product(3, "banana", 40000));
    }

    @Override
    public void addProduct(Product product) {
        arrayListProduct.add(product);
    }

    @Override
    public void setProduct(int id, Product product) {
        int count = 0;
        for (Product product1 : arrayListProduct) {
            if (product1.getId() == id) {
                arrayListProduct.set(arrayListProduct.indexOf(product1),product);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("id: " + id + " not available in this product list");
        }
    }


    @Override
    public boolean removeProduct(int id) {
        for (Product product : arrayListProduct) {
            if (product.getId() == id) {
                arrayListProduct.remove(product);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Product> displayProduct() {
        return arrayListProduct;
    }

    @Override
    public void findProduct(String name) {
        int count = 0;
        for (Product product : arrayListProduct) {
            if (product.getName().equals(name)) {
                count++;
                System.out.println(product);
            }
        }
        if (count == 0) {
            System.out.println("product " + name + " has not in this product list");
        }
    }


    @Override
    public void sortIncreaseProduct() {
        Collections.sort(arrayListProduct);
    }

    @Override
    public void sortDecreaseProduct() {
        Collections.reverse(arrayListProduct);
    }
}
