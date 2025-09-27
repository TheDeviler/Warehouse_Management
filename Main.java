import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Storage products = new Storage();

        int choice = 0, quantity = 0, exit = 0;
        double price = 0;
        String name, code;

        while (exit != 1) {
            System.out.println("1: Add products, 2: Remove product, 4: Show all, 5: Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:

                    System.out.println("Product name: ");
                    name = sc.next();

                    System.out.println("How many products do you want to add: ");
                    quantity = sc.nextInt();

                    System.out.println("Product code: ");
                    code = sc.next();

                    System.out.println("Price: ");
                    price = sc.nextDouble();

                    products.addProduct(name, code, quantity, price);
                    break;

                case 2:
                    System.out.println("Enter the product code to remove: ");
                    code = sc.next();
                    products.removeProduct(code);
                    break;

                case 4:
                    products.printProducts();
                    break;

                case 5:
                    exit = 1;
                    sc.close();
                    break;
            }
        }
    }
}
