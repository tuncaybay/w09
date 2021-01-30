package w09;

import java.util.ArrayList;

public class OnlineSale {
    private Stock stock = new Stock();
    private ArrayList<OrderedProduct> orderedProducts = new ArrayList<>();
    private double totalPrice;
    Formatter formatter = new Formatter();

    public OnlineSale() {
        buyProduct(stock.getTotalProducts().get(0), stock, 11);
        buyProduct(stock.getTotalProducts().get(1), stock, 1);
        System.out.println("orderedProducts");
        System.out.println(orderedProducts.toString());
        System.out.println("totalPrice = " + formatter.addCHF(totalPrice));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        stock.printProducts();
    }

    public void buyProduct(Product product, Stock stock, int productQuantity) {

        int prIndex = -1;
        if (stock.getTotalProducts().contains(product)) ;
        {
            for (int j = 0; j < stock.getTotalProducts().size(); j++) {
                if (stock.getTotalProducts().get(j) == product) {
                    prIndex = j;
                    break;
                }
            }
        }

        if (prIndex != -1 && stock.getStockAmounts().get(prIndex) >= productQuantity) {
            orderedProducts.add(new OrderedProduct(product, productQuantity));
            totalPrice += product.getProductPrice() * productQuantity;
            stock.setProductStockAmount(prIndex, (stock.getStockAmounts().get(prIndex) - productQuantity));
        } else {
            System.out.println(product.toString() + "not on stock");
        }

    }


}
