package line.domain

class Calculator(
    private val dotList: List<Dot>
) {

    fun getDistance(): Double =
        Line(dotList).getDistance()
}