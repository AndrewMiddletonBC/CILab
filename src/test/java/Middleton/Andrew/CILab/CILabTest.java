package Middleton.Andrew.CILab;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

@SuppressWarnings("unused")
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
    public void allLettersCapitalReturnsTrueTest() {
       myString.setString("TEST");
       assertTrue(myString.detectCapitalUse());
    }
    
    @Test
    public void noLettersCapitalReturnsTrueTest() {
        myString.setString("test");
        assertTrue(myString.detectCapitalUse());
    }
    
    @Test
    public void onlyFirstLetterCapitalReturnsTrueTest() {
       myString.setString("Test");
       assertTrue(myString.detectCapitalUse());
    }
    
    @Test
    public void emptyStringReturnsTrueTest() {
       myString.setString("");
       assertTrue(myString.detectCapitalUse());
    }
    
    @Test
    public void onlyNonLettersReturnsTrueTest() {
    	myString.setString("1@2&3!");
        assertTrue(myString.detectCapitalUse());
    }
    
    @Test
    public void allCapitalsOneNonLetterFalseTest() {
    	myString.setString("TEST1");
        assertFalse(myString.detectCapitalUse());
    }
    
    @Test
    public void middleLetterCapitalReturnsFalseTest() {
    	myString.setString("tEst");
        assertFalse(myString.detectCapitalUse());
    }


}
