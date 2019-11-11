
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
    final static double VAT = 17.5;

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
        price = newPrice;
    }

    public double getPrice(){
        return price;
    }

    public String getStockName(){
        
    }

    public String getStockDescription(){
        return "Unknown Stock Description";
    }

    public void addStock(int quantity){
        
    }

    public boolean sellStock(int quantity){
        
	if(quantity < 0)
        {
            System.out.println("Error: tried to sell negative stock!");
            return false;
        }
        else if(quantity > this.quantity)
        {
            System.out.printf("Error: tried to sell %d items but there were "
                    + "only %d in stock!\n", quantity, this.quantity);
            return false;
        }
        else
        {
            this.quantity -= quantity;
            return true;
        }
    }

    public static double getVAT(){
        return VAT;
    }

    public double getVATPrice(){
        
    }

    public String toString(){
        
    }
}


