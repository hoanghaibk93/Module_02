package ss16_IO_Bbinary_serialization.bai_tap.managementproduct.repository;

import ss16_IO_Bbinary_serialization.bai_tap.managementproduct.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> list;

    static {
        list = new ArrayList<>();
        Product product1 = new Product(1, "Iphone11", "Apple", 15000000);
        Product product2 = new Product(2, "Iphone13", "Apple", 30000000);
        Product product3 = new Product(3, "Galaxy Note 8", "SamSung", 20000000);
        Product product4 = new Product(4, "Iphone10", "Apple", 12000000);
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
    }

    @Override
    public void addProduct(File fileProduct, Product product) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileProduct);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            list.add(product);
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Product> displayProduct(File fileProduct) {
        try {
            FileInputStream fileInputStream = new FileInputStream(fileProduct);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            list = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Boolean searchProduct(File fileProduct, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()){
                System.out.println(list.get(i).toString());
                return true;
            }
        }
        return false;
    }
}
