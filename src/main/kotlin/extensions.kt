fun <T> MutableList<T>.swap(i: Int, j: Int){
    val tmp = this[i]
    this[i] = this[j]
    this[j] = tmp
}