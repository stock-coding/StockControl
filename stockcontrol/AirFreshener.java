/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockcontrol;

/**
 * A StockItem representing the product "Easy breathe Air Freshener"
 * @author g5-adams
 */
public class AirFreshener extends StockItem {
    
    public AirFreshener(int quantity, float price, String stockCode) {
        super(quantity,price,stockCode);
    }
    
    @Override
    public String getStockName() {
        return "Air freshener";
    }
    @Override
    public String getStockDescription() {
        return "Easy breathe Air Freshener";
    }    

    @Override
    public String toString() {
        return super.toString();
    }
}
