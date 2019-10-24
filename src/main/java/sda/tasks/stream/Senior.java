package sda.tasks.stream;

import sda.tasks.stream.objects.DNA;
import sda.tasks.stream.objects.Nucleoside;

import java.util.List;
import java.util.Map;

/**
 * USE Stream API only
 */
public class Senior {

    /**
     * you have a list with nucleoside lists. That all should be set as list of nucleoside in DNA Object
     * (add all from all lists)
     */
    public DNA createDnaFromListOfNucleoside(List<List<Nucleoside>> nucleosides) {
        return null;
    }


    /**
     * Get all ACRTbase From all Guanine from all DNA (extract all Guanine from all chain of nucleoside)
     * it can be Null.. not need to extract and add Null
     */
    public List<String> extractAllACRTbaseFromAllDnaIfExists(List<DNA> dnas) {
        return null;
    }

    /**
     * You have DNA with list with Nucleoside, you need return 4 lists with different Nucleoside
     * 1 List = List<Adenine>
     * 2 List = List<Cytosine>
     * 3 List = List<Guanine>
     * 3 List = List<Thymine>
     */
    public List<List<Nucleoside>> extractAllNucleosideFromDNA(DNA dna) {
        return null;
    }

    /**
     * you have a list of maps where is String key, and List with strings as value
     * you need to find a longest string in that list and replace value in that map with it
     * return replaced structure
     */
    public List<Map<String, String>> replaceEachValueInMapWithLongestStringInList(
            List<Map<String, List<String>>> maps) {
        return null;
    }

    /**
     * return ACRTbase as KEY and Wight as Integer in MAP
     * If there are same ACRTBase replace it with oldValue_1 (+"_1") (+"_2") e.t.c
     * THAT ONE BADLY HARD
     */
    public Map<String, Integer> getAllACRTbaseAndWightAsMap(DNA dna) {
        return null;
    }


}
