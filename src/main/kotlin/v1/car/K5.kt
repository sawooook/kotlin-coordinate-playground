package v1.car

class K5(
    private val inputFee: Int
) : Car {

    override fun getDistancePerLiter(): Double = 13.0

    override fun getTripDistance(): Double = inputFee.toDouble()

    override fun getName(): String = "K5"
}