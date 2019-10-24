package sda.tasks.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class JuniorTest {

    private Junior junior = new Junior();

    @Test
    public void createStream() {
        assertThat(junior.createStream()).containsExactly("A", "B", "C");
    }


    @Test
    public void collectList() {
        assertEquals(new Integer(12), junior.collectList(Stream.of(12, 15)).get(0));
        assertEquals(new Integer(15), junior.collectList(Stream.of(12, 15)).get(1));
    }

    @Test
    public void needFirst() {
        assertEquals("C", junior.needFirst(Stream.of("C", "D")));
    }

    @Test
    public void howMany() {
        assertEquals(new Long(3), junior.howMany(Stream.of("C", "D", "F")));
    }

    @Test
    public void streamFromList() {
        List<String> list = new ArrayList<>();
        list.add("K");
        list.add("C");

        assertThat(junior.streamFromList(list)).containsExactly("K", "C");
    }
}