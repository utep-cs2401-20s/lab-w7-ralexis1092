import static org.junit.jupiter.api.Assertions.*;

class SortofSortTester {

    @org.junit.jupiter.api.Test
    void sortOfSortTest1() {
        int[] array = {1,2,3,4,5,6,7,8};
        int[] result = {6,5,2,1,3,4,7,8};
        SortofSort.sortOfSort(array);
        assertArrayEquals(result,array);
    }
}