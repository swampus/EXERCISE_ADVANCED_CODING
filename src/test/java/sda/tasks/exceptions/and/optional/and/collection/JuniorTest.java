package sda.tasks.exceptions.and.optional.and.collection;


import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class JuniorTest {

    private Junior junior = new Junior();

    @Test
    public void createList() {
        List result = junior.createList();
        assertTrue(result instanceof LinkedList);
    }

    @Test
    public void arrayToList() {
        String[] arr = {"A", "B", "C"};
        List<String> result = junior.arrayToList(arr);
        assertEquals("A", result.get(0));
        assertEquals("B", result.get(1));
        assertEquals("C", result.get(2));
    }

    @Test
    public void getElementFromPositionAndAdd5ToIt() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Integer result = junior.getElementFromPositionAndAdd5ToIt(list, 1);
        assertEquals(new Integer(7), result);
    }

    @Test
    public void createSetWith3AnyElements() {
        Set<String> set = junior.createSetWith3AnyElements();
        assertEquals(3, set.size());
    }

    @Test
    public void createHashMapStringIntеger() {
        Object obj = junior.createHashMapStringIntеger();
        assertTrue(obj instanceof HashMap);
        HashMap<String, Integer> hashMap = (HashMap<String, Integer>) obj;

    }
}