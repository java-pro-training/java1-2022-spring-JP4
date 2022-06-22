package lv.lu.training.lesson6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddNumberLookupTest {
    private OddNumberLookup victim;

    @BeforeEach
    public void setUp(){
        victim = new OddNumberLookup();
    }

    @Test
    void shouldBeTrueForOddNumber(){
        boolean result = victim.isOdd(3);
        assertEquals(true, result);
    }

    @Test
    void shouldBeFalseForEvenNumber(){
        boolean result = victim.isOdd(4);
        assertEquals(false, result);
    }

}