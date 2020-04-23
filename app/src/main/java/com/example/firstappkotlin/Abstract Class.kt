/**
 * Abstract Class
 */
abstract class Vehicle {
    // regular variable
    var name : String = "Not Specified"
    // abstract variable
    abstract var medium : String
    // regular function
    fun runsWhere() {
        println("The vehicle, $name, runs on $medium")
    }
    // abstract function
    abstract fun howItRuns()
}

/**
 * inheriting abstract class
 */
class Aeroplane : Vehicle() {
    // override abstract variables and functions of the
    // abstract class that is inherited
    override var medium: String = "air"

    override fun howItRuns() {
        println("Aeroplane fly based on buoyancy force.")
    }

}

fun main(args: Array<String>) {
    var vehicle1 = Aeroplane()
    vehicle1.howItRuns()
}