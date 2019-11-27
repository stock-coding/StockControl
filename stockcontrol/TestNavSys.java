import stockcontrol.NavSys;

/**
 * Tests the implementation of the NavSys class
 * @author Thomas Merchant
 */
public class TestNavSys
{

    public static void main(String[] args)
    {
        System.out.println("Creating a NavSys stock item with 10 units, price 99.99 and stock code NS101");
        System.out.println("Printing stock info:");
        NavSys testNavSys = new NavSys(10, 99.99f, "NS101");
        System.out.println(testNavSys);
        System.out.println("Adding 10 more units");
        testNavSys.addStock(10);
        System.out.println("Printing stock info:\n" + testNavSys);
        System.out.println("Sold 2 units");
        testNavSys.sellStock(2);
        System.out.println("Printing stock info:\n" + testNavSys);
        System.out.println("Set new price 100.99 per unit");
        testNavSys.setPrice(100.99f);
        System.out.println("Printing stock info:\n" + testNavSys);
        System.out.println("Adding 0 more units");
        testNavSys.addStock(0);
    }
}