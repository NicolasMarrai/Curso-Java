// Program.java
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("How many products? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println();
            System.out.println("Product #" + (i + 1) + ":");

            System.out.print("Id: ");
            int id = sc.nextInt();

            while (hasId(products, id)) {
                System.out.print("Id already exists. Enter another id: ");
                id = sc.nextInt();
            }

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Stock quantity: ");
            int stock = sc.nextInt();

            products.add(new Product(id, name, stock));
        }

        System.out.println();
        System.out.print("Enter product id to update: ");
        int id = sc.nextInt();

        Product product = findById(products, id);

        if (product == null) {
            System.out.println("This id does not exist.");
        } else {

            System.out.print("How many units add? ");
            int quantity = sc.nextInt();

            product.addstock(quantity);

            System.out.println();
            System.out.println("Updated product:");
            System.out.println(product);
        }

        System.out.println();
        System.out.println("Product list:");

        for (Product p : products) {
            System.out.println(p);
        }

        sc.close();
    }

    public static boolean hasId(List<Product> list, int id) {

        return list.stream()
                .anyMatch(x -> x.getId().equals(id));
    }

    public static Product findById(List<Product> list, int id) {

        return list.stream()
                .filter(x -> x.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}