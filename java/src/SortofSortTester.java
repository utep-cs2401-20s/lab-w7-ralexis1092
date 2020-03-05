import static org.junit.jupiter.api.Assertions.*;

class SortofSortTester {

    /*
     * sortOfSort:
     * Test case 1:
     * array: {1,2,3,4,5,6,7,8}
     *
     * Reason: This test case's purpose is to recreate a normal use of the sorting
     *         method with a sorted array.
     *
     * Results: The function did return the expected results within the array.
     *
     * Result: {6,5,2,1,3,4,7,8}
     */

    @org.junit.jupiter.api.Test
    void sortOfSortTest1() {
        //Initial array
        int[] array = {1,2,3,4,5,6,7,8};
        //Expected array
        int[] result = {6,5,2,1,3,4,7,8};

        SortofSort.sortOfSort(array);
        assertArrayEquals(result,array);
    }

    /*
     * sortOfSort:
     * Test case 2:
     * array: {6,5,2,1,3,4,7,8}
     *
     * Reason: This test case's purpose is to recreate a use of the sorting
     *         method with an array that has already been sorted by this method.
     *
     * Results: The function did return the expected results within the array
     *          since the array was already sorted.
     *
     * Result: {6,5,2,1,3,4,7,8}
     */

    @org.junit.jupiter.api.Test
    void sortOfSortTest2() {
        //Initial array
        int[] array = {6,5,2,1,3,4,7,8};
        //Expected array
        int[] result = {6,5,2,1,3,4,7,8};

        SortofSort.sortOfSort(array);
        assertArrayEquals(result,array);
    }

    /*
     * sortOfSort:
     * Test case 3:
     * array: {1,1,2,2,3,3,4,4}
     *
     * Reason: This test case's purpose is to recreate a use of the method in which
     *         the input array has multiple identical elements.
     *
     * Results: The function did return the expected results within the array and
     *          sorted the identical elements accordingly.
     *
     * Result: {3,3,1,1,2,2,4,4}
     */

    @org.junit.jupiter.api.Test
    void sortOfSortTest3() {
        //Initial array
        int[] array = {1,1,2,2,3,3,4,4};
        //Expected array
        int[] result = {3,3,1,1,2,2,4,4};

        SortofSort.sortOfSort(array);
        assertArrayEquals(result,array);
    }

    /*
     * sortOfSort:
     * Test case 4:
     * array: {-1,- 2,-3,-4,4,3,2,1}
     *
     * Reason: This test case's purpose is to recreate a use of the method in which
     *         the input array has both negative and positive integers.
     *
     * Results: The function did return the expected results within the array and
     *          sorted the negative elements accordingly.
     *
     * Result: {2,1,-3,-4,-2,-1,3,4}
     */

    @org.junit.jupiter.api.Test
    void sortOfSortTest4() {
        //Initial array
        int[] array = {-1,- 2,-3,-4,4,3,2,1};
        //Expected array
        int[] result = {2,1,-3,-4,-2,-1,3,4};

        SortofSort.sortOfSort(array);
        assertArrayEquals(result,array);
    }

    /*
     * sortOfSort:
     * Test case 5:
     * array: {1,20,2,40,3,-54,4,-23,2,-54,4,45,1}
     *
     * Reason: This test case's purpose is to recreate a use of the method in which
     *         the input array has both negative and positive integers, is
     *         an odd sized-array, and includes identical elements.
     *
     * Results: The function did return the expected results within the array and
     *          sorted all the elements accordingly.
     *
     * Result: {20,4,2,2,-23,-54,-54,1,1,3,4,40,45}
     */

    @org.junit.jupiter.api.Test
    void sortOfSortTest5() {
        //Initial array
        int[] array = {1,20,2,40,3,-54,4,-23,2,-54,4,45,1};
        //Expected array
        int[] result = {20,4,2,2,-23,-54,-54,1,1,3,4,40,45};

        SortofSort.sortOfSort(array);
        assertArrayEquals(result,array);
    }

}