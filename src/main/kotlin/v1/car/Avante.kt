package v1.car

class Avante(
    private val inputFee: Int
) : Car() {

    override fun getDistancePerLiter(): Double = 15.0

    override fun getTripDistance(): Double = inputFee.toDouble()

    override fun getName(): String = "Avante"
}