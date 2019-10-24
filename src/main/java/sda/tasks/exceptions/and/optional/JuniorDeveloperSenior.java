package sda.tasks.exceptions.optional;

import java.util.List;
import java.util.Optional;

public class JuniorDeveloperSenior {
    public String something = "";

    /**
     * Wrap provided Object with Optional
     */
    public Optional<Object> wrapProvidedValueWithOptional(Object obj) {
        return null;
    }

    /**
     * return "default" if object inside optional not exists
     * return String if present
     */
    public String returnWordDefaultIfOptionalEmpty(Optional<String> optString) {
        return null;
    }


    /**
     * create List with optional string. Add 3 elements to it.
     */
    public List<Optional<String>> createListOptString() {
        return null;
    }

    /**
     * create empty optional
     */
    public Optional createEmptyOptional() {
        return null;
    }

    /**
     * if Optional ifPresent, then change value something to "1"
     * Use only method ifPresent
     * ifPresent
     */
    public void ifOptionalPresentMakeChangeSomething(Optional<Object> objOpt) {

    }
}
