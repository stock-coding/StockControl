/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockcontrol;

/**
 * A StockItem representing the product "Easy wipe wiper blade"
 * @author g5-adams
 */
public class WiperBlade extends StockItem {
    
    public WiperBlade(int quantity, float price, String stockCode) {
        super(quantity,price,stockCode);
    }

    @Override
    public String getStockName() {
        return "Wiper blade";
    }
    @Override
    public String getStockDescription() {
        return "Easy wipe wiper blade";
    }    

    @Override
    public String toString() {
        return super.toString();
    }
}
