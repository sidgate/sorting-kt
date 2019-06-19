class SelectionSort {
    companion object {
        fun sort(list: List<Int>): List<Int> {
            val mutableList = list.toMutableList()
            mutableList.forEachIndexed { index, _ ->
                val min = mutableList.subList(index, mutableList.size).withIndex().minBy { v -> v.value }
                if (mutableList[index] > min!!.value) {
                    mutableList.swap(index, min.index + index)
                }
            }
            return mutableList.toList()
        }
    }

}
fun <T> MutableList<T>.swap(i: Int, j: Int){
    val tmp = this[i]
    this[i] = this[j]
    this[j] = tmp
}