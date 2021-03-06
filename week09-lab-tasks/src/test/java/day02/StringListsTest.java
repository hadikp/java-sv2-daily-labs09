package day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {

    @Test
    void testShortestWords() {
        List<String> words = Arrays.asList("aaa", "aa", "bb", "cccc", "dd");
        StringLists stringLists = new StringLists();
        List<String> result = Arrays.asList("aa", "bb", "dd");
        assertEquals(result, stringLists.shortestWords(words));

    }

}