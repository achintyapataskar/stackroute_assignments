import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListEraseTest {
    @Test
    public void addToListNull() {
        ListErase le = new ListErase();
        ArrayList<String> ls = new ArrayList<String>();
        ArrayList<String> ls_new = new ArrayList<String>();
        assertEquals(ls, le.addToList(""));
    }

    @Test
    public void addElementToListFirstElement() {
        ListErase le = new ListErase();
        ArrayList<String> ls = new ArrayList<String>();
        ls.add("Bohemian Rhapsody");
        assertEquals(ls, le.addToList("Bohemian Rhapsody"));
    }

    @Test
    public void addElementToListSusbsequentElement() {
        ListErase le = new ListErase();
        ArrayList<String> ls = new ArrayList<>();
        ls.add("Bohemian Rhapsody");
        ls.add("Radio Ga Ga, Radio Goo Goo");
        le.addToList("Bohemian Rhapsody");
        assertEquals(ls, le.addToList("Radio Ga Ga, Radio Goo Goo"));
    }

    @Test
    public void substituteElementInBlankList() {
        ListErase le = new ListErase();
        ArrayList<String> ls = new ArrayList<>();
        assertFalse(le.susbstitue("Bohemain Rhapsody", "I want to be free"));
    }

    @Test
    public void substituteElementInSingleElementList() {
        ListErase le = new ListErase();
        le.list.add("Don't stop me now");
        assertFalse(le.susbstitue("I want to be free", "Bohemian Rhapsody"));
    }

    @Test
    public void substituteSingleElementSucess() {
        ListErase le = new ListErase();
        le.list.add("I want to be free");
        assertTrue(le.susbstitue("I want to be free", "Bohemian Rhapsody"));
    }

    @Test
    public void substituteLastElementFail() {
        ListErase le = new ListErase();
        le.list.add("Another one bites the dust");
        le.list.add("Aye-oh");
        le.list.add("Radio Ga Ga");
        assertFalse(le.susbstitue("Another one bites the dust.", "Bohemian Rhapsody"));
    }
    @Test
    public void substituteLastElementSucess() {
        ListErase le = new ListErase();
        ArrayList<String> ls = new ArrayList<>();
        le.list.add("Another one bites the dust");
        le.list.add("Aye-oh");
        le.list.add("Radio Ga Ga");
        assertTrue(le.susbstitue("Radio Ga Ga", "Bohemian Rhapsody"));
    }

    @Test
    public void eraseEmptyList() {
        ListErase le = new ListErase();
        le.eraseList();
        assertTrue(le.list.isEmpty());
    }

    @Test
    public void eraseList() {
        ListErase le = new ListErase();
        le.list.add("Bohemian Rhapsody");
        le.list.add("Another one bites the dust");
        le.eraseList();
        assertTrue(le.list.isEmpty());
    }

    @Test
    public void eraseSingleElementList() {
        ListErase le = new ListErase();
        le.list.add("Bohemian Rhapsody");
        le.eraseList();
        assertTrue(le.list.isEmpty());
    }

    @Test
    public void printBlankList() {
        ListErase le = new ListErase();
        assertEquals("", le.printList());
    }

    @Test
    public void printSingleElementList() {
        ListErase le = new ListErase();
        le.list.add("Another one bites the dust");
        assertEquals("Another one bites the dust", le.printList());
    }
    @Test
    public void printList() {
        ListErase le = new ListErase();
        le.list.add("Another one bites the dust");
        le.list.add("bohemian rhapsody");
        le.list.add("Love of my life");
        le.list.add("I want to break free");
        assertEquals("Another one bites the dust bohemian rhapsody Love of my life I want to break free", le.printList());
    }
}