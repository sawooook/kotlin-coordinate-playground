package v1

import v1.car.Car

class RentCompany {


    fun addCar(car: Car) {
    }

    fun generateReport(): String {

        return "TEST"
    }

    companion object {
        fun create(): RentCompany {
            return RentCompany()
        }
    }
}
