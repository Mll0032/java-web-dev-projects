package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    //this test was input for us. it tests if true is equal to true which is true. maybe for setup and to add packages
    @Test
    public void emptyTest() {

        assertEquals(true, true);
    }

    //reworked onlyBracketsReturnTrue to send a message if the return is false
    @Test
    public void onlyBracketsReturnsTrue() {
        String msg = "should return true for balanced brackets: []";
        boolean conditional = BalancedBrackets.hasBalancedBrackets("[]");
        assertTrue(conditional, msg);
    }

    @Test
    public void onlyBracketsReturnsTrueBracketsInFront() {
        String msg = "should return true for balanced brackets has brackets then letter: []Hello";
        boolean conditional = BalancedBrackets.hasBalancedBrackets("[]Hello");
        assertTrue(conditional, msg);
    }

    @Test
    public void onlyBracketsReturnsTrueBracketsLettersInFront() {
        String msg = "should return true for balanced brackets has letters then bracket: Hello[]";
        boolean conditional = BalancedBrackets.hasBalancedBrackets("Hello[]");
        assertTrue(conditional, msg);
    }

    @Test
    public void emptyStringReturnsTrue() {
        String msg = "should return true for empty input";
        boolean conditional = BalancedBrackets.hasBalancedBrackets("");
        assertTrue(conditional, msg);
    }

    @Test
    public void onlyBracketsReturnTrueOneOfTheLetterInside(){
        String msg = " Should return true one of the letter inside the bracket : [H]ello";
        boolean conditional = BalancedBrackets.hasBalancedBrackets("[H]ello");
        assertTrue(conditional, msg);
    }

    @Test
    public void singleLeftBracketReturnsFalse() {
        String msg = " Should return false if only left bracket: [";
        boolean conditional = BalancedBrackets.hasBalancedBrackets("[");
        assertFalse(conditional, msg);
    }

    @Test
    public void reverseBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void nestedBracketsReturnTrue(){
        String msg = " Should return true when there are nested brackets : [[[[LaunchCode]]]]";
        boolean conditional = BalancedBrackets.hasBalancedBrackets("[[[[LaunchCode]]]]");
        assertTrue(conditional, msg);
    }

    @Test
    public void multipleUnbalanceBracketsReturnsFalse(){
        String msg = " Should return false with multiple unbalanced brackets : [[[[LaunchCode]]]";
        boolean conditional = BalancedBrackets.hasBalancedBrackets("[[[[LaunchCode]]]");
        assertFalse(conditional, msg);
    }

    @Test
    public void doubleLeftBracketsReturnsFalseFive(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

    @Test
    public void nestedUnbalancedBracketsWithLettersReturnsFalse() {
    String msg = "Should return false when there are nested unbalanced brackets with letters : [L][]]aunchCode";
    boolean conditional = BalancedBrackets.hasBalancedBrackets("[L][]]aunchCode");
    assertFalse(conditional, msg);
}

}

