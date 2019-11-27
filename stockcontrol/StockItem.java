
package stockcontrol;

/**
 *
 * @author George Adams
 * @author Thomas Merchant
 */
public class StockItem {
    private String fixedStockCode;
    private int quantity;
    private float price;
    private final static float VAT = 17.5f;

    /**
     * 
     * @param quantity The amount of the item in stock
     * @param price
     * @param stockCode
     */
    public StockItem(int quantity, float price, String stockCode){
        this.quantity = quantity;
        this.price = price;
        this.fixedStockCode = stockCode;
    }

    /**
     * 
     * @return This Stock Item's fixed stock code
     */
    public String getStockCode(){
        return fixedStockCode;
    }

    /**
     * 
     * @return The quantity of this Stock Item
     */
    public int getQuantity(){
        return quantity;
    }
    
    /**
     * 
     * @param newPrice The new price for this Stock Item
     */
    public void setPrice(float newPrice){
        price = newPrice;
    }

    /**
     * 
     * @return The current price for this Stock Item
     */
    public float getPrice(){
        return price;
    }

    /**
     * 
     * @return The name of this Stock Item
     */
    public String getStockName(){
        return "Unknown Stock Name";
    }

    /**
     * 
     * @return The description of this Stock Item
     */
    public String getStockDescription(){
        return "Unknown Stock Description";
    }

    /**
     * 
     * @param quantity The amount of stock to add
     * @return True if successful, false if an error occurred
     */
    public boolean addStock(int quantity){
        if(quantity<1){         
            System.out.println("Error: must add at least 1 stock");
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

    /**
     * 
     * @param quantity The amount of stock to sell
     * @return True if successful, false if an error occurred
     */
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

    /**
     * 
     * @return The VAT rate for all Stock Items
     */
    public static float getVAT(){
        return VAT;
    }

    /**
     * 
     * @return The price of this Stock Item with VAT applied and rounded to 2 d.p
     */
    public float getVATPrice(){
        float VATPrice = (VAT / 100.0f + 1) * price;
        return Math.round(100 * VATPrice) / 100.0f;
    }
   
    @Override
    /**
     * 
     * @return A human-readable representation of this Stock Item
     */
    public String toString(){
        return  "Stock code: " + fixedStockCode + "," +
                "\nStock name: " + getStockName() + "," +
                "\nStock description: " + getStockDescription() + "," +
                "\nStock quantity: " + quantity + "," +
                "\nStock price: £" + price + "," +
                "\nStock price including VAT: £" + getVATPrice() + ",";
    }
}


