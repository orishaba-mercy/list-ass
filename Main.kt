fun main() {
    val evenFriends = listOf("mercy","hope","anna","diana","julient","jacita","emma","loice","joy","tracy")
    println(evenFriends)
    number()
    val personName1=Person("mercy",23,5.5,60)
    val personName2=Person("hope",30,7.6,70)
    val personName3=Person("julient",19,7.6,50)
    val personName4=Person("joice",20,8.5,45)

    val personName= listOf<Person>(personName1,personName2,personName3,personName4)
//    val human=Person.sortedByDescending{ Person->Person.age }
//    println(human)

    val w = Vehicles("ubc123D",30)
    val j = Vehicles("ubM43D",50)
    val r = Vehicles("ukF569J",55)
    val t = Vehicles("ujkD886N",56)
    val allVehicles= listOf(w,j,r,t)
    println(vehicleList(allVehicles))



}
fun friends(friends:List<String>):List<String>{
    friends.forEachIndexed { index, m ->
        if (index % 2 ==0){
            println(m)
        }
    }
    return friends

}
// Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun number(){
    var num= mutableListOf(4.0,3.7,4.5,6.5,5.9)
    println(num.average())
    println(num.sum())


}

//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
class Person(var name:String,var age:Int,var height:Double,var weight:Int)


//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
fun addpple(topple:List<Person>):List<Any>{
    return listOf()
}
//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Vehicles(var registration:String, var mileage:Int)
fun vehicleList(vehicle:List<Vehicles>):Int{
    var avrg=0
    vehicle.forEach { new->new.mileage
        avrg+=new.mileage
    }
    var totalAvrg=vehicle.count()

    return totalAvrg
}
