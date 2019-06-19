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

    private fun selectionSort(list: List<Int>): List<Int> {
        val mutableList = list.toMutableList()
        (0 until mutableList.size).map {
            val min = mutableList.subList(it, mutableList.size).withIndex().minBy { v->v.value }
            if (mutableList[it] > min!!.value) {
                mutableList.swap(it, min.index)
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