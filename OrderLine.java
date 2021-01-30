package w09;

public class OrderLine {

    private Product product;
    private int productQuantity;
    private double totalItemPrice;
    Formatter formatter = new Formatter();

    public OrderLine(Product product, int productQuantity) {
        this.product = product;
        this.productQuantity = productQuantity;
        totalItemPrice = Formatter.round(product.getProductPrice() * productQuantity);
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "product=" + product +
                ", productQuantity=" + productQuantity +
                ", totalItemPrice=" + formatter.addCHF(totalItemPrice) +
                '}';
    }

}
