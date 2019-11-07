
package stockcontrol;

/**
 *
 * @author George Adams
 * @author Thomas Merchant
 */
public class StockItem {
    String fixedStockCode;
    int quantity;
    double price;
    final static double VAT=17.5;

    public StockItem(int quantity, double price, String stockCode){
        this.quantity = quantity;
        this.price = price;
        this.fixedStockCode = stockCode;
    }

    public String getStockCode(){
        
    }

    public int getQuantity(){
        
    }
    
    public void setPrice(double newPrice){
        
    }

    public double getPrice(){
        
    }

    public String getStockName(){
        
    }

    public String getStockDescription(){
        
    }

    public void addStock(int quantity){
        
    }

    public void sellStock(int quantity){
        
    }

    public static double getVAT(){
        
    }

    public double getVATPrice(){
        
    }

    public String toString(){
        
    }
}


