fun main() {
val car = Car("legacy","Subaru", "white", "30")
car.carry(40,30)
car.identity()
    car.fees(4)
val bus= Bus("legacy","matatu","blue","45")
    bus.maxTripFare(50.0,45)
    bus.fees(3,45)
}
/*
1. Create a class Car with the following attributes: make, model, color, capacity.
It has these functions:
 */
open class Car(var make:String, var model:String, var color:String, var capacity:String){
    /*
    - carry(people: Int) : Prints out “Carrying $people passengers” if the
number of people is within its capacity else it prints out “Over capacity
by $x people” where x is the number of people exceeding its capacity
(3 points)
     */
    fun carry(people:Int, capacity:Int){
        var x = people - capacity
       if(people <=capacity){
           println("Carrying $people passengers")
       }
        else{
           (people > capacity)
           println("Over capacity by $x poeple")


       }

    }
    /*
    - identity() : Prints out the color, make and model in the following
format e.g: “I am a white subaru legacy” (1 point)
- calculateParkingFees(hours: Int) : Calculates and returns the
parking fees by multiplying the hours by 20 (1 point)
     */
fun identity(){
    println("I am a $color $model $make")
}
    fun fees(hours:Int){
        var x = hours*20
        println(x)

    }
}/*
2. Create a class Bus with the same attributes and functions as the Car class.
        */
class Bus(make:String,model:String, color:String,capacity:String):Car(make,model,color,capacity){
    /*
    In addition, it has another method called maxTripFare(fare: Double) that
calculates and returns the maximum amount of fare that can be collected per
trip. (2 points)
     */
 fun maxTripFare(fare: Double, capacity:Int):Double{
     println(fare*capacity)
     return (fare*capacity)
 }
    /*
    The bus’ calculateParkingFees method returns the product of hours and
the capacity of the bus (3 points)
     */
    fun fees(hours: Int,capacity: Int){
        println(hours*capacity)
    }
}