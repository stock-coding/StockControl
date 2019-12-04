package stockcontrol;

/**
 * Tests the implementation of the NavSys class
 * @author Thomas Merchant
 */
public class TestNavSys
{

    public static void main(String[] args) {

        System.out.println("Creating a NavSys stock item with 1 units, price 1 and stock code test");
        NavSys testNavSys = new NavSys(1, 1, "test");
        System.out.println("printing stock info");
        System.out.println(testNavSys);
        System.out.println("Adding 2 stock");
        testNavSys.addStock(2);
        System.out.println("printing stock info");
        System.out.println(testNavSys);

        System.out.println("Creating a NavSys stock item with 99 units, price 1 and stock code test");
        testNavSys = new NavSys(99, 1, "test");
        System.out.println("printing stock info");
        System.out.println(testNavSys);
        System.out.println("Adding 2 stock");
        testNavSys.addStock(2);
        System.out.println("printing stock info");
        System.out.println(testNavSys);
        System.out.println("adding 1 stock");
        testNavSys.addStock(1);
        System.out.println("printing stock info");
        System.out.println(testNavSys);
        System.out.println("Adding -1 stock");
        testNavSys.addStock(-1);
        System.out.println("printing stock info");
        System.out.println(testNavSys);
        System.out.println("Selling 2 stock");
        testNavSys.sellStock(2);
        System.out.println("printing stock info");
        System.out.println(testNavSys);

        System.out.println("Creating a NavSys stock item with 1 units, price 1 and stock code A1B1");
        testNavSys = new NavSys(1, 1, "A1B1");
        System.out.println("printing stock info");
        System.out.println(testNavSys);
        System.out.println("Selling 2 stock");
        testNavSys.sellStock(2);
        System.out.println("printing stock info");
        System.out.println(testNavSys);
        System.out.println("Selling -1 stock");
        testNavSys.sellStock(-1);
        System.out.println("printing stock info");
        System.out.println(testNavSys);

        System.out.println("VAT rate is " + NavSys.getVAT());

        System.out.println("Creating a NavSys stock item with 1 units price 4.85 and stock code Q5PZ");
        testNavSys = new NavSys(1, 4.85f, "Q5PZ");
        System.out.println("printing stock info");
        System.out.println(testNavSys);
        System.out.println("Price: " + testNavSys.getPrice());
        System.out.println("Price with VAT: " + testNavSys.getVATPrice());
        System.out.println("Setting price to 8.88");
        testNavSys.setPrice(8.88f);
        System.out.println("printing stock info");
        System.out.println(testNavSys);
    }
}
