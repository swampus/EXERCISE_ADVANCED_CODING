package sda.tasks.stream;

import org.junit.Test;
import sda.tasks.stream.objects.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DeveloperTest {

    private Developer developer = new Developer();

    @Test
    public void findAllACRTBaseAc() {
        List<Nucleoside> nucleosides = new ArrayList<>();
        Guanine guanine1 = new Guanine();
        guanine1.setACRTbase("AC+");

        Guanine guanine2 = new Guanine();
        guanine2.setACRTbase("AA");

        Cytosine cytosine = new Cytosine();
        cytosine.setACRTbase("CC");

        Thymine thymine = new Thymine();
        thymine.setACRTbase("AC+");

        Cytosine cytosine2 = new Cytosine();
        cytosine2.setACRTbase("AC+");

        nucleosides.add(guanine1);
        nucleosides.add(guanine2);
        nucleosides.add(thymine);
        nucleosides.add(cytosine);
        nucleosides.add(cytosine2);


        List<Nucleoside> result = developer.findAllACRTBaseAc(nucleosides);

        assertEquals(guanine1, result.get(0));
        assertEquals(thymine, result.get(1));
        assertEquals(cytosine2, result.get(2));
    }

    @Test
    public void addAtoEachString() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        List<String> result = developer.addAtoEachString(list);

        assertEquals("AA", result.get(0));
        assertEquals("BA", result.get(1));
        assertEquals("CA", result.get(2));

    }

    @Test
    public void findAllGuanineWithAcrtBase2() {

        List<Nucleoside> nucleosides = new ArrayList<>();
        Guanine guanine1 = new Guanine();
        guanine1.setACRTbase("AC+");

        Guanine guanine2 = new Guanine();
        guanine2.setACRTbase("2");


        Cytosine cytosine = new Cytosine();
        cytosine.setACRTbase("CC");

        Thymine thymine = new Thymine();
        thymine.setACRTbase("AC+");

        Cytosine cytosine2 = new Cytosine();
        cytosine2.setACRTbase("AC+");

        Guanine guanine3 = new Guanine();
        guanine3.setACRTbase("2");

        nucleosides.add(guanine1);
        nucleosides.add(guanine2);
        nucleosides.add(cytosine);
        nucleosides.add(cytosine2);
        nucleosides.add(thymine);
        nucleosides.add(guanine3);

        List<Guanine> result = developer.findAllGuanineWithAcrtBase2(nucleosides);

        assertEquals(guanine2, result.get(0));
        assertEquals(guanine3, result.get(1));

    }

    @Test
    public void findAllAdenineCytosine() {
        List<Nucleoside> nucleosides = new ArrayList<>();

        Adenine adenine = new Adenine();
        adenine.setWight(8);

        Adenine adenine2 = new Adenine();
        adenine2.setWight(11);

        Guanine guanine1 = new Guanine();
        guanine1.setACRTbase("AC+");
        guanine1.setWight(11);

        Guanine guanine2 = new Guanine();
        guanine2.setACRTbase("2");
        guanine2.setWight(1);

        Cytosine cytosine = new Cytosine();
        cytosine.setACRTbase("CC");
        cytosine.setWight(11);

        Thymine thymine = new Thymine();
        thymine.setACRTbase("AC+");


        Cytosine cytosine2 = new Cytosine();
        cytosine2.setACRTbase("AC+");
        cytosine2.setWight(5);

        Guanine guanine3 = new Guanine();
        guanine3.setACRTbase("2");
        guanine3.setWight(45);

        nucleosides.add(adenine);
        nucleosides.add(adenine2);
        nucleosides.add(guanine1);
        nucleosides.add(guanine2);
        nucleosides.add(cytosine);
        nucleosides.add(cytosine2);
        nucleosides.add(thymine);
        nucleosides.add(guanine3);

        List<Nucleoside> result = developer.findAllAdenineCytosine(nucleosides);

        assertEquals(guanine1, result.get(0));
        assertEquals(guanine3, result.get(1));
        assertEquals(adenine2, result.get(2));

    }

    @Test
    public void getAllACRTBasesFromListDistinct() {
        List<Nucleoside> nucleosides = new ArrayList<>();

        Adenine adenine = new Adenine();
        adenine.setWight(10);
        adenine.setACRTbase("AC+");

        Adenine adenine2 = new Adenine();
        adenine2.setWight(11);
        adenine2.setACRTbase("11");

        Guanine guanine1 = new Guanine();
        guanine1.setACRTbase("AC+");

        Guanine guanine2 = new Guanine();
        guanine2.setACRTbase("2");

        Cytosine cytosine = new Cytosine();
        cytosine.setACRTbase("CC");
        cytosine.setWight(11);

        Thymine thymine = new Thymine();
        thymine.setACRTbase("AC+");

        Cytosine cytosine2 = new Cytosine();
        cytosine2.setACRTbase("AC-");
        cytosine2.setWight(5);

        Guanine guanine3 = new Guanine();
        guanine3.setACRTbase("2");


        nucleosides.add(adenine);
        nucleosides.add(adenine2);
        nucleosides.add(guanine1);
        nucleosides.add(guanine2);
        nucleosides.add(cytosine);
        nucleosides.add(cytosine2);
        nucleosides.add(thymine);
        nucleosides.add(guanine3);

        List<String> result = developer.getAllACRTBasesFromListDistinct(nucleosides);

        assertEquals("AC+", result.get(0));
        assertEquals("11", result.get(1));
        assertEquals("2", result.get(2));
        assertEquals("CC", result.get(3));
        assertEquals("AC-", result.get(4));
    }
}