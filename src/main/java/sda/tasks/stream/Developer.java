package sda.tasks.stream;

import sda.tasks.stream.objects.Guanine;
import sda.tasks.stream.objects.Nucleoside;

import java.util.List;


/**
 * USE Stream API only!
 */
public class Developer {


    /**
     * Return List only with objects, that getACRTbase = "AC+"
     */
    public List<Nucleoside> findAllACRTBaseAc(List<Nucleoside> nucleosides) {
        return null;
    }


    /**
     * Add "A" to each element in list, and return updated list
     */
    public List<String> addAtoEachString(List<String> strings) {
        return null;
    }


    /**
     * Return Objects that are Adenine or Cytosine (in input list) with wight > 10
     */
    public List<Nucleoside> findAllAdenineCytosine(List<Nucleoside> nucleosides) {
        return null;
    }


    /**
     * Return List only with Guanine that getACRTbase = "2" (in input list)
     * Remember you can use .getClass of t or you can cast to (Something) t
     */
    public List<Guanine> findAllGuanineWithAcrtBase2(List<Nucleoside> nucleosides) {
        return null;
    }


    /**
     * Extract all ACRTBase from list of Nucleoside and return
     */
    public List<String> getAllACRTBasesFromListDistinct(List<Nucleoside> nucleosides) {
        return null;
    }


}

