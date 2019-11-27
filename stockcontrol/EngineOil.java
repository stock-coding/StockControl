/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockcontrol;

/**
 * A StockItem representing the product "Easy Run engine oil
 * @author g5-adams
 */
public class EngineOil extends StockItem{
    
    public EngineOil(int quantity, float price, String stockCode) {
        super(quantity,price,stockCode);
    }

    @Override
    public String getStockName() {
        return "Engine Oil";
    }
    @Override
    public String getStockDescription() {
        return "Easy Run engine oil";
    }    

    @Override
    public String toString() {
        return super.toString();
    }
}
