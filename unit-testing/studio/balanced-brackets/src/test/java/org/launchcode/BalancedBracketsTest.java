package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    String word,word2,word3,word4, word5;

    @BeforeEach
    public void createWords(){
        word = "[LaunchCode]";
        word2 = "[LaunchCode";
        word3 = "[[launchcode]]";
        word4 = "[[[[toast]]]";
        word5 = "[]]vince[";
    }

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }



    @Test
    public void testWordBalanced(){
        assertEquals(true, BalancedBrackets.hasBalancedBrackets(word));
        assertEquals(false, BalancedBrackets.hasBalancedBrackets(word5));
    }
    @Test
    public void testUnbalanced(){
        assertNotEquals(true,BalancedBrackets.hasBalancedBrackets(word2));
    }
    @Test
    public void isAssertTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(word3));
    }

    @Test
    public void doesMultipleUnbalancedBracketsFail(){
        assertNotEquals(true,BalancedBrackets.hasBalancedBrackets(word4));
    }

    public void testAssertFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets(word4));
    }

}