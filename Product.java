package w09;

import java.time.LocalDate;

public class Product {

    private int productId;
    private String productName;
    private double productPrice;
    private LocalDate createDate;
    private double stockVolume;
    Formatter formatter = new Formatter();

    public Product(int productId, String productName, double productPrice, double stockVolume) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.stockVolume = stockVolume;
        this.createDate = LocalDate.now();
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + formatter.addCHF(productPrice) +
                '}';
    }
}
