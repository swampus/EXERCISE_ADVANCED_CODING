package sda.tasks.exceptions.and.optional;

import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class JuniorDeveloperSeniorTest {

    private sda.tasks.exceptions.optional.JuniorDeveloperSenior juniorDeveloperSenior
            = new sda.tasks.exceptions.optional.JuniorDeveloperSenior();

    @Test
    public void returnOptionalOfProvidedValue() {
        Optional<Object> opt = juniorDeveloperSenior.wrapProvidedValueWithOptional("abc");
        assertEquals("abc", opt.get());
    }

    @Test
    public void returnWordDefaultIfOptionalEmpty() {
        assertEquals("abc",
                juniorDeveloperSenior.returnWordDefaultIfOptionalEmpty(Optional.of("abc")));

        assertEquals("default",
                juniorDeveloperSenior.returnWordDefaultIfOptionalEmpty(Optional.empty()));

    }

    @Test
    public void createListOptString() {
        List<Optional<String>> optList = juniorDeveloperSenior.createListOptString();
        assertEquals(3, optList.size());
    }

    @Test
    public void createEmptyOptional() {
        Optional opt = juniorDeveloperSenior.createEmptyOptional();
        assertFalse(opt.isPresent());
    }

    @Test
    public void ifOptionalPresentMakeChangeSomething() {
        juniorDeveloperSenior.ifOptionalPresentMakeChangeSomething(Optional.of("K"));
        assertEquals("1", juniorDeveloperSenior.something);
    }
}