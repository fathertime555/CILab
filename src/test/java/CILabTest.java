import org.junit.jupiter.api.AfterEach;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertFalse;

import static org.junit.jupiter.api.Assertions.fail;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectFirstCapital() {
    	myString.setString("Test");
    	boolean result = myString.detectCapitalUse;
    	assertTrue("Capital use is not detecting proper capitalization", result);
    }
    
    @Test
    public void detectAllCapital() {
    	myString.setString("TEST");
        boolean result = myString.detectCapitalUse;
        assertTrue("Capital use is not detecting all upper case", result);
    }

    @Test
    public void detectAllLowercase() {
    	myString.setString("test");
        boolean result = myString.detectCapitalUse;
        assertTrue("Capital use is not detecting all lower case", result);
    }
    
    @Test
    public void detectRandomCapital() {
    	myString.setString("TeSt");
    	boolean result = myString.detectCapitalUse;
    	assertFalse("Capital use is not detecting random capitals", result);
    }

}
