package cd.get.ready.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class ArrayRotatorTest {

    @Test
    public void testOne(){
        ArrayRotator rotator = new ArrayRotator();
        int rotateAmount = 4;
        int[] inputArray = {1, 2, 3, 4, 5};

        int[] actual = rotator.rotateLeft(inputArray, rotateAmount);
        int[] expected = {5, 1, 2, 3, 4};

        Assert.assertArrayEquals(expected, actual);

    }

    @Test
    public void testTwo(){
        ArrayRotator rotator = new ArrayRotator();
        int rotateAmount = 10;
        int[] inputArray = {41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51};

        int[] actual = rotator.rotateLeft(inputArray, rotateAmount);
        int[] expected = {77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84, 77};

        Assert.assertArrayEquals(expected, actual);

    }

}