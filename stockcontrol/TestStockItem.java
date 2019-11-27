
package stockcontrol;

import java.util.Scanner;

class TestResult
{
    static int testsPassed = 0;
    static int testsFailed = 0;
    boolean passed = false;
    String message;
    String name;
    
    public TestResult(String name, boolean passed, String message)
    {
        this.name = name;
        this.message = message;

        if(passed)
            testsPassed++;
        else
            testsFailed++;

        this.passed = passed;
    }
}

/**
* Tests the implementation of the StockItem Class
*/
class TestStockItem
{

    private static TestResult runTest(int testNum)
    {
        StockItem testItem;
        boolean passed, returned;
        String message, name;
        Scanner input;
        
        switch(testNum)
        {
            case 0:
                /* Test 1 */
                name = "Verifying StockItem.addStock() base case";
                System.out.println(name);
                testItem = new StockItem(1, 1, "test");
                testItem.addStock(2);
                message = (passed = testItem.getQuantity() == 3) ?
                    "addStock is functioning in the base case"
                    : "Expected quantity to be 3, got" + testItem.getQuantity();
                break;
            case 1:
                /* Test 2 */
                input = new Scanner(System.in);
                name = "Verifying StockItem.addStock() new stock exceeds 100";
                System.out.println(name);
                testItem = new StockItem(99, 1, "test");
                testItem.addStock(2);
                System.out.print("Did you see an error? [Y/n] ");
                message = (passed = input.hasNext("[Yy]")) ?
                    "addStock is functioning in the excess stock case"
                    : "addStock didn't show an error message, quantity: "
                      + testItem.getQuantity();
                break;
            case 2:
               /* Test 3 */
                name = "Verifying StockItem.addStock() new stock equals 100";
                System.out.println(name);
                testItem = new StockItem(99, 1, "test");
                testItem.addStock(1);
                message = (passed = testItem.getQuantity() == 100) ?
                    "addStock is functioning in the base case"
                    : "Expected quantity to be 100, got" + testItem.getQuantity();
                break;
            case 3:
                /* Test 4 */
                input = new Scanner(System.in);
                name = "Verifying StockItem.addStock() adding negative stock";
                System.out.println(name);
                testItem = new StockItem(1, 1, "test");
                testItem.addStock(-1);
                System.out.print("Did you see an error? [Y/n] ");
                message = (passed = input.hasNext("[Yy]")) ?
                    "addStock is functioning in the negative stock case"
                    : "addStock didn't show an error message, quantity: "
                      + testItem.getQuantity();
                break;
            case 4:
                /* Test 5 */
                name = "Verifying StockItem.sellStock() base case";
                System.out.println(name);
                testItem = new StockItem(3, 1, "test");
                returned = testItem.sellStock(2);
                message = (passed = (testItem.getQuantity() == 1
                                    && returned)) ?
                    "sellStock is functioning in the base case"
                    : "Expected quantity to be 1, got" + testItem.getQuantity();
                break;
            case 5:
                /* Test 6 */
                input = new Scanner(System.in);
                name = "Verifying StockItem.sellStock() not enough stock";
                System.out.println(name);
                testItem = new StockItem(1, 1, "test");
                returned = testItem.sellStock(2);
                System.out.print("Did you see an error? [Y/n] ");
                message = (passed = input.hasNext("[Yy]")) && !returned ?
                    "sellStock is functioning in the not enough stock case"
                    : "sellStock failed in the not enough stock case, returned " + returned;
                break;
            case 6:
                /* Test 7 */
                input = new Scanner(System.in);
                name = "Verifying StockItem.sellStock() selling negative stock";
                System.out.println(name);
                testItem = new StockItem(1, 1, "test");
                returned = testItem.sellStock(-1);
                System.out.print("Did you see an error? [Y/n] ");
                message = (passed = input.hasNext("[Yy]")) && !returned ?
                    "sellStock is functioning in the negative stock case"
                    : "sellStock failed in the negative stock case, returned " + returned;
                break;
            case 7:
                /* Test 8 */
                name = "Verifying StockItem.getVAT()";
                System.out.println(name);
                double VAT = StockItem.getVAT();
                message = ((passed = VAT == 17.5) ? 
                    "StockItem.getVAT() is functioning"
                    : "StockItem.getVAT() is returning " + VAT);
                break;
            case 8:
                /* Test 9 */
                input = new Scanner(System.in);
                name = "Verifying StockItem.toString()";
                System.out.println(name);
                testItem = new StockItem(10, 5.5f, "A1");
                System.out.println(testItem);
                System.out.print("Did you see an adequate textual representation? [Y/n] ");
                message = (passed = input.hasNext("[Yy]")) ?
                    "toString is functioning"
                    : "toString is not functioning";
                break;
            case 9:
                /* Test 10 */
                name = "Verifying StockItem.getPrice()";
                System.out.println(name);
                testItem = new StockItem(1, 4.85f, "test");
                message = (passed = testItem.getPrice() == 4.85f) ?
                    "getPrice is working"
                    : "getPrice is not working, returned " + testItem.getPrice();
                break;
            case 10:
                /* Test 11 */
                name = "Verifying StockItem.getVATPrice()";
                System.out.println(name);
                testItem = new StockItem(1, 4.85f, "test");
                message = (passed = testItem.getVATPrice() == 5.7f) ?
                    "getVATPrice is working"
                    : "getVATPrice is not working, expected 5.7, returned " + testItem.getPrice();
                break;
            case 11:
                /* Test 12 */
                name = "Verifying StockItem.setPrice()";
                System.out.println(name);
                testItem = new StockItem(1, 8.88f, "test");
                testItem.setPrice(8.88f);
                message = (passed = testItem.getPrice() == 8.88f) ?
                    "setPrice is working"
                    : "setPrice is not working, expected 8.88, got " + testItem.getPrice();
                break;
            default:
                passed = false;
                name    = "Unimplemented test";
                System.out.println(name);
                message = "Test hasn't been implemented";
                break;
        }

        System.out.println("Test " + (passed ? "passed" : "failed"));
        System.out.println();
        return new TestResult(name, passed, message);
    }

    public static void main(String[] args)
    {
        int NUMTESTS = 12, i;
        TestResult[] results = new TestResult[NUMTESTS];

        for(i = 0; i < NUMTESTS; i++)
        {
            results[i] = runTest(i);
        }
        System.out.printf("%d tests run, %d tests passed, %d tests failed\n",
                          NUMTESTS, TestResult.testsPassed, TestResult.testsFailed);
    }
}

