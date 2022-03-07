fun main() {
    array()
    digits()
    capital()
    var y=identity(arrayOf("Faith","Mercy","Kirigo","Grace"))
    println(y)

}
fun array(){
    var persons= arrayOf("Wataita","Men","Children","Macharia")
    println(persons.contentToString())
}

fun digits(){
    var nums = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var o= nums.get(1)
    var p=nums.get(6)
    var sum= o+p
    println(sum)
    println(nums[11])
    println(nums.sorted())
}
fun capital(){
    var cities= arrayOf("harare","mumbai","dodoma","jakarta")
    cities.forEach { capital ->
        println(capital.capitalize())
    }
}
fun identity(get:Array<String>):String{
    var names= get.contentToString()
    return names
}