package stockcontrol;

public class TestPolymorphism
{
    private static void itemInstance(StockItem testItem)
    {
        System.out.println("Printing stock info");
        System.out.println(testItem);
        
        System.out.println("Adding 2 stock");
        testItem.addStock(2);
        System.out.println("Printing stock info");
        System.out.println(testItem);
        
        System.out.println("Adding 97 stock");
        testItem.addStock(97);
        System.out.println("Printing stock info");
        System.out.println(testItem);
        
        System.out.println("Adding 1 stock");
        testItem.addStock(1);
        System.out.println("Printing stock info");
        System.out.println(testItem);
        
        System.out.println("Selling 99 stock");
        testItem.sellStock(99);
        System.out.println("Printing stock info");
        System.out.println(testItem);
        
        System.out.println("Adding -1 stock");
        testItem.addStock(-1);
        System.out.println("Printing stock info");
        System.out.println(testItem);
        
        System.out.println("Selling 2 stock");
        testItem.sellStock(2);
        System.out.println("Printing stock info");
        System.out.println(testItem);
        
        System.out.println("Selling -1 stock");
        testItem.sellStock(-1);
        System.out.println("Printing stock info");
        System.out.println(testItem);
        
        System.out.println("VAT rate is " + testItem.getVAT());
        System.out.println("Printing stock info");
        System.out.println(testItem);
        
        System.out.println("Price: " + testItem.getPrice());
        System.out.println("Printing stock info");
        System.out.println(testItem);
        
        System.out.println("Setting price to 4.85");
        testItem.setPrice(4.85f);
        System.out.println("Price: " + testItem.getPrice());
        System.out.println("Printing stock info");
        System.out.println(testItem);
        
        System.out.println("Price with VAT is " + testItem.getVATPrice());
        System.out.println("Printing stock info");
        System.out.println(testItem);
    }

    public static void main(String[] args)
    {
        StockItem[] stockList = new StockItem[3];
        stockList[0] = new AirFreshener(1,5.5f,"A1");
        stockList[1] = new EngineOil(1,5.5f,"E1");
        stockList[2] = new WiperBlade(1,5.5f,"W1");
        
        System.out.println("Testing an AirFreshener stock item with 1 units, price 5.5 and stock code A1");
        itemInstance(stockList[0]);
        System.out.println("Testing an EngineOil stock item with 1 units, price 5.5 and stock code E1");
        itemInstance(stockList[1]);
        System.out.println("Testing an WiperBlade stock item with 1 units, price 5.5 and stock code W1");
        itemInstance(stockList[2]);
        
    }
}
