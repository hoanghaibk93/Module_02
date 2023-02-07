package ss16_IO_Bbinary_serialization.bai_tap.managementproduct.service;

import ss16_IO_Bbinary_serialization.bai_tap.managementproduct.model.Product;
import ss16_IO_Bbinary_serialization.bai_tap.managementproduct.repository.ProductRepository;

import java.io.File;
import java.util.List;

public class ProductService implements IProductService{
    ProductRepository productRepository = new ProductRepository();
    @Override
    public void addProduct(File fileProduct, Product product) {
        productRepository.addProduct(fileProduct,product);
    }

    @Override
    public List<Product> displayProduct(File fileProduct) {
        return productRepository.displayProduct(fileProduct);
    }

    @Override
    public Boolean searchProduct(File fileProduct, int id) {
        return productRepository.searchProduct(fileProduct,id);
    }
}
