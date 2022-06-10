import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

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
    	boolean result = myString.detectCapitalUse();
    	assertTrue(result, "Capital use is not detecting proper capitalization");
    }
    
    @Test
    public void detectAllCapital() {
    	myString.setString("TEST");
        boolean result = myString.detectCapitalUse();
        assertTrue(result, "Capital use is not detecting all upper case");
    }

    @Test
    public void detectAllLowercase() {
    	myString.setString("test");
        boolean result = myString.detectCapitalUse();
        assertTrue(result, "Capital use is not detecting all lower case");
    }
    
    @Test
    public void detectRandomCapital() {
    	myString.setString("TeSt");
    	boolean result = myString.detectCapitalUse();
    	assertFalse(result, "Capital use is not detecting random capitals");
    }

}
