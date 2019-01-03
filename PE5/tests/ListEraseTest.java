import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListEraseTest {
    private ListErase le;
    @Before
    public void initObjectOfListEraseClass() {
        le = new ListErase();
    }
    @Test
    public void addToListNull() {
        ArrayList<String> ls = new ArrayList<String>();
        ArrayList<String> ls_new = new ArrayList<String>();
        assertEquals(ls, le.addToList(""));
    }

    @Test
    public void addElementToListFirstElement() {
        ArrayList<String> ls = new ArrayList<String>();
        ls.add("Bohemian Rhapsody");
        assertEquals(ls, le.addToList("Bohemian Rhapsody"));
    }

    @Test
    public void addElementToListSusbsequentElement() {
        ArrayList<String> ls = new ArrayList<>();
        ls.add("Bohemian Rhapsody");
        ls.add("Radio Ga Ga, Radio Goo Goo");
        le.addToList("Bohemian Rhapsody");
        assertEquals(ls, le.addToList("Radio Ga Ga, Radio Goo Goo"));
    }

    @Test
    public void substituteElementInBlankList() {
        ArrayList<String> ls = new ArrayList<>();
        assertFalse(le.susbstitue("Bohemain Rhapsody", "I want to be free"));
    }

    @Test
    public void substituteElementInSingleElementList() {
        le.list.add("Don't stop me now");
        assertFalse(le.susbstitue("I want to be free", "Bohemian Rhapsody"));
    }

    @Test
    public void substituteSingleElementSucess() {
        le.list.add("I want to be free");
        assertTrue(le.susbstitue("I want to be free", "Bohemian Rhapsody"));
    }

    @Test
    public void substituteLastElementFail() {
        le.list.add("Another one bites the dust");
        le.list.add("Aye-oh");
        le.list.add("Radio Ga Ga");
        assertFalse(le.susbstitue("Another one bites the dust.", "Bohemian Rhapsody"));
    }
    @Test
    public void substituteLastElementSucess() {
        ArrayList<String> ls = new ArrayList<>();
        le.list.add("Another one bites the dust");
        le.list.add("Aye-oh");
        le.list.add("Radio Ga Ga");
        assertTrue(le.susbstitue("Radio Ga Ga", "Bohemian Rhapsody"));
    }

    @Test
    public void eraseEmptyList() {
        le.eraseList();
        assertTrue(le.list.isEmpty());
    }

    @Test
    public void eraseList() {
        le.list.add("Bohemian Rhapsody");
        le.list.add("Another one bites the dust");
        le.eraseList();
        assertTrue(le.list.isEmpty());
    }

    @Test
    public void eraseSingleElementList() {
        le.list.add("Bohemian Rhapsody");
        le.eraseList();
        assertTrue(le.list.isEmpty());
    }

    @Test
    public void printBlankList() {
        assertEquals("", le.printList());
    }

    @Test
    public void printSingleElementList() {
        le.list.add("Another one bites the dust");
        assertEquals("Another one bites the dust", le.printList());
    }
    @Test
    public void printList() {
        le.list.add("Another one bites the dust");
        le.list.add("bohemian rhapsody");
        le.list.add("Love of my life");
        le.list.add("I want to break free");
        assertEquals("Another one bites the dust bohemian rhapsody Love of my life I want to break free", le.printList());
    }
}