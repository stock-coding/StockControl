/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockPackage1;

/**
 *
 * @author George Adams
 */
public class StockItem {
    String fixedStockCode;
    int amountInStock;
    double price;
    final double VAT=17.5;
    StockItem(int amount,double itemPrice,String stockCode){
        amountInStock=amount;
        price=itemPrice;
        fixedStockCode=stockCode;
    }
    StockItem(){
        fixedStockCode = "Unknown Item";
        price=0.00;
        amountInStock=0;
    }
    public void setStockCode(){
        
    }
    public void getStockCode(){
        
    }
    public void getAmountInStock(){
        
    }
    public void setAmountInStock(){
        
    }
    public void setPrice(){
        
    }
    public void getPrice(){
        
    }
    public void setDescription(){
        
    }
    public void getDescription(){
        
    }
    public void addStock(){
        
    }
    public void sellStock(){
        
    }
    public void getVAT(){
        
    }
    public void getVATPrice(){
        
    }
        
    

public static void main(String[] args){

   
}
}


