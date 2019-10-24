package sda.tasks.stream;

import org.junit.Test;
import sda.tasks.stream.objects.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SeniorTest {

    private Senior senior = new Senior();

    @Test
    public void createDnaFromListOfNucleoside() {
        List<List<Nucleoside>> nucleosides = new ArrayList<>();

        List<Nucleoside> list1 = new ArrayList<>();
        List<Nucleoside> list2 = new ArrayList<>();
        List<Nucleoside> list3 = new ArrayList<>();

        Thymine thymine1 = new Thymine();
        Thymine thymine2 = new Thymine();

        Adenine adenine1 = new Adenine();
        Adenine adenine2 = new Adenine();
        Adenine adenine3 = new Adenine();

        Cytosine cytosine1 = new Cytosine();
        Guanine guanine3 = new Guanine();

        list1.add(thymine1);
        list1.add(adenine1);
        list1.add(cytosine1);

        list2.add(thymine2);
        list2.add(adenine2);

        list3.add(adenine3);
        list3.add(guanine3);

        nucleosides.add(list1);
        nucleosides.add(list2);
        nucleosides.add(list3);

        DNA result = senior.createDnaFromListOfNucleoside(nucleosides);

        assertEquals(thymine1, result.getNucleosides().get(0));
        assertEquals(adenine1, result.getNucleosides().get(1));
        assertEquals(cytosine1, result.getNucleosides().get(2));
        assertEquals(thymine2, result.getNucleosides().get(3));
        assertEquals(adenine2, result.getNucleosides().get(4));
        assertEquals(adenine3, result.getNucleosides().get(5));
        assertEquals(guanine3, result.getNucleosides().get(6));


    }

    @Test
    public void extractAllACRTbaseFromAllDnaIfExists() {

        List<DNA> dnas = new ArrayList<>();
        DNA dna1 = new DNA();
        List<Nucleoside> list1 = new ArrayList<>();
        Thymine thymine1 = new Thymine();
        thymine1.setACRTbase("A1");

        Thymine thymine2 = new Thymine();
        thymine2.setACRTbase("A2");

        list1.add(thymine1);
        list1.add(thymine2);
        dna1.setNucleosides(list1);


        DNA dna2 = new DNA();
        List<Nucleoside> list2 = new ArrayList<>();

        Thymine thymine12 = new Thymine();
        thymine12.setACRTbase("A3");
        Adenine adenine12 = new Adenine();
        adenine12.setACRTbase(null);

        Cytosine cytosine13 = new Cytosine();
        cytosine13.setACRTbase("null");

        Guanine guanine14 = new Guanine();
        guanine14.setACRTbase("A4");

        list2.add(thymine12);
        list2.add(adenine12);
        list2.add(cytosine13);
        list2.add(guanine14);

        dna2.setNucleosides(list2);

        DNA dna3 = new DNA();

        Thymine thymine13 = new Thymine();
        thymine13.setACRTbase(null);
        Adenine adenine13 = new Adenine();
        adenine13.setACRTbase("A5");

        List<Nucleoside> list3 = new ArrayList<>();

        list3.add(thymine13);
        list3.add(adenine13);

        dna3.setNucleosides(list3);


        dnas.add(dna1);
        dnas.add(dna2);
        dnas.add(dna3);

        List<String> result = senior.extractAllACRTbaseFromAllDnaIfExists(dnas);

        assertEquals("A1", result.get(0));
        assertEquals("A2", result.get(1));
        assertEquals("A3", result.get(2));
        assertEquals("null", result.get(3));
        assertEquals("A4", result.get(4));
        assertEquals("A5", result.get(5));

    }

    @Test
    public void extractAllNucleosideFromDNA() {
        DNA dna = new DNA();
        List<Nucleoside> list = new ArrayList<>();
        Thymine thymine1 = new Thymine();
        Thymine thymine2 = new Thymine();
        Adenine adenine = new Adenine();
        Guanine guanine1 = new Guanine();
        Guanine guanine2 = new Guanine();

        list.add(thymine1);
        list.add(thymine2);
        list.add(adenine);
        list.add(guanine1);
        list.add(guanine2);

        dna.setNucleosides(list);

        List<List<Nucleoside>> result = senior.extractAllNucleosideFromDNA(dna);

        List<Nucleoside> adenines = result.get(0);
        List<Nucleoside> cytosines = result.get(1);
        List<Nucleoside> guanines = result.get(2);
        List<Nucleoside> thymines = result.get(3);

        assertEquals(thymine1, thymines.get(0));
        assertEquals(thymine2, thymines.get(1));

        assertEquals(adenine, adenines.get(0));

        assertEquals(guanine1, guanines.get(0));
        assertEquals(guanine2, guanines.get(1));

        assertEquals(0, cytosines.size());

    }

    @Test
    public void replaceEachValueInMapWithLongestStringInList() {
        List list1 = new ArrayList();
        list1.add("11");
        list1.add("2222");
        list1.add("333");

        List list2 = new ArrayList();
        list2.add("111111");
        list2.add("22222");
        list2.add("33333");

        List list3 = new ArrayList();
        list3.add("11");
        list3.add("2222");
        list3.add("3333333333");


        Map<String, List<String>> map = new HashMap<>();
        map.put("A", list1);
        map.put("B", list2);
        map.put("C", list3);

        //

        List list21 = new ArrayList();
        list21.add("A");
        list21.add("BBBBBBB");
        list21.add("CC");

        List list22 = new ArrayList();
        list22.add("DDDDDDDDDDDDDDDD");
        list22.add("E");

        List list23 = new ArrayList();
        list23.add("1");


        Map<String, List<String>> map2 = new HashMap<>();
        map2.put("A2", list21);
        map2.put("B2", list22);
        map2.put("C2", list23);

        List<Map<String, List<String>>> params = new ArrayList<>();
        params.add(map);
        params.add(map2);

        List<Map<String, String>> result = senior.replaceEachValueInMapWithLongestStringInList(params);

        assertEquals("2222", result.get(0).get("A"));
        assertEquals("111111", result.get(0).get("B"));
        assertEquals("3333333333", result.get(0).get("C"));

        assertEquals("BBBBBBB", result.get(1).get("A2"));
        assertEquals("DDDDDDDDDDDDDDDD", result.get(1).get("B2"));
        assertEquals("1", result.get(1).get("C2"));

    }

    @Test
    public void getAllACRTbaseAndWightAsMap() {
        DNA dna = new DNA();
        Thymine thymine1 = new Thymine();
        thymine1.setACRTbase("K1");
        thymine1.setWight(1);

        Thymine thymine2 = new Thymine();
        thymine2.setACRTbase("K2");
        thymine2.setWight(2);

        Adenine adenine = new Adenine();
        adenine.setACRTbase("K1");
        adenine.setWight(22);


        Guanine guanine1 = new Guanine();
        guanine1.setACRTbase("K1");
        guanine1.setWight(33);

        Cytosine cytosine = new Cytosine();
        cytosine.setACRTbase("K3");
        cytosine.setWight(33);

        List<Nucleoside> nucleosides = new ArrayList<>();

        nucleosides.add(thymine1);
        nucleosides.add(thymine2);
        nucleosides.add(adenine);
        nucleosides.add(guanine1);
        nucleosides.add(cytosine);

        dna.setNucleosides(nucleosides);


        Map<String, Integer> result = senior.getAllACRTbaseAndWightAsMap(dna);

        assertEquals(new Integer(1), result.get("K1"));
        assertEquals(new Integer(2), result.get("K2"));
        assertEquals(new Integer(22), result.get("K1_1"));
        assertEquals(new Integer(33), result.get("K1_2"));
        assertEquals(new Integer(33), result.get("K3"));


    }


}