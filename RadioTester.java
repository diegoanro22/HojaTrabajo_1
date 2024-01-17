/*Universidad del Valle de Guatemala 
 *Genser Andree - 23401
 *Diego Rosales - 23258
*/

import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class RadioTester {
    
    Radio radioTest = new Radio();

    @Test 
    public void testNextStation(){
        assertTrue(radioTest.isAM());
    }

}
