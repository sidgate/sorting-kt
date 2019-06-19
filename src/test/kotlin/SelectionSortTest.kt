import org.junit.Assert.assertEquals
import org.junit.Test
import SelectionSort.Companion.sort

class SelectionSortTest {
    @Test fun testSortSingleElement(){
        assertEquals(listOf(1), sort(listOf(1)))
    }

    @Test fun testSortedList(){
        assertEquals(listOf(1,2), sort(listOf(1,2)))
    }

    @Test fun testUnsortedListOf2(){
        assertEquals(listOf(1,2), sort(listOf(2,1)))
    }

    @Test fun testUnsortedListOf3(){
        assertEquals(listOf(1,2,3), sort(listOf(3,2,1)))
    }

    @Test fun testRandomNumbers(){
        assertEquals(listOf(1,2,3,4,5,6,7,8,9), sort(listOf(7,6,8,2,1,3,4,9,5)))
    }

    @Test fun testEmptyList(){
        assertEquals(emptyList<Int>(), sort(emptyList()))
    }

    @Test fun testListWithDuplicateValues(){
        assertEquals(listOf(1,1,1,2,2,2,3,3,3), sort(listOf(3,2,1,1,2,3,2,3,1)))
    }


}
