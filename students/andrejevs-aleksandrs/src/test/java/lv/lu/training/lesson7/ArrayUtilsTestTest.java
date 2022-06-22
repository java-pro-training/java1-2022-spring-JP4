package lv.lu.training.lesson7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Array;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTestTest {
    private ArrayUtils victim;

    @BeforeEach
    public void setUp() {
        victim = new ArrayUtils();
    }

    @Test
    public void shouldCreateArray() {
        int[] result = ArrayUtils.reverse(new int[]{1, 2, 3});
        assertArrayEquals(new int[]{3, 2, 1}, result);
    }


}