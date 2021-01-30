package w09;

import java.util.ArrayList;

public class OrderedProduct {

    private ArrayList<OrderLine> orderLines = new ArrayList<>();

    public OrderedProduct(Product product, int productQuantity) {
        orderLines.add(new OrderLine(product, productQuantity));
    }

    @Override
    public String toString() {
        return "OrderedProduct{" +
                "orderLines=" + orderLines +
                '}' + "\n";
    }
}
