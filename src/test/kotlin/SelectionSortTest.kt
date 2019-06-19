import org.junit.Assert.assertEquals
import org.junit.Test

class SelectionSortTest {
    @Test fun testSortSingleElement(){
        assertEquals(listOf(1), selectionSort(listOf(1)))
    }

    @Test fun testSortedList(){
        assertEquals(listOf(1,2), selectionSort(listOf(1,2)))
    }

    @Test fun testUnsortedListOf2(){
        assertEquals(listOf(1,2), selectionSort(listOf(2,1)))
    }

    @Test fun testUnsortedListOf3(){
        assertEquals(listOf(1,2,3), selectionSort(listOf(3,2,1)))
    }

    @Test fun testRandomNumbers(){
        assertEquals(listOf(1,2,3,4,5,6,7,8,9), selectionSort(listOf(7,6,8,2,1,3,4,9,5)))
    }

    @Test fun testEmptyList(){
        assertEquals(emptyList<Int>(), selectionSort(emptyList()))
    }

    @Test fun testListWithDuplicateValues(){
        assertEquals(listOf(1,1,1,2,2,2,3,3,3), selectionSort(listOf(3,2,1,1,2,3,2,3,1)))
    }

    private fun selectionSort(list: List<Int>): List<Int> {
        val mutableList = list.toMutableList()
        mutableList.forEachIndexed{ index, _->
            val min = mutableList.subList(index, mutableList.size).withIndex().minBy { v->v.value }
            if (mutableList[index] > min!!.value) {
                mutableList.swap(index, min.index+index)
            }
        }
        return mutableList.toList()
    }
}

fun <T> MutableList<T>.swap(i: Int, j: Int){
    val tmp = this[i]
    this[i] = this[j]
    this[j] = tmp
}