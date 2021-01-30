package w09;

import java.text.DecimalFormat;

public class Formatter {

    public static double round(double value) {
        return (Math.round(value * 20) / 20.0);
    }

    public static String addCHF(double doubleValue){
        DecimalFormat formatter = new DecimalFormat("#0.00");
        formatter.setPositiveSuffix(" CHF");
        return formatter.format(doubleValue);
    }
}
