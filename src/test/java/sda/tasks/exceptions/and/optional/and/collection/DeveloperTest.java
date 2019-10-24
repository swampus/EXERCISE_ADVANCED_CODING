package sda.tasks.exceptions.and.optional.and.collection;


import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class DeveloperTest {

    private Developer developer = new Developer();

    @Test
    public void addElementToPositionAndReverse() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        developer.addElementToPositionAndReverse(list, 2, 10);

        assertEquals(new Integer(3), list.get(0));
        assertEquals(new Integer(10), list.get(1));
        assertEquals(new Integer(2), list.get(2));
        assertEquals(new Integer(1), list.get(3));

    }

    @Test
    public void getKeyWithBiggestIntegerValue() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 15);
        map.put("C", 1);

        assertEquals("B", developer.getKeyWithBiggestIntegerValue(map));

    }

    @Test
    public void getListOfElementsThatAreSameForBothLists() {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("A");
        list1.add("B");
        list1.add("C");

        list2.add("B");
        list2.add("C");

        List<String> result = developer.getListOfElementsThatAreSameForBothLists(list1, list2);

        assertTrue(result.contains("B"));
        assertTrue(result.contains("C"));
        assertEquals(2, result.size());

    }

    @Test
    public void createHashMapFromList() {
        List<String> list = new ArrayList<>();
        list.add("K1:1");
        list.add("K2:2");

        Map<String, Integer> map = developer.createHashMapFromList(list);

        assertEquals(new Integer(1), map.get("K1"));
        assertEquals(new Integer(2), map.get("K2"));

    }

    @Test
    public void createMapThatWillKeepOrderOfElementsAndAdd3Element() {
        Map<String, Integer> result = developer.createMapThatWillKeepOrderOfElementsAndAdd3Element();
        assertTrue(result instanceof LinkedHashMap);
        assertEquals(3, result.size());

    }
}