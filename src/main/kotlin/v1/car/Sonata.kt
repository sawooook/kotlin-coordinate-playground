package v1.car

class Sonata(
    private val inputFee: Int
) : Car() {

    override fun getDistancePerLiter(): Double = 10.0

    override fun getTripDistance(): Double = inputFee.toDouble()

    override fun getName(): String = "Sonata"
}