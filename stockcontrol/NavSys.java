/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockcontrol;

/**
 *
 * @author g5-adams
 */
public class NavSys extends StockItem {

    
    NavSys(int quantity, double price, String stockCode) {
        super(quantity,price,stockCode);
    }

   
    
    @Override
    public String getStockName() {
        return "Navigation system";
    }
    @Override
    public String getStockDescription() {
        return "GeoVision Sat Nav";
    }    

    @Override
    public String toString() {
        return super.toString();
    }
}
