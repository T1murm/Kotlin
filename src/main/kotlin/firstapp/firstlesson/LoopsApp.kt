package firstapp.firstlesson

fun main(){
    for(i in 0 .. 9){
        print(i)
    }
    println()
    val array1= arrayOf(1,5,7)
    array1.forEach { element -> print(element) }
    println()

    var index=0
    while (index !=3){
        print(array1[index])
        index=index+1
    }

}


