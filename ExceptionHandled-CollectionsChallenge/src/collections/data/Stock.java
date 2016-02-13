
package collections.data;

import java.text.NumberFormat;

/**
 * Stock data class
 * @author JAM
 * @version 150721
 */
public class Stock {
    public final String ticker;
    public final String price;
    
    public Stock (String ticker, String price) {
        this.ticker = ticker.toUpperCase();
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        this.price = currency.format(Double.parseDouble(price));
    }
}
