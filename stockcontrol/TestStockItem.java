
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
        boolean passed;
        String message;
        String name;
        Scanner input;
        
        switch(testNum)
        {
            case 0:
                /* Test 1 */
                name = "Verifying StockItem.addStock() base case";
                System.out.println(name);
                testItem = new StockItem(1, 1, "test");
                testItem.addStock(2);
                message = (passed = testItem.quantity == 3) ?
                    "addStock is functioning in the base case"
                    : "Expected quantity to be 3, got" + testItem.quantity;
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
                      + testItem.quantity;
                break;
            case 2:
               /* Test 3 */
                name = "Verifying StockItem.addStock() new stock equals 100";
                System.out.println(name);
                testItem = new StockItem(99, 1, "test");
                testItem.addStock(1);
                message = (passed = testItem.quantity == 100) ?
                    "addStock is functioning in the base case"
                    : "Expected quantity to be 100, got" + testItem.quantity;
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
                      + testItem.quantity;
                break;
            case 4:
                /* Test 5 */
                boolean returned;
                name = "Verifying StockItem.sellStock() base case";
                System.out.println(name);
                testItem = new StockItem(3, 1, "test");
                returned = testItem.sellStock(2);
                message = (passed = (testItem.quantity == 1
                                    && returned)) ?
                    "sellStock is functioning in the base case"
                    : "Expected quantity to be 1, got" + testItem.quantity;
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
        int NUMTESTS = 13, i;
        TestResult[] results = new TestResult[NUMTESTS];
        StockItem testItem;

        for(i = 0; i < NUMTESTS; i++)
        {
            results[i] = runTest(i);
        }
        System.out.printf("%d tests run, %d tests passed, %d tests failed\n",
                          NUMTESTS, TestResult.testsPassed, TestResult.testsFailed);
    }
}

