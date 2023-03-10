fun main() {
val car = Car("legacy","Subaru", "white",30)
    car.carry(40)
    car.identity()
    car.fees(4)
val bus= Bus("legacy","matatu","blue",60)
    bus.carry(55)
    bus.identity()
    bus.maxTripFare(50.0                                                                                                                          )
    bus.fees(3,)
}
/*
1. Create a class Car with the following attributes: make, model, color, capacity.
It has these functions:
 */
open class Car(var make:String, var model:String, var color:String, var capacity:Int){
    /*
    - carry(people: Int) : Prints out “Carrying $people passengers” if the
number of people is within its capacity else it prints out “Over capacity
by $x people” where x is the number of people exceeding its capacity
(3 points)
     */
   open fun carry(people:Int,){
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
     */
open fun identity(){
    println("I am a $color $model $make")
}
    /*
    - calculateParkingFees(hours: Int) : Calculates and returns the
parking fees by multiplying the hours by 20 (1 point)
     */
   open fun fees(hours:Int){
        var x = hours*20
        println(x)

    }
}/*
2. Create a class Bus with the same attributes and functions as the Car class.
        */
class Bus(make:String,model:String, color:String,capacity:Int):Car(make,model,color,capacity){
    override fun carry(people: Int,) {
        var x = people - capacity
        if(people <=capacity){
            println("Carrying $people passengers")
        }
        else{
            (people > capacity)
            println("Over capacity by $x poeple")


        }

    }

    override fun identity() {
        println("I am a $color $model $make")
    }
    /*
      The bus’ calculateParkingFees method returns the product of hours and
  the capacity of the bus (3 points)
       */
    override fun fees(hours: Int) {
        println(hours*capacity)
    }






    /*
    In addition, it has another method called maxTripFare(fare: Double) that
calculates and returns the maximum amount of fare that can be collected per
trip. (2 points)

     */
 fun maxTripFare(fare: Double,):Double{
     println(fare*capacity)
     return (fare*capacity)
 }


}