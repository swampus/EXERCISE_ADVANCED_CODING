package sda.tasks.exceptions.and.optional.and.collection;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SeniorTest {

    private Senior senior = new Senior();

    @Test
    public void hashMapWithElementsCount() {
        List<String> words = new ArrayList<>();
        words.add("A");
        words.add("B");
        words.add("B");
        words.add("C");
        words.add("A");
        words.add("A");
        words.add("D");
        words.add("D");

        Map<String, Integer> result = senior.hashMapWithElementsCount(words);
        assertEquals(new Integer(3), result.get("A"));
        assertEquals(new Integer(2), result.get("B"));
        assertEquals(new Integer(1), result.get("C"));
        assertEquals(new Integer(2), result.get("D"));

    }

    @Test
    public void updateHashMapDeleteElements() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        List<Integer> positionToDelete = new ArrayList<>();
        positionToDelete.add(2);
        positionToDelete.add(3);

        map.put("A", "aval");
        map.put("B", "bval");
        map.put("C", "cval");
        map.put("D", "dval");

        senior.updateHashMapDeleteElements(map, positionToDelete);

        assertEquals(2, map.size());
        assertFalse(map.containsKey("B"));
        assertFalse(map.containsKey("C"));
        assertTrue(map.containsKey("A"));
        assertTrue(map.containsKey("D"));


    }

    @Test
    public void listOfTheLists() {
        List<List<String>> result = senior.listOfTheLists(4);
        assertEquals(4, result.size());
        List<String> n1 = result.get(0);
        List<String> n2 = result.get(1);
        List<String> n3 = result.get(2);
        List<String> n4 = result.get(3);

        assertEquals("A1", n1.get(0));

        assertEquals("A1", n2.get(0));
        assertEquals("A2", n2.get(1));

        assertEquals("A1", n3.get(0));
        assertEquals("A2", n3.get(1));
        assertEquals("A3", n3.get(2));


        assertEquals("A1", n4.get(0));
        assertEquals("A2", n4.get(1));
        assertEquals("A3", n4.get(2));
        assertEquals("A4", n4.get(3));

    }

    @Test
    public void createList() {
        List<Object> list = new ArrayList<>();

        HashMap hashMap1 = new HashMap();
        HashMap hashMap2 = new HashMap();

        list.add(5);
        list.add(hashMap1);
        list.add(new ArrayList());
        list.add(hashMap2);

        List<Object> result = senior.createList(list, HashMap.class);
        assertEquals(hashMap1, result.get(0));
        assertEquals(hashMap2, result.get(1));

    }

    @Test
    public void returnListOfMaps() {

        List<String> ignoreList = new ArrayList<>();
        ignoreList.add("some");

        List<String> first = new ArrayList<>();
        first.add("fvlueS");
        first.add("fValueVeryVeryLong");

        List<String> second = new ArrayList<>();
        second.add("AAAA");
        second.add("BBB");

        Map<String, List<String>> map = new HashMap<>();
        map.put("NO_ingnore", ignoreList);
        map.put("ABC", first);
        map.put("NO_ingnore2", ignoreList);
        map.put("THE_A_THE", second);


        List<Map<String, String>> result = senior.returnListOfMaps(map);
        assertEquals("AAAA", result.get(0).get("0"));
        assertEquals("fValueVeryVeryLong", result.get(1).get("1"));

    }
}