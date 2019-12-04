package stockcontrol;

public class TestPolymorphism
{
    private static void itemInstance(StockItem testItem) {

    }

    public static void main(String[] args) {

        StockItem[] x = new StockItem[3];
        x[0] = new AirFreshener(1,5.5f,"A1");
        x[1] = new EngineOil(1,5.5f,"E1");
        x[2] = new WiperBlade(1,5.5f,"W1");
        
    }
}
