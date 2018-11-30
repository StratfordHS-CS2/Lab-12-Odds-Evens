import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class OddsEvensTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class OddsEvensTest
{
    /**
     * Testing the count method.
     */
    @Test(timeout=2000)
    public void countTest()
    {
        int[] mixed = {1,5,3,8,10,34,62,31,45,20};
        int mixedOdds = 5;
        int mixedEvens = 5;
        int[] even = {2,4,6,8,10,20,30,58};
        int[] odd = {1,3,5,7,9,11,13,15,19};
        int[] singleEven = {2};
        int[] singleOdd = {1};
        
        assertEquals( "Counting odds in array of mixed odds and evens failed.", mixedOdds, OddsEvens.count( mixed, true ) );
        assertEquals( "Counting evens in array of mixed odds and evens failed.", mixedEvens, OddsEvens.count( mixed, false ) );
        assertEquals( "Counting odds in an array of all evens failed.", 0, OddsEvens.count( even, true ) );
        assertEquals( "Counting evens in an array of all evens failed.", even.length, OddsEvens.count( even, false ) );
        assertEquals( "Counting odds in an array of all odds failed.", odd.length, OddsEvens.count( odd, true ) );
        assertEquals( "Counting evens in an array of all odds failed.", 0, OddsEvens.count( odd, false ) );
        assertEquals( "Counting odds in an array of a single even failed.", 0, OddsEvens.count( singleEven, true ) );
        assertEquals( "Counting evens in an array of a single even failed.", 1, OddsEvens.count( singleEven, false ) );
        assertEquals( "Counting odds in an array of a single odd failed.", 1, OddsEvens.count( singleOdd, true ) );
        assertEquals( "Counting evens in an array of a single odd failed.", 0, OddsEvens.count( singleOdd, false ) );
    }
    
    /**
     * Testing the getAllEvens method.
     */
    @Test(timeout=2000)
    public void getAllEvensTest()
    {
        int[] mixed = {1,5,3,8,10,34,62,31,45,20};
        int[] mixedResult = {8,10,34,62,20};
        int[] even = {2,4,6,8,10,20,30,58};
        int[] evenResult = {2,4,6,8,10,20,30,58};
        int[] odd = {1,3,5,7,9,11,13,15,19};
        int[] oddResult = {};
        int[] singleEven = {2};
        int[] singleEvenResult = {2};
        int[] singleOdd = {1};
        int[] singleOddResult = {};
        
        assertArrayEquals( "getAllEvens() with a mixed array failed.", mixedResult, OddsEvens.getAllEvens( mixed ) );
        assertArrayEquals( "getAllEvens() with an array of only evens failed.",evenResult, OddsEvens.getAllEvens( even ) );
        assertArrayEquals( "getAllEvens() with an array of only odds failed.",oddResult, OddsEvens.getAllEvens( odd ) );
        assertArrayEquals( "getAllEvens() with an array of a single even failed.",singleEvenResult, OddsEvens.getAllEvens( singleEven ) );
        assertArrayEquals( "getAllEvens() with an array of a single odd failed.",singleOddResult, OddsEvens.getAllEvens( singleOdd ) );
    }
    
    /**
     * Testing the getAllOdds method.
     */
    @Test(timeout=2000)
    public void getAllOddsTest()
    {
        int[] mixed = {1,5,3,8,10,34,62,31,45,20};
        int[] mixedResult = {1,5,3,31,45};
        int[] even = {2,4,6,8,10,20,30,58};
        int[] evenResult = {};
        int[] odd = {1,3,5,7,9,11,13,15,19};
        int[] oddResult = {1,3,5,7,9,11,13,15,19};
        int[] singleEven = {2};
        int[] singleEvenResult = {};
        int[] singleOdd = {1};
        int[] singleOddResult = {1};
        
        assertArrayEquals( "getAllOdds() with a mixed array failed.", mixedResult, OddsEvens.getAllOdds( mixed ) );
        assertArrayEquals( "getAllOdds() with an array of only evens failed.",evenResult, OddsEvens.getAllOdds( even ) );
        assertArrayEquals( "getAllOdds() with an array of only odds failed.",oddResult, OddsEvens.getAllOdds( odd ) );
        assertArrayEquals( "getAllOdds() with an array of a single even failed.",singleEvenResult, OddsEvens.getAllOdds( singleEven ) );
        assertArrayEquals( "getAllOdds() with an array of a single odd failed.",singleOddResult, OddsEvens.getAllOdds( singleOdd ) );
    }
}
