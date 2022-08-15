package v1.car

interface Car {

    // 리터당 이동 거리. 연비
    fun getDistancePerLiter(): Double;

    // 여행 하려는 거리
    fun getTripDistance(): Double;

    // 차종의 이름
    fun getName(): String;

    // 주입해야할 연료량
    fun getChargeQuantity(): Double = getTripDistance() / getDistancePerLiter()
}