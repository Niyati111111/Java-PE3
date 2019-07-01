package com.stackroute.PE3;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class RemoveVowelsTest {

    RemoveVowels removeVowels;

    @Before
    public void setUp() {
        removeVowels = new RemoveVowels();
    }

    @After
    public void tearDown() {
        removeVowels = null;
    }

    @Test
    public void inputStringArrayReturnsStringArray() {
        String places[] = {"India", "United States", "Germany", "Egypt", "Czechoslovakia"};
        String result[] = removeVowels.removeVowels(places);
        String expected[] = {"nd","ntd stts","grmny","gypt","czchslvk"};
        assertEquals(expected,result);
    }

    @Test
    public void inputStringArray1ReturnsStringArray() {
        String places[] = {"India", "", "Germany", "Egypt", "Czechoslovakia"};
        String result[] = removeVowels.removeVowels(places);
        String expected[] = {"nd","","grmny","gypt","czchslvk"};
        assertEquals(expected,result);
    }

    @Test
    public void inputStringArray2ReturnsStringArray() {
        String places[] = {"India", "12345", "Germany", "Egypt", "Czechoslovakia"};
        String result[] = removeVowels.removeVowels(places);
        String expected[] = {"nd","12345","grmny","gypt","czchslvk"};
        assertEquals(expected,result);
    }


}