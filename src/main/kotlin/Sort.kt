
class Sorter(val strategy: (list: List<Int>)->List<Int>) {
    fun sort(list: List<Int>) = strategy(list)
}

fun selectionSort(list: List<Int>): List<Int> {
    val mutableList = list.toMutableList()
    mutableList.forEachIndexed { index, _ ->
        val min = mutableList.subList(index, mutableList.size).withIndex().minBy { v -> v.value }
        if (mutableList[index] > min!!.value) {
            mutableList.swap(index, min.index + index)
        }
    }
    return mutableList.toList()
}
