package ss11_javaCollectionsFramework.bai_tap.arraylist.service;

import ss11_javaCollectionsFramework.bai_tap.arraylist.model.Product;
import ss11_javaCollectionsFramework.bai_tap.arraylist.repository.ProductRepositoryImp;

import java.util.List;

public class ProductServiceImp implements IProductService {
    ProductRepositoryImp repository = new ProductRepositoryImp();

    @Override
    public void addProduct(Product product) {
        repository.addProduct(product);
    }

    @Override
    public void setProduct(int id, Product product) {
        repository.setProduct(id, product);
    }

    @Override
    public boolean removeProduct(int id) {
        return repository.removeProduct(id);
    }

    @Override
    public List<Product> displayProduct() {
        return repository.displayProduct();
    }

    @Override
    public void findProduct(String name) {
         repository.findProduct(name);
    }

    @Override
    public void sortIncreaseProduct() {
        repository.sortIncreaseProduct();
    }

    @Override
    public void sortDecreaseProduct() {
        repository.sortDecreaseProduct();
    }
}
