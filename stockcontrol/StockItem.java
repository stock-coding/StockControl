
package stockcontrol;

/**
 *
 * @author George Adams
 * @author Thomas Merchant
 */
public class StockItem {
    String fixedStockCode;
    int quantity;
    float price;
    final static float VAT = 17.5f;

    public StockItem(int quantity, float price, String stockCode){
        this.quantity = quantity;
        this.price = price;
        this.fixedStockCode = stockCode;
    }

    public String getStockCode(){
        return fixedStockCode;
    }

    public int getQuantity(){
        return quantity;
    }
    
    public void setPrice(float newPrice){
        price = newPrice;
    }

    public float getPrice(){
        return price;
    }

    public String getStockName(){
        return "Unknown Stock Name";
    }

    public String getStockDescription(){
        return "Unknown Stock Description";
    }

    public boolean addStock(int quantity){
        if(quantity<1){         
            System.out.println("Error: must add more than 1 stock");
            return false;
        }
        else if((quantity+this.quantity)>100){
            System.out.println("Error: Can't have more than 100 total stock");
            return false;
        }
        else { 
            this.quantity += quantity;
            return true;
        }
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

    public static float getVAT(){
        return VAT;
    }

    public float getVATPrice(){
      return ((VAT/100.0f+1)*price);
    }
   
    @Override
    public String toString(){
        return  fixedStockCode + "," +
                getStockName() + "," +
                getStockDescription() + "," +
                quantity + "," +
                price + "," +
                getVATPrice() + ",";
    }
}


