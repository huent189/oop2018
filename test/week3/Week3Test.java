package week3;

import org.junit.Test;
import static org.junit.Assert.*;
public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax(){
        assertEquals(2, Week3.max(2, -1));
        assertEquals(4, Week3.max(4, 1));
        assertEquals(-1, Week3.max(-3, -1));
        assertEquals(6, Week3.max(4, 6));
        assertEquals(2, Week3.max(2, 2));
    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinOfArray(){
        int[] array1 = {4,5,7,8,9,3,2,1,3,4,25};
        assertEquals(1, Week3.minOfArray(array1));

        int[] array2 = {0,1,2,3,4,5,8};
        assertEquals(0, Week3.minOfArray(array2));

        int[] array3 = {-2,3,4,-2,5,8,8};
        assertEquals(-2, Week3.minOfArray(array3));

        int[] array4 = {4,5,7,8,3,4,25, -100, 5, 5};
        assertEquals(-100, Week3.minOfArray(array4));

        int[] array5 = {1,4,5,7,3,2,1,3,4,25,0};
        assertEquals(0, Week3.minOfArray(array5));
    }
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testBMI(){
        assertEquals("Bình thường", Week3.calculateBMI(67.7, 1.9));
        assertEquals("Thiếu cân", Week3.calculateBMI(53.0, 1.7));
        assertEquals("Bình thường", Week3.calculateBMI(48.36, 1.6));
        assertEquals("Thừa cân", Week3.calculateBMI(42.0, 1.3));
        assertEquals("Béo phì", Week3.calculateBMI(64, 1.6));
    }
}
