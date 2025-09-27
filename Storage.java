import java.util.Objects;

public class Storage
{
    Product[] products = new Product[50];
    int increase = 0, counter = 1, check = 0;

    static class Product
    {
        String name;
        String code;
        int quantity;
        double unitPrice;

        Product(String name, String code, int quantity, double unitPrice)
        {
            this.name = name;
            this.code = code;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }
    }

    void addProduct(String name, String code, int quantity, double unitPrice)
    {
        if (increase != 50)
        {
            if (check == 0)
            {
                products[increase] = new Product(name, code, quantity, unitPrice);
                increase++;
                check++;
            }
            else
            {
                for (Product product : products)
                {
                    if (!code.equals(product.code))
                    {
                        products[increase] = new Product(name, code, quantity, unitPrice);
                        increase++;
                    }
                    else
                    {
                        System.out.println("Code already exists");
                        break;
                    }
                }
            }
        }
        else
        {
            System.out.println("Storage is full");
        }
    }

    void printProducts()
    {
        for (Product product : products)
        {
            if (product != null)
            {
                System.out.println("Product Number: " + counter++);
                System.out.println("Product Name: " + product.name);
                System.out.println("Product Code: " + product.code);
                System.out.println("Product Quantity: " + product.quantity);
                System.out.println("Product Price: " + product.unitPrice + "€");
            }
        }
        counter = 1;
    }

    void removeProduct(String code)
    {
        for (Product product : products)
        {
            if (code.equals(product.code))
            {
                System.out.println("Product Removed");
                product.name = null;
                product.code = null;
                product.unitPrice = 0;
                product.code = "";
                break;
            }
        }
    }
}
