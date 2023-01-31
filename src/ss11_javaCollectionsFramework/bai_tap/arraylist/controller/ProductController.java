package ss11_javaCollectionsFramework.bai_tap.arraylist.controller;

import ss11_javaCollectionsFramework.bai_tap.arraylist.model.Product;
import ss11_javaCollectionsFramework.bai_tap.arraylist.service.ProductServiceImp;

import java.util.List;
import java.util.Scanner;

public class ProductController {
    private static ProductServiceImp service = new ProductServiceImp();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("------Product management-------");
            System.out.println("1.List Product");
            System.out.println("2.Add a Product");
            System.out.println("3.Set a Product with id");
            System.out.println("4. Remove a Product with id");
            System.out.println("5. Find a Product with name");
            System.out.println("6. Sort Increase Product with price");
            System.out.println("7.Sort Decrease Product with price");
            System.out.println("8.Exit");
            System.out.println("Please put in a number:");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    List<Product> productList = service.displayProduct();
                    for (Product product : productList) {
                        System.out.println(product);
                    }
                    break;
                case 2:
                    System.out.println("Input id");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input name");
                    String name = scanner.nextLine();
                    System.out.println("Input price");
                    float price = Float.parseFloat(scanner.nextLine());
                    service.addProduct(new Product(id, name, price));
                    break;
                case 3:
                    System.out.println("Input id of product you want set Product");
                    int idSet = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input name of new Product");
                    String nameNew = scanner.nextLine();
                    System.out.println("Input price of new Product");
                    float priceNew = Float.parseFloat(scanner.nextLine());
                    List<Product> productList2 = service.displayProduct();
                    service.setProduct(idSet, new Product(idSet, nameNew, priceNew));
                    break;
                case 4:
                    System.out.println("Input id of product you want delete Product");
                    int idSetDelete = Integer.parseInt(scanner.nextLine());
                    service.removeProduct(idSetDelete);
                    break;
                case 5:
                    System.out.println("Input name of product you want to find");
                    String nameFind = scanner.nextLine();
                    service.findProduct(nameFind);
                    break;
                case 6:
                    service.sortIncreaseProduct();
                    break;
                case 7:
                    service.sortDecreaseProduct();
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
