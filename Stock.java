package w09;

import java.util.ArrayList;
import java.util.Random;

public class Stock {

    private ArrayList<Product> totalProducts = new ArrayList<>();
    private ArrayList<Integer> stockAmounts = new ArrayList<>();
    private Random random = new Random();

    public Stock() {
        generateProducts();
        generateStockAmounts();
        printProducts();
    }

    private void generateProducts() {
        totalProducts.add(new Product(1, "Product 1", 57.65, 0.25));
        totalProducts.add(new Product(2, "Product 2", 33.45, 0.05));
        totalProducts.add(new Product(3, "Product 3", 56.00, 0.10));
        totalProducts.add(new Product(4, "Product 4", 73.95, 0.02));
        totalProducts.add(new Product(5, "Product 5", 147.40, 0.15));
        totalProducts.add(new Product(6, "Product 6", 567.35, 0.11));
        totalProducts.add(new Product(7, "Product 7", 55.55, 0.12));
        totalProducts.add(new Product(8, "Product 8", 66.65, 0.33));
        totalProducts.add(new Product(9, "Product 9", 77.75, 0.44));
        totalProducts.add(new Product(10, "Product 10", 1000.00, 0.01));
    }

    private void generateStockAmounts() {
        for (int i = 1; i <= totalProducts.size(); i++) {
            stockAmounts.add(random.nextInt(10) + 1);
        }
    }

    protected void printProducts() {
        for (int i = 0; i < totalProducts.size(); i++) {
            System.out.println(totalProducts.get(i).toString());
            System.out.println("Stock amount: " + stockAmounts.get(i));
            System.out.println("-------------------------------------------------------------------------------");
        }
    }

    public ArrayList<Product> getTotalProducts() {
        return totalProducts;
    }

    public ArrayList<Integer> getStockAmounts() {
        return stockAmounts;
    }

    public void setProductStockAmount(int index, int amount) {
        stockAmounts.set(index,amount);
    }

}
