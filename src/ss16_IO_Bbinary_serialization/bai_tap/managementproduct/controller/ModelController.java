package ss16_IO_Bbinary_serialization.bai_tap.managementproduct.controller;

import ss16_IO_Bbinary_serialization.bai_tap.managementproduct.model.Product;
import ss16_IO_Bbinary_serialization.bai_tap.managementproduct.service.ProductService;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class ModelController {
    private static final String PATH_FILE = "D:\\04_hoc_tap\\codegym\\c1122g1\\module_02\\src\\ss16_IO_Bbinary_serialization\\bai_tap\\managementproduct\\repository\\product.dat";
    private static ProductService productService = new ProductService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int select = 0;
        do {
            System.out.println("------Management Product-------");
            System.out.println("1.Display Product");
            System.out.println("2.Add Product");
            System.out.println("3.Search Product by id");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    File file = new File(PATH_FILE);
                    List<Product> list = productService.displayProduct(file);
                    for (Product product : list) {
                        System.out.println(product);
                    }
                    break;
                case 2:
                    File file1 = new File(PATH_FILE);
                    System.out.println("Enter id");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter name");
                    String name = scanner.nextLine();
                    System.out.println("Enter manufacture");
                    String manufacture = scanner.nextLine();
                    System.out.println("Enter Price");
                    double price = Double.parseDouble(scanner.nextLine());
                    Product product = new Product(id, name, manufacture, price);
                    productService.addProduct(file1, product);
                    break;
                case 3:
                    File file2 = new File(PATH_FILE);
                    System.out.println("Enter id that you want find");
                    int idFind = Integer.parseInt(scanner.nextLine());
                    if (productService.searchProduct(file2, idFind)) {
                        System.out.println("This product have in List Product");
                    } else {
                        System.out.println("This product not found");
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        } while (true);
    }
}
