package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
public class matchBracketsTest {


    @Test
    public void matchBracketsValidateString_NestedValidInput_ReturnsOne() {
        assertEquals(matchBrackets.validateString("{ [] ( ) }"), 1);
    }

    @Test
    public void matchBracketsValidateString_PairedValidInput_ReturnsOne() {
        assertEquals(matchBrackets.validateString("{} [] () {}"), 1);
    }

    @Test
    public void matchBracketsValidateString_InValidInput_ReturnsZero(){
        assertEquals(matchBrackets.validateString("{ [(] ) }"), 0 );
    }

    @Test
    public void matchBracketsValidateString_SimpleInValidInput_ReturnsZero(){
        assertEquals(matchBrackets.validateString("{ [ }"), 0 );
    }

    @Test
    public void matchBracketsValidateString_EmptyInValidInput_ReturnsZero(){
        assertEquals(matchBrackets.validateString(""), 0 );
    }


    @Test
    public void matchBracketsValidateString_JavaScriptValidInput_ReturnsOne(){
        assertEquals(matchBrackets.validateString("const myFunction = (foo) => {return foo + \"bar\"}"), 1 );
    }

    @Test
    public void matchBracketsValidateString_JavaScriptInValidInput_ReturnsZero(){
        assertEquals(matchBrackets.validateString("const myFunction = (foo)) => {return foo + \"bar\"}"), 0 );
    }
}