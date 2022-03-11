fun main(){
    myList(arrayOf("Joan", "Wendy", "Velonica", "Lilian"))
    world()
    nums()
    var record = students(arrayOf("Winnie", "William", "Meghan"))
    println(record)


}
//a function that takes in 4 strings  and creates an array out of them then
//prints out the array

fun myList(name:Array<String>){
    var customers = name.contentToString()
    println(customers)
}

//a function that given an array below:
//var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//prints out the names of the cities in the correct grammatical case.

fun world(){
    var cities = arrayOf("harere","mumbai", "dodoma", "jakarta")
    for (caps in cities){
        println(caps.capitalize())
    }
}

//one function that given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//prints out the sum of the second and fifth elements

fun nums(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = numbers[2]+numbers[4]
    println(sum)

    //(prints out the index of 158
    println(numbers[11])

    //prints out the elements in ascending order
    var sortedNumbers2 =numbers.sortedArray()
    println(sortedNumbers2.contentToString() )
}

//a function that takes in 3 names and returns a string array containing
//all 3 names
fun students(name: Array<String>):String{
    var members =name.contentToString()
    return members

}