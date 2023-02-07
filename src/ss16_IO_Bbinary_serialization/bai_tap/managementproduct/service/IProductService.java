package ss16_IO_Bbinary_serialization.bai_tap.managementproduct.service;

import ss16_IO_Bbinary_serialization.bai_tap.managementproduct.model.Product;

import java.io.File;
import java.util.List;

public interface IProductService {
    void addProduct(File fileProduct, Product product);
    List<Product> displayProduct(File fileProduct);
    Boolean searchProduct(File fileProduct, int id);
}
