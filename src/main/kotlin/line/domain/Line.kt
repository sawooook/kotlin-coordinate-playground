package line.domain

import kotlin.math.pow
import kotlin.math.sqrt

class Line(
    private val dotList: List<Dot>
) {

    fun getDistance(): Double {
        if (dotList.size == 1) {
            return 0.0
        }

        return sqrt(
            getCoordinate(dotList[0].x, dotList[1].x) + getCoordinate(dotList[0].y, dotList[1].y)
        )
    }

    private fun getCoordinate(coordinateA: Int, coordinateB: Int): Double =
        (coordinateA.toDouble() - coordinateB.toDouble()).pow(2)
}