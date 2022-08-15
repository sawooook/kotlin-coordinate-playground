package v1

import v1.car.Car

private const val NEWLINE = "\n"

class RentCompany(
    private val carList: MutableList<Car>
) {

    fun addCar(car: Car) = carList.add(car)

    fun generateReport(): String {
        var result = ""
        carList.map {
            result = result.plus("${it.getName()} : ${convertPerLiter(it.getChargeQuantity())}$NEWLINE")
        }

        return result
    }

    private fun convertPerLiter(ChargeQuantity: Double): String = "${ChargeQuantity.toInt()}리터"

    companion object {
        fun create(): RentCompany = RentCompany(mutableListOf())
    }
}
