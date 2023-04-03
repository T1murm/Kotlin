package firstapp.firstlesson

fun getMax(a: Array<Int>): Int {
    var max = Int.MIN_VALUE
    for (i in a) {
        if (max<i){
            max=i
        }
    }
    return max
}

fun getMin(a: Array<Int>): Int {
    var min = Int.MAX_VALUE
    for (i in a) {
        if (min>i) {
            min = i
        }
    }
    return min
}

fun main() {
    val arr: Array<Int> = arrayOf(6, 3, 2, 5, 10)

    println("Minimum: ${getMin(arr)}\nMaximum: ${getMax(arr)}")

    val max: Int = getMax(arr)
    val min: Int = getMax(arr)
}
