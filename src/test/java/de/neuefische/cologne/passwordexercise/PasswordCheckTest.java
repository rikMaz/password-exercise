package de.neuefische.cologne.passwordexercise;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckTest {

    //Check Password Length

    @Test
    @DisplayName("Das Password muss mind. 8 Zeichen lang sein")
    public void testCheckPasswordLengthTrue() {
        //GIVEN
        String inputPassword = "aaaaaaaa";
        //WHEN
        boolean resultLength = PasswordCheck.checkPasswordLength(inputPassword);
        //THEN
        assertTrue(resultLength);
    }

    @Test
    @DisplayName("Das Password muss mind. 8 Zeichen lang sein")
    public void testCheckPasswordLengthFalse() {
        //GIVEN
        String inputPassword = "aaaaaaa";
        //WHEN
        boolean result= PasswordCheck.checkPasswordLength(inputPassword);
        //THEN
        assertFalse(result);
    }

    //Check Number Included

    @Test
    @DisplayName("Das Password muss mind. 1 Zahl enthalten")
    public void testCheckPasswordNumberIncludedTrue() {
        //GIVEN
        String inputPassword = "aaaaaaa97895675asdaf";
        //WHEN
        boolean result = PasswordCheck.checkPasswordNumberIncluded(inputPassword);
        //THEN
        assertTrue(result);
    }

    @Test
    @DisplayName("Das Password muss mind. 1 Zahl enthalten")
    public void testCheckPasswordNumberIncludedFalse() {
        //GIVEN
        String inputPassword = "aaaaaaaa";
        //WHEN
        boolean result = PasswordCheck.checkPasswordNumberIncluded(inputPassword);
        //THEN
        assertFalse(result);
    }

    //Check if Lowercase Included

    @Test
    @DisplayName("Das Password muss mind. 1 kleinen Buchstaben enthalten")
    public void testCheckPasswordLowercaseIncludedTrue() {
        //GIVEN
        String inputPassword = "aAAAAAAA";
        //WHEN
        boolean result = PasswordCheck.checkPasswordLowercaseIncluded(inputPassword);
        //THEN
        assertTrue(result);
    }

    @Test
    @DisplayName("Das Password muss mind. 1 kleinen Buchstaben enthalten")
    public void testCheckPasswordLowercaseIncludedFalse() {
        //GIVEN
        String inputPassword = "AAAAAAAA";
        //WHEN
        boolean result = PasswordCheck.checkPasswordLowercaseIncluded(inputPassword);
        //THEN
        assertFalse(result);
    }

    //Check if Lowercase Included

    @Test
    @DisplayName("Das Password muss mind. 1 großen Buchstaben enthalten")
    public void testCheckPasswordUppercaseIncludedTrue() {
        //GIVEN
        String inputPassword = "Aaaaaaaa";
        //WHEN
        boolean result = PasswordCheck.checkPasswordUppercaseIncluded(inputPassword);
        //THEN
        assertTrue(result);
    }

    @Test
    @DisplayName("Das Password muss mind. 1 großen Buchstaben enthalten")
    public void testCheckPasswordUppercaseIncludedFalse() {
        //GIVEN
        String inputPassword = "aaaaaaaaa";
        //WHEN
        boolean result = PasswordCheck.checkPasswordUppercaseIncluded(inputPassword);
        //THEN
        assertFalse(result);
    }

    //

    @ParameterizedTest (name="InputPassword {0} returnString {1}")
    @CsvSource({
            "aaaaaaa, Passwort muss mind. 8 Zeichen enthalten",
            "aaaaaaaa, Passwort muss mind. eine Zahl enthalten",
            "AAAAAAA1, Passwort muss mind. einen kleinen Buchsaben enthalten",
            "aa2abas2, Passwort muss mind. einen großen Buchstaben enthalten",
            "a1Fhsw5t, Passwort ist GEIL"
    })
    public void testCheckPassword(String password, String expectedString){
        String result = PasswordCheck.checkPassword(password);
        assertEquals(expectedString,result);
    }





}